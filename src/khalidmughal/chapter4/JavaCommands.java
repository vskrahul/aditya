package khalidmughal.chapter4;

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


    }
}
