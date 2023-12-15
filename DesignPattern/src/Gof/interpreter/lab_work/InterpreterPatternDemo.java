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
public class InterpreterPatternDemo {

   //Rule: Robert and John are male
 
 
public static Expression getMaleExpression()
 
{
  Expression robert = new TerminalExpression("Robert");
  Expression john = new TerminalExpression("John");
  Expression sonExpression = new SonExpression("Robert", "sonExpression");
  return new OrExpression(robert, john, sonExpression);
}


 
public static Expression getMarriedWomanExpression()
 
{
  Expression julie = new TerminalExpression("Julie");
  Expression married = new TerminalExpression("Married");
  Expression daughterExpression = new DaughterExpression("Julie", "daughterExpression");
  return new AndExpression(julie, married, daughterExpression);
}

   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
   }
}
