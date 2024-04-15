package khalidmughal.chapter5.conversions;

public class NonPrimitiveConversionDemo {
    public static void main(String[] args) {
        Animal tommy = new Dog("Tommy Dog");
        Dog ruby = new Dog("Ruby Dog");
        Animal pussy = new Cat("Pussy Cat");

        sound(tommy);
        sound(pussy);

        /**
         * incompatible types, Error
         *
         * Dog d = tommy;
         * Dog dd = pussy;
         */
        Dog d = (Dog)tommy; // WE CALL IT TYPE CAST
        System.out.println(d); // "Tommy Dog"
        System.out.println(d instanceof Dog); // true

        if(pussy instanceof Dog) { // FALSE
            Dog dd = (Dog)pussy; //Cat cannot cast to Dog
            System.out.println(dd);
        } else {
            System.out.println("pussy is not instance/object of Dog class");
            System.out.println(pussy instanceof Dog); // false
        }
    }

    static void sound(Animal animal) {
        /**
         * Runtime polymorphism.
         *
         * Since JVM is deciding at runtime which class's method "sound" would be called.
         */
        animal.sound();
    }
}

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public abstract void sound();
    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("bark: bhau bhau... :) ");
    }
}
