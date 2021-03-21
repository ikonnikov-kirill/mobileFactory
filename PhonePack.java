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
public class PhonePack {
        private MobilePhone blankMobilePhone;
        
    public PhonePack (MobilePhone mobilephone1) {
        System.out.println("new mobile pack created");
        
    }
    
    public void packMobile (MobilePhone mobilephone1) {
        blankMobilePhone=mobilephone1;
        System.out.println("mobile phone packined in a box");
    }
}
