package stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckBusinessWithoutDependenciesTest {

    @Test
    public void testSumWithoutPersistence() {
        // -- Arrange --
        Persistence persistenceStub = newEntry -> {};

        // -- Act --

        // -- Assert --
    }
}
