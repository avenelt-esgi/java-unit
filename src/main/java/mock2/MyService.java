package mock2;

/**
 * This is the main service for my application.
 */
public class MyService {

    private final Persistence persistenceDelegate;

    /**
     * Creates an instance using the given persistence driver.
     * @param persistenceDelegate the persistence driver to use as a delegate
     */
    public MyService(Persistence persistenceDelegate) {
        this.persistenceDelegate = persistenceDelegate;
    }

    /**
     *  Gets a list of all persisted entries using the {@link Persistence} delegate.
     *  Depending on the {@link Persistence} implementation, no assumption can be made on the ordering of data.
     * @return an iterable of entries retrieved from the persistence.
     */
    public Iterable<Integer> getEntries() {

        // delegate to the persistence
        return this.persistenceDelegate.listEntries();
    }


}
