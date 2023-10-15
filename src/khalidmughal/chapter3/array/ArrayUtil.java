package khalidmughal.chapter3.array;

/**
 * 1. Declaration
 * - We are just declaration a variable of type array, nothing is being created in the memory
 *
 * 2. Initialization with SIZE
 * - Array of given SIZE being created in the memory
 * - How to calculate the SIZE of array?
 *  -> size of single element of array type * SIZE
 *  -> e.g.; int[] arr = new int[10];
 *  -> 4 bytes * 10 = 40 bytes (memory consumption)
 *
 *  3. Initialization anonymously
 *  e.g.;
 *    -> int[] arr = {1, 2, 3, 4};
 *    -> int[] arr = int []{1, 2, 3, 4};
 *  - We don't declare SIZE
 *  - Size of array will be equal to number of values given anonymously.
 *  - SIZE = 4, memory = 4*4 = 16 bytes
 *
 *  How to use array?
 *
 */
public class ArrayUtil {
    /**
     * array is collection of elements/data in linear or list with contiguous memory address
     */
    //declaration
    int[] declaration;
    // declaration + initialization
    int[] intArr = new int[10]; // index 0 to 9
    // declaration + initialization
    Integer[] integerArr = new Integer[10];
    // declaration + initialization
    int[] emptyIntArray = new int[10]; // primitive array, default value is 0
    // declaration + initialization
    Integer[] emptyIntegerArray = new Integer[10]; // class array, default value is null

    // declaration + anonymously initialization
    String[] strArray = {"Aditya"};


    public ArrayUtil() {
        for(int i = 0; i < 10; i++) {
            intArr[i] = i + 1; // intArr[0] = value;
            integerArr[i] = i + 1;
        }
        //intArr[9] = 100;
        // we are not defining size in this type of declaration
        declaration = new int[]{1, 2, 3, 5};
    }

    static void toString(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
    static void toString(Object[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        toString(arrayUtil.declaration);
        toString(arrayUtil.intArr);
        toString(arrayUtil.integerArr);
        System.out.println(arrayUtil.emptyIntArray.length);
        toString(arrayUtil.emptyIntArray);
        toString(arrayUtil.emptyIntegerArray);
    }
}
