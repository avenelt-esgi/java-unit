package abstracts;

public class MyClass {

    private String username = null;


    /**
     * Logs the given user.
     * @param username the user to use
     */
    public void login(String username) {
        this.username = username;
    }

    /**
     * Computes the hash of a user.
     * @return the hash for the current user
     */
    public int hashUser() {

        if (this.username == null) {
            throw new IllegalStateException("The user must login first !");
        }

        if (!userCanComputeMethod(username)) {
            throw new IllegalArgumentException("The user " + username + " cannot perform this operation");
        }

        return username.hashCode();
    }

    private boolean userCanComputeMethod(String username) {
        return username.equals("allowed");
    }
}
