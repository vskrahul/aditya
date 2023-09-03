package animal;

abstract public class Animal {
    private int height;
    private int clawCount;
    public static String ABCD = "I am static property of Animal Class.";

    public Animal(int height, int clawCount) {
        this.height = height;
        this.clawCount = clawCount;
    }
    public Animal() {

    }

    public abstract String sound(); //declaration, because not curly braces is there
    public abstract String favoriteFood();
    public int getHeight() {
        return this.height;
    }
    public int getClawCount() {
        return this.clawCount;
    }
}
