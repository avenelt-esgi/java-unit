package mock2;

public interface Persistence {

    /**
     * Lists all persisted entries.
     * @return a non-ordered iterable collection of persisted entries
     */
    Iterable<Integer> listEntries();
}
