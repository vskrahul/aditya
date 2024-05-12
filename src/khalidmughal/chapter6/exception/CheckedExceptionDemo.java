package khalidmughal.chapter6.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Checked exception:-
 * 1) Any Exception under Exception class which is not type of RuntimeException.
 * E.g.; IOException, FileNotFoundException
 *
 * 2) Checked exception must be handled using catch OR throw it out using throws keyword.
 *   IF both of these not done, you will get compilation error.
 *
 */
public class CheckedExceptionDemo {

    static void readDataFromFile() throws CustomCheckException {
        File f = new File("file path");
        try {
            FileInputStream is = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new CustomCheckException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readDataFromFile();
        } catch (Exception e) {
            System.out.println("file is not readable");
        }
    }
}


class CustomCheckException extends Exception {
    public CustomCheckException(String message) {
        super(message);
    }
}