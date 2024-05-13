package khalidmughal.chapter6.exception;

import java.io.IOError;

public class IndexOutOfBoundExceptionDemo {

    static int find(int[] arr, int idx) {
        /**
         * 1. Use multiple catch block when we have different error handling logic for each tyep of Exception
         * 2. Multiple Catch block must be define in child to parent class hierarchy

         */
        try {
            System.out.println("open connection");
            System.out.println("read data");
            int i = arr[idx];
            System.out.println("read some more data");
            System.out.println("close connection");
            return i;
        }  catch(ArrayIndexOutOfBoundsException e) {
            //task1
            System.out.println("index " + idx + " is out of range");
        } catch(StringIndexOutOfBoundsException e) {
            //task2
            System.out.println("caught StringIndexOutOfBoundsException");
        } catch(RuntimeException e) {
            //task3
        } catch (Exception e) {
            //default task
            System.out.println("caught Exception");
        } finally {
            System.out.println("this is final block");
        }
        return -1;
    }

    static int methodC(int[] arr, int idx) {
        return find(arr, idx);
    }

    static int methodB(int[] arr, int idx) {
        return methodC(arr, idx);
    }

    static int methodA(int[] arr, int idx) {
        return methodB(arr, idx);
    }

    public static void main(String[] args) {
        int v = methodA(new int[]{1, 2, 3}, 3);
        System.out.println(v);
    }
}
