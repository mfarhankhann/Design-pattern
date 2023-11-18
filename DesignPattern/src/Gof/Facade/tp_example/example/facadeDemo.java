/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Facade.tp_example.example;

/**
 *
 * @author OSL
 */
public class facadeDemo {
    public static void main(String[]args){
    
        ShapeMaker shapemaker=new ShapeMaker();
        shapemaker.DrawCricle();
        shapemaker.DrawRectangle();
        shapemaker.DrawSquare();
    
    }
    
}
