package khalidmughal.chapter6.exception;

/**
 * Checked exception:-
 * 1) Any Exception which is subclass of RuntimeException class.
 * E.g.; NullPointerException
 *
 * 2) UnChecked exception not necessarily to be handled, compiler will not complaint if not handled.
 *
 */
public class UncheckedExceptionDemo {

    static String nullPointerDemo(String s) {
        try {
            return s.substring(0, 3);
        } catch (Exception e) {
            throw new CustomUnCheckedException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String validString = "something";
        String invalidString = null;
        System.out.println(nullPointerDemo(invalidString));
    }
}

class CustomUnCheckedException extends RuntimeException {
    public CustomUnCheckedException(String message) {
        super(message);
    }
}

