package khalidmughal.chapter5.conversions;

public class PrimitiveConversionDemo {

    public static void main(String[] args) {

        short s = 129;


        // convert to byte (-128 to +127)
        /**
         * Java will not allow to narrow down the primitive values without casting.
         *
         * E.g.: byte b = s; // narrowing without casting.
         *
         * Use casting
         *
         * byte b = (byte)s; // narrowing with casting
         * Meaning - we are accepting possible loss of value conversion.
         */
        byte b = (byte)s;
        int i = s;

        System.out.println(String.format("short s = %d", s));
        System.out.println("byte b = (byte)s => " + b);
        System.out.println("int i = s => " + i);

    }
}
