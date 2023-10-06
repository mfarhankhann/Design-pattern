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
    private static AbstractLogger getChainOfLogger(){
    
        AbstractLogger errorLogger= new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger filelogger= new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger= new Consolelogger(AbstractLogger.INFO);
        
        errorLogger.setNextLogger(filelogger);
        filelogger.setNextLogger(consoleLogger);
        
        return errorLogger;
        
    }
    public static void main(String[]args){
    AbstractLogger LoggerChain=getChainOfloggers();
    
    LoggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
    LoggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information");
    LoggerChain.logMessage(AbstractLogger.ERROR,"This is an error information");
    
    }

    private static AbstractLogger getChainOfloggers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
