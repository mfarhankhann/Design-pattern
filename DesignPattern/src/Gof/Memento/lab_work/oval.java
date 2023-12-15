/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Memento.lab_work;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author FA20-BSE-069
 */
public class oval extends BaseShape {
    private int radius;

    public oval(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 1;
    }

    @Override
    public int getHeight() {
        return radius * 1;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}