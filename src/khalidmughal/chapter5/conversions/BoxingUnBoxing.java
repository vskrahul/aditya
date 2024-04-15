package khalidmughal.chapter5.conversions;

/**
 * Summary -
 * Boxing & UnBoxing refers to conversion of primitive
 * data to NonPrimitive reference variable.
 *
 * Here Box refers to NonPrimitive data type
 *
 * E.g.;
 * 1) byte to java.lang.Byte
 * 2) short to java.lang.Short
 * 3) int to java.lang.Integer
 *
 * Boxing -
 *  primitive ---> non-primitive
 *
 * UnBoxing -
 *  non-primitive ---> primitive
 */
public class BoxingUnBoxing {
    public static void main(String[] args) {
        //Boxing: PRIMITIVE  ----> NON-PRIMITIVE
        int i = 12;
        Integer ii = Integer.valueOf(i);

        //UnBoxing: NON-PRIMITIVE  ----> PRIMITIVE
        Integer xx = 100; // NON PRIMITIVE
        int x = xx.intValue(); // PRIMITIVE
    }
}