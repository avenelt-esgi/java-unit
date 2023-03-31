package exception;

public class Main {

    public static void main(String[] args) {

        MyClassWithException myClass = new MyClassWithException();

        if (myClass.login(args[0])) {
            System.out.println("User connected : " + myClass.getUser());
        } else {
            System.out.println("Cannot login user");
        }
    }
}
