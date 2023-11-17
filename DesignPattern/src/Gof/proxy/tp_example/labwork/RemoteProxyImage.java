/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.proxy.tp_example.labwork;

/**
 *
 * @author fa20-bse-069
 */
public class RemoteProxyImage implements image{
    private String remoteSource;
    public RemoteProxyImage(String rSource){
        this.remoteSource = rSource;
    }
    @Override
    public void display(String rSource) {
        if(remoteSource.equals(rSource)){
            new RemoteImage().display(rSource);
        }
        else{
            System.out.println("Loaing image from fake source of type "+ rSource);
        }
    }
}
