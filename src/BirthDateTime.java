import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDays;
        switch (month) {
            case 2: // February
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11: // Months with 30 days
                maxDays = 30;
                break;
            default: // All other months have 31 days
                maxDays = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDays);

        int hour = SafeInput.getRangedInt(in, "Enter the hour of birth", 1, 24);

        int minute = SafeInput.getRangedInt(in, "Enter the minute of birth", 1, 59);

        System.out.println("\nYou were born on: " + month + "/" + day + "/" + year +
                " at " + hour + ":" + (minute < 10 ? "0" + minute : minute));

        in.close();
    }
}
