/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Bridge.rg_example;

import Gof.Bridge.rg_example.devices.AC;
import Gof.Bridge.rg_example.devices.Tv;
import Gof.Bridge.rg_example.devices.Radio; 
import Gof.Bridge.rg_example.devices.Device;
import Gof.Bridge.rg_example.remotes.BasicRemote;
import Gof.Bridge.rg_example.remotes.AdvancedRemote;
import Gof.Bridge.rg_example.remotes.UniversalRemote;
import Gof.Bridge.rg_example.remotes.UniversalRemoteImpl;

/**
 *
 * @author fa20-bse-069
 */
public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
         testDevice(new AC());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
        
        System.out.println("Tests with universal remote.");
        UniversalRemote universalRemote = new UniversalRemoteImpl(device);
        universalRemote.power();
        universalRemote.maxVolume();
        device.printStatus();
    }
}
