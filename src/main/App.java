package main;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // Código del estudiante
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        
        // Ejercicio 1
        System.out.println("\n=== EJERCICIO 1: INSERCIÓN EN BST ===");
        InsertBSTTest bst = new InsertBSTTest();
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        
        System.out.println("Insertando valores: [5, 3, 7, 2, 4, 6, 8]");
        for (int value : values) {
            root = bst.insert(root, value);
        }
        
        System.out.println("\nÁrbol resultante:");
        bst.printTree(root);
        
        // Ejercicio 2
        System.out.println("\n=== EJERCICIO 2: INVERSIÓN DE ÁRBOL BINARIO ===");
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        Node root2 = new Node(4);
        root2.setLeft(new Node(2));
        root2.setRight(new Node(7));
        root2.getLeft().setLeft(new Node(1));
        root2.getLeft().setRight(new Node(3));
        root2.getRight().setLeft(new Node(6));
        root2.getRight().setRight(new Node(9));

        System.out.println("Árbol original:");
        invertBinaryTree.printTree(root2);

        Node invertedRoot2 = invertBinaryTree.invertTree(root2);
        System.out.println("\nÁrbol invertido:");
        invertBinaryTree.printTree(invertedRoot2);

        //Ejercicio 3
        System.out.println("===Ejercicio 3===");
        ListLevels listLevels = new ListLevels();
        Node root3 = new Node(4);
        root3.setLeft(new Node(2));
        root3.setRight(new Node(7));
        root3.getLeft().setLeft(new Node(1));
        root3.getLeft().setRight(new Node(3));
        root3.getRight().setLeft(new Node(6));
        root3.getRight().setRight(new Node(9));
        listLevels.printLevels(root3);

        //Ejercicio 4
        System.out.println("===Ejercicio 4===");
        Depth depth = new Depth();
        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        root4.getLeft().getLeft().setLeft(new Node(8));
        System.out.println("Profundidad del árbol: " + depth.maxDepth(root4));
    }
}