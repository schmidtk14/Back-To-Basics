import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd1(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(1);
        assertEquals("1", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testAdd2(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(1);
        bst.add(10);
        bst.add(2);
        assertEquals("1 2 10", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testAdd3(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(100);
        bst.add(8);
        bst.add(0);
        bst.add(1);
        assertEquals("0 1 8 100", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testDelete1(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(100);
        bst.add(8);
        bst.add(0);
        bst.add(1);
        bst.deleteKey(1);

        assertEquals("0 8 100", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testDelete2(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(100);
        bst.add(8);
        bst.add(0);
        bst.add(1);
        bst.deleteKey(0);

        assertEquals("1 8 100", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testDelete3(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(3);
        bst.add(4);
        bst.add(2);
        bst.add(30);
        bst.deleteKey(30);

        assertEquals("2 3 4 20", bst.toStringInOrder(bst.root));
    }

    @Test
    public void testSearch1(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(3);
        bst.add(4);
        bst.add(2);
        bst.add(30);

        assertTrue(bst.search(bst.root, 30));
    }

    @Test
    public void testSearch2(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(3);
        bst.add(4);
        bst.add(2);
        bst.add(30);

        assertTrue(bst.search(bst.root, 2));
    }

    @Test
    public void testSearch3(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(3);
        bst.add(4);
        bst.add(2);
        bst.add(30);

        assertTrue(bst.search(bst.root, 4));
    }

    @Test
    public void testSearch4(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(3);
        bst.add(4);
        bst.add(2);
        bst.add(30);

        assertFalse(bst.search(bst.root, 10));
    }



}
