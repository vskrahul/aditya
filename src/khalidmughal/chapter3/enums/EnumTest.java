package khalidmughal.chapter3.enums;

import java.util.Arrays;

/**
 * Enums are basically public final static CONSTANTS.
 */
public class EnumTest {
    public static void main(String[] args) {

        System.out.println(MachineState.IDLE);
        System.out.println(MachineState.valueOf("IDLE"));
        System.out.println(MachineState.IDLE.ordinal());
        // all enums
        System.out.println(Arrays.toString(MachineState.values()));

        System.out.println("\n\nDAYS*****\n");

        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.WEDNESDAY.ordinal());
        //all days
        System.out.println(Arrays.toString(Days.values()));

        System.out.println("\n\nMEAL*****\n");
        System.out.println(Meal.BREAKFAST);
        System.out.println(Meal.DINNER);

        System.out.println(MachineState.BLOCKED.canEnumImplementsInterface());
    }




}
