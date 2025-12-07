package com.codeswallah.designpatterns.flyweight.forest;

import com.codeswallah.designpatterns.flyweight.trees.Tree;
import com.codeswallah.designpatterns.flyweight.trees.TreeTypeFactory;
import com.codeswallah.designpatterns.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame  {
    private List<Tree> trees = new ArrayList<>();

    public Forest() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        // Fetching the flyweight object from the flyweight factory
        TreeType type = TreeTypeFactory.getTreeType(name, color, otherTreeData);
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
