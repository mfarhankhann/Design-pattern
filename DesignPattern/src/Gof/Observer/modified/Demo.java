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
public class Demo {

    public static void main(String[] args) {
        Commentary commentary = new Commentary();

        Subscriber subscriber = new SMSSubscriber("Shouzeb Hassan [Kohat]");
        commentary.subscribe(subscriber);

        Subscriber subscriber2 = new SMSSubscriber("Saim Jehangir [Nathiagali]");
        commentary.subscribe(subscriber2);

        commentary.setAvailable(true); // Notify subscribers about availability change

        // Simulate commentary updates
        commentary.setAvailable(false); // Notify subscribers about unavailability
    }
}

