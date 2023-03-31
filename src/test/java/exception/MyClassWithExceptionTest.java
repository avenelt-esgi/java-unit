package exception;

import org.junit.jupiter.api.Test;

public class MyClassWithExceptionTest {

    @Test
    public void testValidUser() {
        // Arrange
        MyClassWithException myClass = new MyClassWithException();
        String user = "testUser";

        // Act
        myClass.login(user);

        // Assert
        // Check no exception
    }

    @Test
    public void testInvalidUser() {
        // Arrange
        MyClassWithException myClass = new MyClassWithException();
        String user = "invalidUser";

        // Act
        myClass.login(user);

        // Assert
        // Check exception thrown
    }
}
