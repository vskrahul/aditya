package khalidmughal.chapter3.declaration;

/**
 * we use final keyword for:-
 * 1. class (to restrict to override)
 * 2. method (to restrict to override)
 * 3. parameter/variable (to restrict to change the value)
 *
 * So that no one can override or change the value
 *
 *
 */
public class FinalParameter {

    public static void hello(final String name) {
        // this will give error
        //name = "something else";
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        hello("Aditya");
    }
}
