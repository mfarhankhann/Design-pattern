/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.FlyWeight.LabWork.modify;

/**
 *
 * @author OSL
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Forest extends JFrame {
    static int CANVAS_SIZE = 500;
    private java.util.List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color treeColor, Color fruitTreeColor, String otherTreeData,
                          boolean isFruitTree, int countOfFruits) {
        TreeType type = TreeFactory.getTreeType(name, treeColor, fruitTreeColor, otherTreeData, isFruitTree, countOfFruits);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}

