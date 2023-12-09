/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.FlyWeight.LabWork.modify;

import java.awt.Color;

/**
 *
 * @author OSL
 */
public class Demo {
    static int TREES_TO_DRAW = 100;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < TREES_TO_DRAW; i++) {
            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, Color.YELLOW, "Oak texture stub", false, 0);
            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
                    "Fruit Tree", Color.GREEN, Color.YELLOW, "Fruit tree texture", true, 5);
        }

        forest.setSize(Forest.CANVAS_SIZE, Forest.CANVAS_SIZE);
        forest.setVisible(true);
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
