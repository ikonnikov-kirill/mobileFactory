/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author workway
 */
public class MobileFactory {

    private ArrayList<MobileBody> bodyBatch = new ArrayList<>();
    private ArrayList<Monitor> monitorBatch = new ArrayList<>();
    private ArrayList<Battery> batteryBatch = new ArrayList<>();
    // 0 size, 1 price of body, 2 price of monitor, 3 battery capacity, 4 bat price
    private Double[][] mobileDetails = {{4.0, 4.7, 5.0, 5.3}, {5.0, 7.0, 10.0, 11.0},
    {4.0, 6.0, 5.0, 7.0}, {25.17, 14.85, 115.71, 74.11}, {67.0, 28.0, 125.0, 55.00}};
    private Random random = new Random();
    private MonitorDept oneMonitorDept;
    private AssemblyDept oneAssemblyDept;
    private PackDept onePackDept;
    private Storage oneStorage;

    public MobileFactory() {
        System.out.println("Mobile factory created");
        oneStorage = new Storage();
        onePackDept = new PackDept(oneStorage);
        oneAssemblyDept = new AssemblyDept(onePackDept);
        oneMonitorDept = new MonitorDept(oneAssemblyDept);
        oneStorage.storeConnect(oneMonitorDept, oneAssemblyDept);
        
    }

    public void newMobileBodyBatch() {
        bodyBatch.clear();
        int a = random.nextInt(32 - 21) + 21;
        System.out.println("New batch of mobile bodies created "+a);
        for (int i = 0; i < a; i++) {
            int b = random.nextInt(3 - 0) + 0;
            MobileBody oneBody = new MobileBody(mobileDetails[0][b], mobileDetails[1][b], null, null);
            bodyBatch.add(oneBody);
        }
    }

    public void newMobileMonitorBatch() {
        monitorBatch.clear();
        int a = random.nextInt(53 - 29) + 29;
        System.out.println("New batch of mobile monitors created "+a);
        for (int i = 0; i < a; i++) {
            int b = random.nextInt(3 - 0) + 0;
            Monitor oneMonitor = new Monitor(mobileDetails[0][b], mobileDetails[2][b]);
            monitorBatch.add(oneMonitor);

        }
    }

    public void newMobileBatteryBatch() {
        batteryBatch.clear();
        int a = random.nextInt(13 - 9) + 9;
        System.out.println("New batch of mobile batteries created "+a);
        for (int i = 0; i < a; i++) {
            int b = random.nextInt(3 - 0) + 0;
            Battery oneBattery = new Battery(mobileDetails[3][b], mobileDetails[4][b]);
            batteryBatch.add(oneBattery);
        }
    }

    public void newBatch() {
        System.out.println("New batches of mobile bodies, monitors and batteries created");
        newMobileBatteryBatch();
        newMobileMonitorBatch();
        newMobileBodyBatch();
        oneMonitorDept.batchTransferMonitor(bodyBatch, monitorBatch, batteryBatch);
    }
    
    public void check () {
        oneStorage.check();
    }
    
}
