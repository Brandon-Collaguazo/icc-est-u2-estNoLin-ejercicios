package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBSTTest {  // Cambiado de InsertBSTTest a InsertBST
    public Node insert(Node root, int value) {
        if(root == null) {
            return new Node(value);
        }

        if(value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if(value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    public void printTree(Node root) {
        printTreeNode2(root, "", true);
    }

    private void printTreeNode2(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }
}