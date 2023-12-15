/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.interpreter.lab_work;

/**
 *
 * @author FA20-BSE-069
 */
public class DaughterExpression implements Expression {

    private String mother;
    private String daughter;

    public DaughterExpression(String mother, String daughter) {
        this.mother = mother;
        this.daughter = daughter;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(mother) && context.contains(daughter) && context.indexOf(mother) < context.indexOf(daughter);
    }
}
