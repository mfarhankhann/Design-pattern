/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Observer.modified;

/**
 *
 * @author fa20-bse-069
 */
import java.util.ArrayList;

public  class Commentary implements Publisher {
    ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
    private boolean available;

    public void subscribe(Subscriber s) {
        if (!subscribers.contains(s)) {
            subscribers.add(s);
        }
    }

    public void unsubscribe(Subscriber s) {
        if (subscribers.contains(s)) {
            subscribers.remove(s);
        }
    }

    /**
     *
     */
    @Override
    public void notifySubscribers() {
//        subscribers.forEach((Subscriber s) -> {
//            s.update(this);
//        });

for (Subscriber s:subscribers){
s.update(this);
}
    }

    public void setAvailable(boolean available) {
        this.available = available;
        notifySubscribers();
    }

    public boolean isAvailable() {
        return available;
    }

    public void subsrcibe(Gof.Observer.Example.Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void unSubsrcibe(Gof.Observer.Example.Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    boolean isAvailable() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void subsrcibe(Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void unSubsrcibe(Subscriber s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


