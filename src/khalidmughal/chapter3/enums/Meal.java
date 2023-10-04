package khalidmughal.chapter3.enums;

public enum Meal {
    BREAKFAST(7, 30),
    LUNCH(12, 15),
    DINNER(19, 45);

    int hour, min;
    Meridien meridien;
    Meal(int hour, int min) {
        /**
         * HOME WORK - 1
         *
         * IF(hour >= 12) hour = hour -12;
         *  AND, meridien = PM;
         *
         * ELSE,
         *  meridien = AM;
         *
         *  HOME WORK - 2
         *
         *  TOPIC: Extending Enum Types: Constant-Specific Class Bodies
         *   practice the given program
         *
         */
        this.hour = hour;
        this.min = min;
    }

    @Override
    public String toString() {
        return String.format("%s, at %d:%d", this.name(), hour, min);
    }
}
