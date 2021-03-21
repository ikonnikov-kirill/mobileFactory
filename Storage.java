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
public class Storage {

    private ArrayList<PhonePack> mobileStorage = new ArrayList<>();
    private MonitorDept sumMonitorDept;
    private AssemblyDept sumAssemblyDept;
    

    public Storage() {
        
        System.out.println("Storage dept created");
    }

    public void store(ArrayList<PhonePack> body1) {
        mobileStorage.addAll(body1);
        System.out.println("mobiles stored " + body1.size());
    }
    
    public void storeConnect (MonitorDept monitorDept1, AssemblyDept assemblyDept1) {
       sumMonitorDept=monitorDept1;
        sumAssemblyDept=assemblyDept1; 
    }
    
    // run details of whats left unused in monitor and assembly
    
    public void check () {
        sumAssemblyDept.check();
        sumMonitorDept.check();
    }
}
