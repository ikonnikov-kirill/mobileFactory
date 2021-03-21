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
public class Monitor {

    private Double size;
    private Double price;

    public Monitor(Double size1, Double price1) {
        this.size=size1;
        this.price = price1;
    }

    public Double getSize() {
        return size;
    }
}
