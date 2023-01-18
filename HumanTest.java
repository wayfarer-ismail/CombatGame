import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    static Being human;

    @BeforeAll
    static void instantiateHuman() {
        try {
            human = new Human("Bob", 10, 40);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testHuman() {
        Being h = new Human("Bob", 10, 40);

        assertEquals("Bob", h.getName());
        assertEquals(10, h.getSpeed());
        assertEquals(40, h.getWeight());
    }

    @Test
    public void testDefaultValues() {
        Being h = new Human("Bob", 10, 40);

        assertEquals(100, h.getHealth());
        //assertNull(h.getInventory());
    }

//    @Test
//    public void testGetters() {
//        assertEquals();
//    }

}