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
public class proxyPatternDemo {
    
    public static void main(String []args){
        image Image=new ProxyImage("pakistan.jpg");
        
        //image will be load from disk
        Image.display();
        
        //image will not be load from the disk
        Image.display();
        
    
    }
    
}
