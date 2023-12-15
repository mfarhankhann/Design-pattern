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
public class SonExpression implements Expression {

    private String father;
    private String son;

    public SonExpression(String father, String son) {
        this.father = father;
        this.son = son;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(father) && context.contains(son) && context.indexOf(father) < context.indexOf(son);
    }
}
