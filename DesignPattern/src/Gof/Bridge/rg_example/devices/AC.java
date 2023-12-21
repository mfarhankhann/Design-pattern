/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Bridge.rg_example.devices;

/**
 *
 * @author fa20-bse-069
 */
public class AC implements Device {
    private boolean on = false;
    private int temperature = 25; // Default temperature

    @Override
    public boolean
 
isEnabled()
 
{
        return on;
    }

    @Override

    
public
 
void
 
enable()
 
{
        on = true;
    }

    @Override

    
public
 
void
 
disable()
 
{
        on = false;
    }

    @Override

    
public
 
int
 
getVolume()
 
{
        return 0; // Not applicable for AC
    }

    @Override
    public void setVolume(int volume) {
        // Do nothing, as volume is not applicable for AC
    }

    @Override
    public int getChannel() {
        return temperature;
    }

    @Override
    public void setChannel(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm AC.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current temperature is " + temperature + "°C");
        System.out.println("------------------------------------\n");
    }
}

