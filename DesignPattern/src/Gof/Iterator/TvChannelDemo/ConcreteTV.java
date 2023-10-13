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
public class ConcreteTV implements Gof.Iterator.TvChannelDemo.TV {
    private String[] channels={"CNN","ARY","Fox News","PTV Sports"};
    private Gof.Iterator.Iterator iterator;
    
    public ConcreteTV(){
        iterator = new ConcreteIterator();
    }
    @Override
    public Gof.Iterator. TvChannelDemo.Iterator getIterator(){
     return iterator;
    }
    
    public class ConcreteIterator implements Gof.Iterator.TvChannelDemo.Iterator{
        private int index=0;
        @Override
        public boolean hasMore(){
            if(index>=channels.length)
                return false;
            else
                return true;
        }
        @Override
        public String getNext(){
            return channels[index++];
        } 
    }
    
}
