/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverridingMethod;

/**
 *
 * @author WINDOWS 10
 */
class kucing extends hewan {
    
    @Override
    void setNama(){
        String kucing = "Cerberus";
        System.out.println("Nama Kucing: "+kucing);
    }
    @Override
    void setSuara(){
        String suara = "Miaow, Meow, Meong";
        System.out.println("Suara Kucing: "+suara);
    }
    void setBerat(){
        double berat = 2.0;
        System.out.println("Berat Kucing: "+berat+"Kg");
        
    }
    }
