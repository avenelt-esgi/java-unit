package shared;

public class Dog {

    private int x;
    private int y;

    public Dog(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String sound() {
        return "Woof !";
    }
}
