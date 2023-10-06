/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.ChainOfResponsibility.chainPatternDemo;

/**
 *
 * @author OSL
 */
public class Databaselogger extends AbstractLogger {

    public Databaselogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        // Code to log the message to a database
        System.out.println("Database::Logger: " + message);
    }
}

