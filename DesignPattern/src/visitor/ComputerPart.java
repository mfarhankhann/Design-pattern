/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import visitor.ComputerPartVisitor;

/**
 *
 * @author fa20-bse-069
 */
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);

    void accept(ComputerPartVisitor computerPartVisitor);
}
