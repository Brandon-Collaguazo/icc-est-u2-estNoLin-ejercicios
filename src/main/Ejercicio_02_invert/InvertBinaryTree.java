package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node leftInverted = invertTree(root.getLeft());
        Node rightInverted = invertTree(root.getRight());
        
        root.setLeft(rightInverted);
        root.setRight(leftInverted);
        
        return root;
    }
    
    public void printTree(Node root) {
        printTreeHelper(root, "", true);
    }
    
    private void printTreeHelper(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getValue());
            printTreeHelper(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTreeHelper(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}