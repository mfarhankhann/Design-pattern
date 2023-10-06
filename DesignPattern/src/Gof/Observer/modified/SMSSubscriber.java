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
public class SMSSubscriber implements Subscriber {
    String userInfo;

    public SMSSubscriber(String userInfo) {
        this.userInfo = userInfo;
    }

    public void update(Publisher publisher) {
        if (publisher instanceof Commentary) {
            Commentary commentary = (Commentary) publisher;
            if (commentary.isAvailable()) {
                System.out.println(this.toString() + ": The commentary is now available.");
            } else {
                System.out.println(this.toString() + ": The commentary is no longer available.");
            }
        }
    }

  
}
