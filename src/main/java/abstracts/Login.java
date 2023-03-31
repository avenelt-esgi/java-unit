package abstracts;

public class Login {

    private String username;

    public Login() {
    }

    public void login(String user) {
        this.username = user;
    }

    private boolean userCanComputeMethod(String username) {
        return username.equals("allowed");
    }

    public boolean canCallMethod() {
        return this.username != null && userCanComputeMethod(username);
    }

    public String getUsername() {
        return this.username;
    }
}
