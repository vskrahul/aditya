package khalidmughal.chapter6.controlflow;

public class Digits {
    public static void weather(int month){
        switch (month){
            case 1: case 2: case 3: case 4:
                System.out.println("weather will normal");
                break;
            case 5: case 6: case 7: case 8:
                System.out.println("in four waether can be hoty and rainy ");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("winter will be come");
                break;
            default:
                System.out.println("enjoy every month with wisky ");
                break;
        }
    }

    public static void main(String[] args) {
        weather(13);
    }
}
