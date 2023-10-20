/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.mediator.Example;

/**
 *
 * @author fa20-bse-069
 */
public class MediatorPatternDemo {
    public static void main(String [] args){
    User robert=new User("Robert");
    User john = new User("John");
    
    robert.sendMessage("hi! John!");
    john.sendMessage("Hello! Robert!");
    }
    
}
