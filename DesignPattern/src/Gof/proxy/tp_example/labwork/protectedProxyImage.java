/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.proxy.tp_example.labwork;

/**
 *
 * @author fa20-bse-069
 */
public class ProtectedProxyImage implements image{
    private String allowedUsers;
    private String userName;
    public ProtectedProxyImage(String userName){
        this.userName = userName;
        allowedUsers = "ali,fahad";
    }
    @Override
    public void display(String imageType) {
        if(allowedUsers.contains(userName)){
            System.out.println(userName + " authenticated.");
            new protectedImage().display(imageType);
        }
        else {
            System.out.println(userName + " not authenticated and display a fake image to him.");
        }
    }
}
