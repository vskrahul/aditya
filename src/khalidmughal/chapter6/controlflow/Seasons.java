package khalidmughal.chapter6.controlflow;

public class Seasons {
    public static void temperature(int temp){
        switch(temp){
            case -0:
                System.out.println("ice seasons");
                break;
            case 2:
                System.out.println("winter seasons");
                break;
            case 10:
                System.out.println("normal seasons");
                break;
            case 22:
                System.out.println("starting summer");
                break;
            case 40:
                System.out.println("seasons hot");
                break;
            default:
                System.out.println("rainy");
                break;
        }
    }

    public static void main(String[] args) {
        temperature(22);
    }
}
