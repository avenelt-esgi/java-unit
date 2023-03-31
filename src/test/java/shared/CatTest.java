package shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

   @Test
    void getY() {
        Cat cat = new Cat (1, 2);
        assertEquals(2, cat.getY());
    }

    @Test
    void getX() {
        Cat  cat = new Cat (1, 2);
        assertEquals(1, cat.getX());
    }

    @Test
    void sound() {
        Cat cat = new Cat(1, 1);
        assertEquals("Meow !", cat.sound());
    }
}