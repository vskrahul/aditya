package animal;

import animal.cat.Cat;
import animal.dog.Dog;

public class AnimalTest {
    public static void main(String[] args) {


        System.out.println(Animal.ABCD);

        Animal cat = new Cat(5, 10);
        Animal dog = new Dog(12, 12);
        Cat cat1 = new Cat();

        System.out.println(cat.ABCD);

        System.out.println("Cat behavior");

        System.out.println(cat.sound());
        System.out.println(cat.favoriteFood());
        System.out.println("height = " + cat.getHeight());
        System.out.println(cat.getClawCount());

        System.out.println("\n\nDog behavior");

        System.out.println(dog.sound());
        System.out.println(dog.favoriteFood());
        System.out.println(dog.getHeight());
        System.out.println(dog.getClawCount());


        System.out.println(cat1.sound());
        System.out.println(cat1.favoriteFood());
        System.out.println("height = " + cat1.getHeight());
        System.out.println(cat1.getClawCount());
    }
}
