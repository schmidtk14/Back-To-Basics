import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashTableTests {

    @Test
    public void testAddRemove1(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        assertEquals(32, hash.remove("Test"));
    }

    @Test
    public void testAddRemove2(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(3, hash.remove("Rob"));
    }

    @Test
    public void testAddRemove3(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(16, hash.remove("Bob"));
    }

    @Test
    public void testAddRemove4(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(32, hash.remove("Test"));
    }

    @Test
    public void testAddGet1(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        assertEquals(32, hash.get("Test"));
    }

    @Test
    public void testAddGet2(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(3, hash.get("Rob"));
    }

    @Test
    public void testAddGet3(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(16, hash.get("Bob"));
    }

    @Test
    public void testAddGet4(){
        HashTable<String, Integer> hash = new HashTable<>();
        hash.add("Test", 32);
        hash.add("Bob", 16);
        hash.add("George", 10);
        hash.add("Rob", 3);
        assertEquals(32, hash.get("Test"));
    }
}
