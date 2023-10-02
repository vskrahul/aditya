package khalidmughal.chapter3.declaration;

public class DeclarationDemo {

    public static void main(String[] args) {
        FakeInteger value1 = new FakeInteger(10);
        Integer value2 = new Integer(10);

        System.out.println("FakeInteger primitive = " + value1);
        System.out.println("Integer = " + value2);
    }
}
