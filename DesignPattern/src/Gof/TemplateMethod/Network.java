/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.TemplateMethod;

/**
 *
 * @author fa20-bse-069
 */
public abstract class Network {
    String userName;
    String password;
    Network(){}
    
    public boolean post(String message){
    if(LogIn(this.userName,this.password)){
        boolean result = sendData(message.getBytes());
        LogOut();
        return result; 
    }
    return false;
    }
    
    
    abstract boolean LogIn(String userName,String Password );
    abstract boolean sendData(byte[]data);
    abstract void LogOut();
    
}
