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
public class PackDept {
  
    private Storage oneStorage;
    
    public PackDept (Storage storage) {
        System.out.println("Packing dept created");
        oneStorage=storage;
    }
    
    public void packDeptTranBody (ArrayList <MobileBody> body1) {
      ArrayList<PhonePack> mobilePhonePacked = new ArrayList<>();
        for (int i =0;i<body1.size(); i++){
          MobilePhone onePhone = new MobilePhone(body1.get(i));
          PhonePack onePhonePack = new PhonePack(null);
          onePhonePack.packMobile(onePhone);
          mobilePhonePacked.add(onePhonePack);
          
          
          
          
      }
      System.out.println("mobiles packed "+ body1.size());
      oneStorage.store(mobilePhonePacked);
    }
}
