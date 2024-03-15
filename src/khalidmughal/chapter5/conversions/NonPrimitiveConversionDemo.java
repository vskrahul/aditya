package khalidmughal.chapter5.conversions;

public class NonPrimitiveConversionDemo {
    public static void main(String[] args) {
        Animal tommy = new Dog("Tommy Dog");
        Dog ruby = new Dog("Ruby Dog");
        Animal pussy = new Cat("Pussy Cat");

        /**
         * incompatible types, Error
         *
         * Dog d = tommy;
         * Dog dd = pussy;
         */
        Dog d = (Dog)tommy;
        System.out.println(d);
        System.out.println(d instanceof Dog); // true

        if(pussy instanceof Dog) {
            Dog dd = (Dog)pussy; //Cat cannot cast to Dog
            System.out.println(dd);
        } else {
            System.out.println("pussy is not instance/object of Dog class");
            System.out.println(pussy instanceof Dog); // false
        }
    }
}

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}
