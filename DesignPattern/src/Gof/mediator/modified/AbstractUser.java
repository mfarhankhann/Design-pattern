/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.mediator.modified;

/**
 *
 * @author fa20-bse-069
 */


import java.util.Date;

public class AbstractUser {

    private String name;

    public AbstractUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void showMessage(AbstractUser user, String message, AbstractUser... receivers) {
        String receiverNames = "";
        for (AbstractUser receiver : receivers) {
            receiverNames += receiver.getName() + ", ";
        }

        System.out.println(new Date() + " [" + user.getName() + "-> <" + receiverNames + "> ] : " + message);
    }

    // Other methods as needed...
}

