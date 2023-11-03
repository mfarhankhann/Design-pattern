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
public class OperationPower extends Handler {

    @Override
    public int computeInRange(int num1, int num2) {
        if (10000 <= num1 && num1 <= 200000 && 0 <= num2 && num2 <= 200000) {
            return (int) Math.pow(num1, num2);
        } else {
            return nextHandler.computeInRange(num1, num2);
        }
    }
}
