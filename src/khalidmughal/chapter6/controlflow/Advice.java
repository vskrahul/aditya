package khalidmughal.chapter6.controlflow;

public class Advice {
    enum Letadvice{
        good,better,morethanbetter,normaly
    }

    public static void main(String[] args) {
        Letadvice ad=Letadvice.better;
        switch(ad){
            case good:
                System.out.println("good for education");
                break;
            case better:
                System.out.println("better advice for bussiness");
                break;
            case morethanbetter:
                System.out.println("morethanbetter advice for bussineess");
                break;
            default:
                System.out.println("all advice are failer");
                break;
        }
    }
}
