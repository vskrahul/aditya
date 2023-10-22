package khalidmughal.chapter3.declaration;

import java.util.Arrays;

public class MainTest {
    /**
     *
     * Method to load java project by JRE
     *
     * 1. public - so that JRE can call it from outside of class
     * 2. static - so that JRE can call without making object
     * 3. void - this doesn't return anything
     * 4. main - specified by JRE
     * 5 String[] - command line arguments
     *
     * e.g.; "java khalidmughal.chapter3.declaration.MainTest A B 100 AnyValue"
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
