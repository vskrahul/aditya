package khalidmughal.chapter3.array;

import java.util.Arrays;

public class Trials {

    /**
     * This method inserting randomly generated
     * values in the give array
     *
     * double[] dd = new double[10];
     * dd.length = 10;
     *
     * @param arr
     */
    public static void randomize(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] =  (int)(Math.random()*100);
        }
    }

    /**
     * Return the minimum value in the given array
     *
     * [5, 3, 2, 10, 1, 20, 100];
     *
     * byte = 1 byte or 8 bit // signed data type
     *
     * byte range: -128 to +127 (total 256 values)
     *
     * @param arr
     */
    public static int findMinimum(int[] arr) {
        //int MIN = Integer.MAX_VALUE;
        int MIN = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < MIN) {
                MIN = arr[i];
            }
        }
        return MIN;
    }

    public static void printVarArgs(int ...values) {
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + ", ");
        }
    }
    public static void printArr(int[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        randomize(arr);
        System.out.println(Arrays.toString(arr));

        int MIN = findMinimum(arr);
        System.out.println("Minimum value: " + MIN);

        printVarArgs();
        printVarArgs(1);
        printVarArgs(1, 2);
        printVarArgs(1, 3, 4);

        printArr(new int[]{1, 2, 4});
    }
}
