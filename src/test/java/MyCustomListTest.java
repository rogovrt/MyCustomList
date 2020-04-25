import org.junit.Test;

import static org.junit.Assert.*;

public class MyCustomListTest {

    @Test
    public void size() {
        MyCustomList list = new MyCustomList();
        assertEquals(0, list.size());
        list.add(2);
        list.add(3);
        assertEquals(2, list.size());
    }

    @Test
    public void isEmpty() {
        MyCustomList list = new MyCustomList();
        assertTrue(list.isEmpty());
        list.add(2);
        assertFalse(list.isEmpty());
    }

    @Test
    public void contains() {
        MyCustomList list = new MyCustomList();
        assertFalse(list.contains(0));
        list.add(10);
        assertTrue(list.contains(10));
        assertFalse(list.contains(9));
    }

    @Test
    public void add() {
        MyCustomList list = new MyCustomList();
        assertTrue(list.add(5));
    }

    @Test
    public void remove() {
        MyCustomList list = new MyCustomList();
        list.add(3);
        assertTrue(list.remove(3));
        assertFalse(list.remove(42));
    }

    @Test
    public void containsAll() {
        MyCustomList list = new MyCustomList();
        MyCustomList list1 = new MyCustomList();
        list.add(2);
        list.add(7);
        list.add(5);
        list1.add(2);
        list1.add(7);
        assertFalse(list.containsAll(list1));
        list1.add(5);
        assertTrue(list.containsAll(list1));
    }

    @Test
    public void containsSublist() {
        MyCustomList list = new MyCustomList();
        MyCustomList list1 = new MyCustomList();
        list.add(2);
        list.add(7);
        list.add(5);
        list1.add(2);
        list1.add(7);
        assertTrue(list.containsSublist(list1));
        list1.add(2);
        assertFalse(list.containsSublist(list1));
    }

    @Test
    public void get() {
        MyCustomList list = new MyCustomList();
        list.add(2);
        assertEquals(2, list.get(0));
        assertNull(list.get(1));
    }
}