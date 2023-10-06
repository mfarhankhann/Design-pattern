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
public class ChainPatternDemo {
    private static AbstractLogger getChainOfloggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new Consolelogger(AbstractLogger.INFO);
        AbstractLogger databaseLogger = new Databaselogger(AbstractLogger.WARNING); // Add DatabaseLogger

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(databaseLogger); // Set DatabaseLogger as the next logger for consoleLogger

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfloggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
        loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning message"); // Log a warning message
    }
}
