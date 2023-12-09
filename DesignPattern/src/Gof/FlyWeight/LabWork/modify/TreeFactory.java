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

class TreeFactory {
    static java.util.Map<String, TreeType> treeTypes = new java.util.HashMap<>();

    public static TreeType getTreeType(String name, Color treeColor, Color fruitTreeColor, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, treeColor, fruitTreeColor, otherTreeData, isFruitTree, countOfFruits);
            treeTypes.put(name, result);
        }
        return result;
    }
}