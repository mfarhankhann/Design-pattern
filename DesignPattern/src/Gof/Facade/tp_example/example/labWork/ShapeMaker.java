/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Facade.tp_example.example.labWork;

/**
 *
 * @author OSL
 */
public class ShapeMaker {
    
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    
    public ShapeMaker(){
    circle = new Circle();
    rectangle =new Rectangle();
    square=new Square();
    
    
    }
    
    public void DrawCircle(){
    
        circle.draw("radius");
    
    }
    public void DrawRectangle(){
    rectangle.draw("Height","Width");
    }
    
    public void DrawSquare(){
    
    square.draw("length","height");
    }
    
}
