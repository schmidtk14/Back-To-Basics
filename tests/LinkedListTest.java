import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void appendTest1(){
        LinkedList list = new LinkedList();
        list.append(1);
        assertEquals("1", list.toString(list.head));

    }
    @Test
    public void appendTest2(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        assertEquals("1 2", list.toString(list.head));
    }

    @Test
    public void appendTest3(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(10);
        list.append(100);
        assertEquals("1 2 3 4 10 100", list.toString(list.head));
    }

    @Test
    public void pushTest1(){
        LinkedList list = new LinkedList();
        list.push(1);
        assertEquals("1", list.toString(list.head));
    }

    @Test
    public void pushTest2(){
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        assertEquals("2 1", list.toString(list.head));
    }

    @Test
    public void pushTest3(){
        LinkedList list = new LinkedList();
        list.push(1);
        list.push(2);
        list.push(10);
        list.push(100);
        assertEquals("100 10 2 1", list.toString(list.head));
    }

    @Test
    public void getValueAtIndexText1(){
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        assertEquals(0, list.getValueAtIndex(list.head, 0));
    }

    @Test
    public void getValueAtIndexText2(){
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        assertEquals(1, list.getValueAtIndex(list.head, 1));
    }

    @Test
    public void getValueAtIndexText3(){
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        assertEquals(2, list.getValueAtIndex(list.head, 2));
    }
    @Test
    public void getValueAtIndexText4(){
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(10);
        list.append(100);
        list.append(56);
        list.append(7);
        assertEquals(100, list.getValueAtIndex(list.head, 3));
    }

    @Test
    public void getValueAtIndexText5(){
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(10);
        list.append(100);
        list.append(56);
        list.append(7);
        assertEquals(7, list.getValueAtIndex(list.head, 5));
    }
}
