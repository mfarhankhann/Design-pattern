/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.SubExpert_example;

/**
 *
 * @author OSL
 */
public class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light){
    this.light=light;
    }
    public void execute(){
    light.switchOn();
        System.out.println("Light is on");
    }
}
