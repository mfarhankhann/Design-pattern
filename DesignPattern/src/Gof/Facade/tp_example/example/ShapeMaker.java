/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Facade.tp_example.example;

/**
 *
 * @author OSL
 */
public class ShapeMaker {
    
    private Shape circle;
    private Shape square;
    private Shape rectangle;
    
    public ShapeMaker(){    
    circle=new Circle();
    square=new Square();
    rectangle=new Rectangle();
    
    }
    public void DrawCricle(){
        
        circle.draw();
        
       
        
    }
    public void DrawRectangle(){
        
        rectangle.draw();
    
    }
    public void DrawSquare(){
    
     square.draw();
     
    }
    
    
}
