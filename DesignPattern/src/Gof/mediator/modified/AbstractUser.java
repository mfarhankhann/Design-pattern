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

    public static void showMessage(AbstractUser user, String message, AbstractUser... receivers) {
        String recieverNames = "";
        for (AbstractUser receiver : receivers) {
            recieverNames += receiver.name() + ", ";
        }
        
        System.out.println(new Date() + " [" + user.name() +"-> <"+recieverNames+ "> ] : " + message);
    }

    private String name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sendMessage(String ali_Says_Hi_to_COMSATS_University, AbstractUser comsatsUniversity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void sendMessage(String ali_Says_Hi_to_many_at_the_same_time, AbstractUser comsatsUniversity, AbstractUser nustUniversity, AbstractUser aliTeacher, AbstractUser ahmadUser, AbstractUser zainUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
