/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.SubExpert_example;

/**
 *
 * @author OSL
 */
//reciver
//Receiver

// Receiver
public class Light {

    private boolean isOn;

    public void switchOn() {
        System.out.println("Light is being switched ON");
        isOn = true;
    }

    public void switchOff() {
        System.out.println("Light is being switched OFF");
        isOn = false;
    }

    public boolean isLightOn() {
        return isOn;
    }
}

