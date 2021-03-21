/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileFactory;

import java.util.ArrayList;

/**
 *
 * @author workway
 */
public class MonitorDept {

    private ArrayList<MobileBody> mobileBodyUnused = new ArrayList<>();
    private ArrayList<Monitor> monitorUnused = new ArrayList<>();
    private AssemblyDept oneAssemblyDept;

    public MonitorDept(AssemblyDept assemblyDept) {
        oneAssemblyDept = assemblyDept;
        System.out.println("Monitor dept created");
    }

    public void batchTransferMonitor(ArrayList<MobileBody> body1, ArrayList<Monitor> monitor2, ArrayList<Battery> battery3) {
        mobileBodyUnused.addAll(body1);
        body1.clear();
        monitorUnused.addAll(monitor2);

        for (int i = 0; i < mobileBodyUnused.size(); i++) {
            for (int j = 0; j < monitorUnused.size(); j++) {
// why comes back null?
                if (mobileBodyUnused.get(i).getSize() == monitorUnused.get(j).getSize()) {
                    mobileBodyUnused.get(i).setMonitor(monitorUnused.get(j));
                    body1.add(mobileBodyUnused.get(i));
                    System.out.println("mobily body " + mobileBodyUnused.get(i).getSize() + " matched to monitor "
                            + monitorUnused.get(j).getSize());
                    monitorUnused.remove(j);
                    mobileBodyUnused.remove(i);
                    break;
                }
            }
        }
        System.out.println("Monitor Dept mobile bodies left " + mobileBodyUnused.size());
        System.out.println("Monitor Dept monitors left " + monitorUnused.size());
        oneAssemblyDept.batchTransferBattery(body1, battery3);
    }
    
    public void check () {
        System.out.println("Monitor Dept mobile bodies unused left "+mobileBodyUnused.size());
        System.out.println("Monitor Dept monitors unused left  "+monitorUnused.size());
    }
    
    
}
