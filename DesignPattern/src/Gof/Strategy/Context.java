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
import Gof.Strategy.Handler;

public class Context {

    private Handler headHandler;

    public Context() {
        headHandler = new OperationAdd();
        headHandler.setNextHandler(new OperationSubtract());
        headHandler.setNextHandler(new OperationMultiply());
        headHandler.setNextHandler(new OperationDivide());
        headHandler.setNextHandler(new OperationPower());
    }

    public int compute(int num1, int num2) {
        return headHandler.computeInRange(num1, num2);
    }
}