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
public class Facebook extends Network {
    public Facebook(String userName,String password){
        this.userName=userName;
        this.password=password;
    }
    public boolean LogIn(String userName,String password){
        System.out.println("\Checking user's parameters");
        System.out.println("Name: "+this.userName);
        System.out.println("Password: ");
        for(int i =0;i<this.password.length();i++){
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }
    public boolean sendData(byte[]data){
    boolean messagePosted = true;
    if(messagePosted){
        System.out.println("Message: "+new String(data)+"'was posted on Facebook");
        return true;
    }else{
        return false;
    }
    }
    public void LogOut(){
        System.out.println("User: '"+userName+"'was logged out from Facebook");
    }
    private void simulateNetworkLatency(){
    try{
        int i=0;
        System.out.println();
        while(i<10){
            System.out.println(".");
            Thread.sleep(500);
            i++;
        }
    }catch(InterruptedException ex){
    ex.printStackTrace();
    }
    }
}
