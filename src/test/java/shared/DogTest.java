package shared;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getY() {
        Dog dog = new Dog(1, 2);
        assertEquals(2, dog.getY());
    }

    @Test
    void getX() {
        Dog dog = new Dog(1, 2);
        assertEquals(1, dog.getX());
    }

    @Test
    void sound() {
        Dog dog = new Dog(1, 1);
        assertEquals("Woof !", dog.sound());
    }
}