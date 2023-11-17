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
public class ProxyImage implements image{

    private String filename;
    private RealImage realimage;
    
    ProxyImage(String filename){
        this.filename=filename;
    }
    
    
    
@Override
public void display(){
    if(realimage==null){
        realimage=new RealImage(filename);
    }
    realimage.display();
   

}
    
}