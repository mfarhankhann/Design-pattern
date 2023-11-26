/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Command.SubExpert_example;

/**
 *
 * @author OSL
 */
public class RemoteControl {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void presButton(){
        command.execute();
    }
}
