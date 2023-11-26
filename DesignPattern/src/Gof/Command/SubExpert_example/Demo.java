/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.SubExpert_example;

/**
 *
 * @author OSL
 */
public class Demo {
    public static void main(String [] args){
    Light light=new Light();
    Command lightOn=new LightOnCommand(light);
    Command lightOff= new LightOffCommand(light);
    
    command.setCommand(lightOn);
    control.pressButton();
    
    control.setCommand(lightOff);
    control.pressButton();
    }
    
}
