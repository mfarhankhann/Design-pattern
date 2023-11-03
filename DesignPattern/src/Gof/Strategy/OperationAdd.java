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
public class OperationAdd extends Handler {

    @Override
    public int computeInRange(int num1, int num2) {
        if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
            return num1 + num2;
        } else {
            return nextHandler.computeInRange(num1, num2);
        }
    }
}
