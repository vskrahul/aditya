package khalidmughal.chapter6.controlflow;

public class ConstructorChaining {

    public ConstructorChaining() {

    }
    public static void main(String[] args) {

        Animal cat = new Cat("Pussy");
        Animal dog = new Dog("Tommy");
    }
}

/**
 * Abstract can not be instantiated.
 */
abstract class Animal {
    String name;
    public Animal() {
        System.out.println("Animal constructor");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal " + name);
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("Cat constructor");
    }
    public Cat(String name) {
        super(name);
        System.out.println("Cat " + this.name);
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog constructor");
    }
    public Dog(String name) {
        System.out.println("Dog " + this.name);
    }
}

