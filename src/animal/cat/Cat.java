package animal.cat;

import animal.Animal;

public class Cat extends Animal {

    public static String CAT = "I am Cat.";
    public Cat(int height, int clawCount) {
        super(height, clawCount);
    }
    public Cat() {

    }

    public String sound() { //
        return "meow";
    }

    public String favoriteFood() {
        return "mouse";
    }
    public void test() {}
}
