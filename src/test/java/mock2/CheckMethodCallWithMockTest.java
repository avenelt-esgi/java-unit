package mock2;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckMethodCallWithMockTest {

    @Test
    public void testAddingEntriesCallsThePersistence() {
        // -- Arrange --

        final AtomicBoolean stubMethodCalled = new AtomicBoolean(false);

        // -- Act --
        //myService.getEntries();

        // -- Assert --
        assertTrue(stubMethodCalled.get());
    }
}
