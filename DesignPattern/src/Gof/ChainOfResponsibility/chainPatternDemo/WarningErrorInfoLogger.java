/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.ChainOfResponsibility.chainPatternDemo;

/**
 *
 * @author OSL
 */
public class WarningErrorInfoLogger extends AbstractLogger {

    public WarningErrorInfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        // Log the message
        System.out.println("Warning-Error-Info Logger: " + message);
    }
}

