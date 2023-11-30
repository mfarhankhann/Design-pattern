/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.SubExpert_example;

/**
 *
 * @author OSL
 */
// New Concrete Command
public class LightReplaceCommand implements Command {

    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        // Turn off the light
        light.switchOff();
        System.out.println("Replacing the light...");

        // Replace the light (you can add specific logic for replacement here)

        // Turn on the new light
        light.switchOn();
        System.out.println("New light is on");
    }
}
