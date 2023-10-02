package khalidmughal.chapter3.declaration;

public class FakeInteger {
    private final int value;
    public FakeInteger(int value) {
        this.value = value;
    }

    //extra useful method

    public String toString() {
        return "" + value;
    }
}
