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
public class AndExpression implements Expression {
	 
   private Expression expr1 = null;
   private Expression expr2 = null;

   public AndExpression(Expression expr1, Expression expr2) { 
      this.expr1 = expr1;
      this.expr2 = expr2;
   }

    AndExpression(Expression julie, Expression married, Expression daughterExpression) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
   public boolean interpret(String context) {		
      return expr1.interpret(context) && expr2.interpret(context);
   }
}