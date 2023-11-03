/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Strategy;

/**
 *
 * @author fa20-bse-069
 */
public abstract class Handler {
    protected Handler nextHandler;
    
    public void  setNextHandler(Handler nextHandler){
        this.nextHandler=nextHandler;
    }
    public abstract int computeInRange(int num1,int num2);
    
}
