package stub;

/**
 * A simple program that adds two entries and persists the result.
 */
public class MyCalc {

    private final Persistence persistenceDelegate;

    public MyCalc(Persistence persistenceDelegate) {
        this.persistenceDelegate = persistenceDelegate;
    }

    /**
     * Sums the two given entries.
     * May also persist the result, depending on the given {@link Persistence} implementation.
     * @param firstEntry the first entry to add
     * @param secondEntry the second entry to add
     * @return the result of firstEntry + secondEntry
     */
    public int sum(int firstEntry, int secondEntry) {
        // compute the result
        int result = firstEntry + secondEntry;

        // persist the result
        this.persistenceDelegate.persist(result);

        // return the result
        return result;
    }
}
