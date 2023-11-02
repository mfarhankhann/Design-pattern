/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import Gof.Visitor.ComputerPart;
import Gof.Visitor.ComputerPartVisitor;
import Gof.Visitor.Keyboard;
import Gof.Visitor.Monitor;
import Gof.Visitor.Mouse;

/**
 *
 * @author fa20-bse-069
 */
public class Computer implements ComputerPart {
	
   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   } 


  
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}