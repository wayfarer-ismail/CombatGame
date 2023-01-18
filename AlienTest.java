import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    @Test
    public void testAlien() {
        Being a = new Alien("Zoop", 9, 0.4f);

        assertEquals("Zoop", a.getName());
        assertEquals(9, a.getSpeed());
        assertEquals(0.4, a.getWeight());
    }



}