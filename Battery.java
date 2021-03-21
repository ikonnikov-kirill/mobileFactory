/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileFactory;

/**
 *
 * @author workway
 */
public class Battery {

    private Double capacity;
    private Double price;

    public Battery(Double capacity1, Double price1) {
        this.capacity=capacity1;
        this.price=price1;
    }

    public Double getBatteryDescr() {
        return capacity;
    }

}
