/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.ChainOfResponsibility.chainPatternDemo;

/**
 *
 * @author fa20-bse-069
 */
public class Consolelogger extends AbstractLogger{
    public Consolelogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message){
        System.out.println("Standard console::logger: "+ message);
    }
    
}
