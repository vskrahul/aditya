package khalidmughal.chapter6.controlflow;

public class SwitchingFun {
    enum Spicefood{
        hot,cold,tasty,average;
    }

    public static void main(String[] args) {
        Spicefood food=Spicefood.average;
        switch(food){
            case hot:

                System.out.println("chilli patato");
                break;
            case cold:
                System.out.println("wine with ice");
                break;
            case tasty:
                System.out.println("this food is amazing");
                break;
            default:
                System.out.println("all are good");
                break;
        }
    }
    }

