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
public class ProxyImage implements image {

    private RealImage realImage;
    private String imageType;
    private String supportedTypes;
    private String fileName;

    public ProxyImage(String fileName, String imageType){
        this.fileName = fileName;
        this.imageType = imageType;
        supportedTypes = "png,svg";
    }

    @Override
    public void display(String imageType) {
        if(supportedTypes.contains(imageType)){
            realImage = new RealImage(fileName);
            realImage.display(imageType);
        }
        else{
            System.out.println("Displaying fake version of "+imageType);
        }
    }
}