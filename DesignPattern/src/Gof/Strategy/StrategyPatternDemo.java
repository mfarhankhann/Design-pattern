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
     public static void main(String[] args) {
        Context context = new Context();

        int result = context.compute(10, 20); // Addition
        System.out.println(result); // 30

        result = context.compute(2000, 1000); // Subtraction
        System.out.println(result); // 1000

        result = context.compute(5000, 1000); // Multiplication
        System.out.println(result); // 5000000

        result = context.compute(10000, 5000); // Division
        System.out.println(result); // 2

        result = context.compute(20000, 10); // Power
        System.out.println(result); // 2000000000
    }
    
}
