package interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateTest {

    @Test
    public void testConcatenate() {
        // Arrange
        Concatenate concatenate = new MyConcat();

        // Act
        String result = concatenate.concat("a message split", " in two parts");

        // Assert
        assertEquals("a message split in two parts", result);
    }
}
