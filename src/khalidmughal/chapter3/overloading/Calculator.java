package khalidmughal.chapter3.overloading;

public class Calculator extends SuperCalculator {
    int sum(int a, int b) {
        System.out.println("sum(int, int) called.");
        return a + b;
    }
    private int sum(int a, int b, int c) {
        System.out.println("sum(int, int, int) called.");
        return a + b + c;
    }
    private long sum(long a, long b) throws RuntimeException {
        System.out.println("sum(long, long) called.");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //range of byte: -128 to 127
        byte byte1 = 127;
        byte byte2 = 126;

        short short1 = 1;
        short short2 = 2;

        long long1 = 1;
        // to make any number long we should add small letter of "L"
        long long2 = 2147483648l;

        System.out.println(calculator.sum(byte1, byte2));
        System.out.println(calculator.sum(short1, short2));
        //by default these arguments considered as int
        //not data type defined for these numbers
        System.out.println(calculator.sum(12, 13));
        System.out.println(calculator.sum(long1, long2));


    }
}
