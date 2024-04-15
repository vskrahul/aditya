package khalidmughal.chapter6.controlflow;

public class ControlFlow {

    /**
     * IF condition
     *  {
     *      //condition true
     *      //IF BLOCK EXECUTION
     *  } else {
     *      //condition false
     *      //ELSE BLOCK EXECUTION
     *  }
     *
     *  NOTE:-
     *
     *  condA => (cond1 && cond2 && cond3)
     *  condA => true, only IF all sub-conditions will be true
     *
     *  condB => ((cond1 && cond2) || cond3)
     *    cond1 && cond2 - group1
     *    cond3          - group2
     *    They are connected with || (OR)
     */
    public static void eligibleClassForAdmissionUsingIfElse(int age) {
        if(age > 2 && age < 5) {
            System.out.println("pre school eligible");
        } else if(age > 5 && age <= 8) {
            System.out.println("elementary school eligible");
        } else if(age > 8 && age <= 14) {
            System.out.println("pre high school eligible");
        } else if(age > 14 && age <= 18) {
            System.out.println("high school eligible");
        } else if(age > 18 && age <= 22) {
            System.out.println("college eligible");
        } else if(age > 22 && age <=26) {
            System.out.println("master's eligible");
        } else if(age > 26) {
            System.out.println("phd eligible");
        }
    }

    /**
     *
     * switch(constant) {
     *     case value1:
     *           execute all line of code encountered break;
     *     case value2:
     *          execute all line of code encountered break;
     *      default:
     *          executes when none of the case is matched
     *          execute until encountered break; or end of switch block;
     * }
     *
     * @param age
     */
    public static void eligibleClassForAdmissionUsingSwitch(int age) {
        switch (age) {
            case 2:
            case 3:
            case 4:
                System.out.println("print 4");
                //break;
            case 5:
                System.out.println("pre school eligible");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("elementary school eligible");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("pre high school eligible");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("high school eligible");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                System.out.println("college eligible");
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                System.out.println("master's eligible");
                break;
            default: //any value except mentioned in above cases
                System.out.println("phd eligible");
                break;
        }


    }

    public static void main(String[] args) {
        //eligibleClassForAdmissionUsingIfElse(23);
        eligibleClassForAdmissionUsingSwitch(50);
        /*int i = 10;
        if((i++ > 9 && i++ > 14) || i++ > 16) {
            //cond1 : i++ > 09 => 10 >  9 (true) => i++ which will become 11
            //cond2 : i++ > 14 => 11 > 14 (false) => i++ which will become 12
            //cond3 : i++ > 16 => 12 > 16 (false) => i++ which will become 13
            System.out.println("do something");
        }
        System.out.println(i); // ??*/
    }
}
