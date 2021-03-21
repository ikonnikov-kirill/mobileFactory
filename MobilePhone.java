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
public class MobilePhone {
    private MobileBody blankMobileBody;
    
    public MobilePhone (MobileBody mobileBody1) {
        System.out.println("mobile created");
        blankMobileBody=mobileBody1;
    }
}
