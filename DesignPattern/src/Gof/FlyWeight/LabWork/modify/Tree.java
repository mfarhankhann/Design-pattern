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

class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        int treeSize = calculateTreeSize(); // Calculate the size based on the y coordinate
        type.draw(g, x, y, treeSize);
    }

    private int calculateTreeSize() {
        // Adjust the size based on the y coordinate
        if (y > 2 * Forest.CANVAS_SIZE / 3) {
            return TreeSize.LARGE.getSize();
        } else if (y > Forest.CANVAS_SIZE / 3) {
            return TreeSize.MEDIUM.getSize();
        } else {
            return TreeSize.SMALL.getSize();
        }
    }
}

enum TreeSize {
    SMALL(10),
    MEDIUM(20),
    LARGE(30);

    private final int size;

    TreeSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
