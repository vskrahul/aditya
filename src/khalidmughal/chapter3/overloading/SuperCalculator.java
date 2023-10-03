package khalidmughal.chapter3.overloading;

public class SuperCalculator {
    public byte sum(byte a, byte b) {
        System.out.println("sum(byte, byte) called.");
        return (byte)(a + b);
    }
    protected short sum(short a, short b) {
        System.out.println("sum(short, short) called.");
        return (short)(a + b);
    }
}
