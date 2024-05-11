package khalidmughal.chapter6.controlflow;

import java.util.Arrays;

public class Test  {

    public static void main(String[] args) {

        int a = 1; // 3
        int b = 2; // 1
        a = a + b; // 1 + 2 = 3
        b = a - b; // 3 - 2 = 1
        a = a - b; // 3 - 1 = 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);




        int[] arr = {5, -2, 3, 0, -1, -8, 4};

        //put 0 in the center but order of -ive & +ive number should not change in the array
        // {5, -2, 3, 0, -1, -8, 4} --> { -2, -1, -8, 0, 5, 3, 4}
        System.out.println("Original : " + Arrays.toString(arr));
        int[] futureArray = placeTheNumberInCenter(arr);
        System.out.println("Updated : " + Arrays.toString(futureArray));
    }

    /**
     * put Given in the center but order of -ive & +ive number should not change in the array
     *
     * @param arr
     */
    static int[] placeTheNumberInCenter(int[] arr) { // O(N) + O(N) = O(2N) ==> O(N)

        // find future index of 0 = (count of -ive number)
        int futureIdxOfCenter = 0;
        for(int i = 0; i < arr.length; i++) { // O(N)
            // -ive number
            if(arr[i] < 0) {
                futureIdxOfCenter++;
            }
        }

        // start iterating the array with two pointers
        // -ive pointer (x) & +ive pointer (y)
        int x = 0;
        int y = futureIdxOfCenter + 1;

        // If we add -ive number increase x++
        // If we add +ive number increase y++
        int[] futureArray = new int[arr.length]; // extra array memory consumption O(N)

        for(int i = 0; i < arr.length; i++) { // O(N)
            if(arr[i] < 0) {
                futureArray[x] = arr[i];
                x++;
            } else if(arr[i] > 0) {
                futureArray[y] = arr[i];
                y++;
            }
        }
        return futureArray;
    }

}
