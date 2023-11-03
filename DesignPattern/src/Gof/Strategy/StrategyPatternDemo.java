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
public class StrategyPatternDemo {
    public static void main(String []args){
        Context context=new Context(new OperationAdd());
        System.out.println("23+33="+context.executeStrategy(23, 33));
        context = new Context(new OperationSubtract());
        System.out.println("12-3="+context.executeStrategy(12,3));
    
    }
    
}
