/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Iterator.TvChannelDemo;

/**
 *
 * @author fa20-bse-069
 */
public class Demo {
    
    public static void main(String[]args){
        Gof.Iterator.TV tv=new ConcreteTV();
        
        Gof.Iterator.Iterator it = tv.getIterator();
    
        while(it.hasMore()){
            System.out.println("My Tv is playing "+it.getNext()+"now");
        }
    }
    
}
