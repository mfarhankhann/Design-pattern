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
public class RemoteImage implements image{
    @Override
    public void display(String actualSource) {
        System.out.println("Loaing image from actual source "+actualSource);
    }
}