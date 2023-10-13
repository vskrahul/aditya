package khalidmughal.chapter3.enums;

public enum Drill {
    ATTENTION("Attention!"),
    EYES_RIGHT("Eyes right!"),
    EYES_LEFT("Eyes left!"),
    AT_EASE("At ease!");
    private String command;
    Drill(String command) {
        this.command = command;
    }

    /*@Override
    public String toString() {
        return this.command;
    }*/

    public static void main(String[] args) {
        System.out.println(ATTENTION);
        System.out.println(AT_EASE);
    }
}
