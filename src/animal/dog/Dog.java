package animal.dog;

import animal.Animal;

public class Dog extends Animal {

    public Dog(int height, int clawCount) {
        super(height, clawCount);
    }
    public String sound() {
        return "bark";
    }

    public String favoriteFood() {
        return "milk";
    }
}
