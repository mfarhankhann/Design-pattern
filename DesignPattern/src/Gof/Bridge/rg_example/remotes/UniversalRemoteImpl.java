/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Bridge.rg_example.remotes;

/**
 *
 * @author fa20-bse-069
 */
import Gof.Bridge.rg_example.devices.Device;
public class UniversalRemoteImpl extends BasicRemote implements UniversalRemote {

    public UniversalRemoteImpl(Device device) {
        super(device);
    }

    @Override
    public void maxVolume() {
        System.out.println("Remote: setting max volume");
        device.setVolume(100);
    }
}
