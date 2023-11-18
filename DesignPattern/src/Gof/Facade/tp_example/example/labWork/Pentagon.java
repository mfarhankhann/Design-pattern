/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Facade.tp_example.example.labWork;

/**
 *
 * @author OSL
 */
public class Pentagon implements Shape{
    
    @Override
    public void draw(String... args){
        
        StringBuilder result = new StringBuilder("Drawing with arguments: ");
        
        for(String arg: args){
        result.append(arg).append(",");
        
        }
        System.out.println(result.substring(0,result.length()-1));
    
    }
    
}
