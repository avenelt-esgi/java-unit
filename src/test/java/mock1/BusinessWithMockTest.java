package mock1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class BusinessWithMockTest {

    @Test
    public void testNextDayComputesTomorrow() {
        // Arrange
        //LocalDate today = LocalDate.of(2020, Month.DECEMBER, 31);
        MyLocalClock myLocalClock = new MyLocalClock();

        // Act
        LocalDate result = myLocalClock.nextDay();

        // Assert
        LocalDate expected = LocalDate.of(2021, Month.JANUARY, 01);
        Assertions.assertEquals(expected, result, "The next day is not tomorrow !");
    }
}
