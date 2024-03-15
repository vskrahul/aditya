package khalidmughal.chapter4;

import static khalidmughal.chapter4.SystemInfo.ONE;

public class JavaCommands {
    public static void main(String[] args) {
        System.out.println("src/animal > javac JavaCommands.java");
        System.out.println("src > java animal.JavaCommands");

        System.out.println("If class has dependency in other packages");
        System.out.println("src > javac animal/AnimalTest.java");
        System.out.println("src > java animal.AnimalTest");

        //overloading example
        System.out.println(true);
        System.out.println('a');
        System.out.println("string");
        System.out.println(100);


       /* System.out.println(SystemInfo.ONE);
        System.out.println(ONE);*/


    }
}
