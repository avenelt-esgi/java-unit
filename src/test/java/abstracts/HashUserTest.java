package abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashUserTest {

    @Test
    public void testHashUser() {
        // Arrange
        MyClass myClass = new MyClass();
        String testUser = "myUser";

        // Act
        int result = myClass.hashUser();

        // Assert
        assertEquals(testUser.hashCode(), result);

    }
}
