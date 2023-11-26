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
public record University(String name) extends AbstractUser {
    
    public void sendMessage(String message, AbstractUser... users) {
        ChatRoom.showMessage(this, message, users);
    }
}