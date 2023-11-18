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
    private Shape triangle;
    private Shape pentagon;
    
    public ShapeMaker(){
    circle = new Circle();
    rectangle =new Rectangle();
    square=new Square();
    triangle=new Triangle();
    pentagon = new Pentagon();
    
    
    }
    
    public void DrawCircle(String... args){
    
        circle.draw(args);
    
    }
    public void DrawRectangle(String... args){
    rectangle.draw(args);
    }
    
    public void DrawSquare(String... args){
    
    square.draw(args);
    }
    public void DrawTriangle(String... args){
    
        triangle.draw(args);
    }
    public void DrawPentagon(String... args){
    
    pentagon.draw(args);
    }
    
}
