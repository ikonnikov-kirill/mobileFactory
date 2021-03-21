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
public class AssemblyDept {

    private ArrayList<MobileBody> mobileBodyUnused = new ArrayList<>();
    private ArrayList<Battery> batteryUnused = new ArrayList<>();
    private PackDept onePackDept;

    public AssemblyDept(PackDept packDept) {
        onePackDept = packDept;
        System.out.println("Assembly dept created");
    }

    public void batchTransferBattery(ArrayList<MobileBody> body1, ArrayList<Battery> battery3) {

        mobileBodyUnused.addAll(body1);
        body1.clear();
        batteryUnused.addAll(battery3);

        for (int i = 0; i < mobileBodyUnused.size(); i++) {
            if (batteryUnused.isEmpty()) {
                System.out.println("no spare batteries");
                break;
            }

            for (int j = 0; j < batteryUnused.size(); j++) {
                mobileBodyUnused.get(i).setBattery(batteryUnused.get(j));
                body1.add(mobileBodyUnused.get(i));
                System.out.println("mobily body " + mobileBodyUnused.get(i).getSize() + " matched to battery capacity "
                        + batteryUnused.get(j).getBatteryDescr());
                batteryUnused.remove(j);
                mobileBodyUnused.remove(i);
                break;
            }
        }
        System.out.println("Assembly Dept mobile bodies left "+mobileBodyUnused.size());
        System.out.println("Assembly Dept mobile batteries left "+batteryUnused.size());
        onePackDept.packDeptTranBody(body1);
    }
    
    public void check () {
        System.out.println("Assembly Dept mobile bodies unused left "+mobileBodyUnused.size());
        System.out.println("Assembly Dept batteries unused left  "+batteryUnused.size());
    }
}
