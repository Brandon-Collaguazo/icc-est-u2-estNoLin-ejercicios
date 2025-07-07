package test.Ejercicio_01_insert;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Materia.Models.Node;

public class InsertBSTTest {
    @Test
    public void testBSTInsertion() {
        main.Ejercicio_01_insert.InsertBSTTest bst = new main.Ejercicio_01_insert.InsertBSTTest();
        Node root = null;
        
        // Insertar valores
        root = bst.insert(root, 5);
        root = bst.insert(root, 3);
        root = bst.insert(root, 7);
        root = bst.insert(root, 2);
        root = bst.insert(root, 4);
        root = bst.insert(root, 6);
        root = bst.insert(root, 8);

        // Verificar estructura
        assertEquals(5, root.getValue());
        assertEquals(3, root.getLeft().getValue());
        assertEquals(7, root.getRight().getValue());
        assertEquals(2, root.getLeft().getLeft().getValue());
        assertEquals(4, root.getLeft().getRight().getValue());
        assertEquals(6, root.getRight().getLeft().getValue());
        assertEquals(8, root.getRight().getRight().getValue());
    }
}