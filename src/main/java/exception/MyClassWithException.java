package exception;

public class MyClassWithException {

    private String user;

    public boolean login(String username) {

        if (username.equals("testUser")) {
            user = username;
            return true;
        } else {
            throw new RuntimeException();
        }
    }

    public String getUser() {
        return user;
    }
}
