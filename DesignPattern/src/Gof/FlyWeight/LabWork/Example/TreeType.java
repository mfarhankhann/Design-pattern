/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.FlyWeight.LabWork.Example;

/**
 *
 * @author fa20-bse-069
 */
import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String getOtherTreeData() {
        return otherTreeData;
    }

    public boolean isFruitTree() {
        return isFruitTree;
    }

    public int getCountOfFruits() {
        return countOfFruits;
    }

   
   public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);

        if (isFruitTree) {
            // Draw fruits for fruit trees
            drawFruits(g, x, y);
        }

        g.setColor(getColor()); // Set the color based on whether it's a fruit tree or not

        g.fillOval(x - 5, y - 10, 10, 10);
    }
    private void drawFruits(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        for (int i = 0; i < countOfFruits; i++) {
            g.fillOval(x - 5 + i * 5, y - 20, 5, 5);
        }
    }
}
