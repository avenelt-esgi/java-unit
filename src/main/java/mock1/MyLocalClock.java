package mock1;

import java.time.LocalDate;

/**
 * A local instance for a {@link Clock} using the day set on the local machine.
 */
public class MyLocalClock implements Clock {

    private final LocalDate now = LocalDate.now();

    @Override
    public LocalDate nextDay() {
        return now.plusDays(1);
    }
}
