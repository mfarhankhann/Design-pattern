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
public class protectedImage implements image {
    @Override
    public void display(String imageType) {
        System.out.println("Displaying image for correct user of Type "+imageType);
    }
}
