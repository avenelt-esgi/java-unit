package mock1;

import java.time.LocalDate;

public interface Clock {

    /**
     * Computes the next day after the current one.
     * @return the day for tomorrow
     */
    LocalDate nextDay();
}
