/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.mediator.Example;

/**
 *
 * @author fa20-bse-069
 */
import java.util.Date;
public class ChatRoom {
    public static void showMessage(Gof.mediator.Example.User user, String message){
    System.out.println(new Date().toString()+" [" + user.getName()+ "] : "+message);
    }
}

