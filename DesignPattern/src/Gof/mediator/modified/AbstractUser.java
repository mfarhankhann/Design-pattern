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

public class ChatRoom {

    public static void showMessage(AbstractUser user, String message, AbstractUser... receivers) {
        String recieverNames = "";
        for (AbstractUser receiver : receivers) {
            recieverNames += receiver.name() + ", ";
        }
        
        System.out.println(new Date() + " [" + user.name() +"-> <"+recieverNames+ "> ] : " + message);
    }
}
