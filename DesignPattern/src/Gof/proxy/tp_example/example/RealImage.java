/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.proxy.tp_example.example;

/**
 *
 * @author fa20-bse-069
 */
public class RealImage implements image{
    
    private String filename;

    RealImage(String filename){
    this.filename=filename;
    loadfromdisk(filename);
    
    }
    private void loadfromdisk(String filename){
        
        System.out.println("Loading:"+filename);
        
    }
    
    public void display(){
        System.out.println("Displaying: "+filename);
    
    }
    
}
