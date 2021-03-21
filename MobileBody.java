/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileFactory;

import java.util.HashMap;

/**
 *
 * @author workway
 */
public class MobileBody {

    private Double size;
    private Double price;
    private Monitor monitor;
    private Battery battery;
    
    public MobileBody(Double size1, Double price1, Monitor monitor1, Battery battery1) {
    this.size=size1;
    this.price = price1;
    }

    public Double getSize() {
        return size;
    }

    public void setMonitor(Monitor monitor1) {
        monitor = monitor1;
    }

    public void setBattery(Battery battery1) {
        battery = battery1;
    }

//    public void setPack() {
//        pack = true;
//    }

}
