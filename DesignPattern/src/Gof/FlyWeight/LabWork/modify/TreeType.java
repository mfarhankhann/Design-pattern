/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.FlyWeight.LabWork.modify;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author OSL
 */
class TreeType {
    private String name;
    private Color treeColor;
    private Color fruitTreeColor;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;
  public TreeType(String name, Color treeColor, Color fruitTreeColor, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.treeColor = treeColor;
        this.fruitTreeColor = fruitTreeColor;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public String getName() {
        return name;
    }

    public Color getTreeColor() {
        return isFruitTree ? fruitTreeColor : treeColor;
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

    public void draw(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, size);

        if (isFruitTree) {
            drawFruits(g, x, y - size);
        }

        g.setColor(getTreeColor());
        g.fillOval(x - size / 2, y - size, size, size);
    }

    private void drawFruits(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        for (int i = 0; i < countOfFruits; i++) {
            g.fillOval(x - 5 + i * 5, y - 10, 5, 5);
        }
    }
}

