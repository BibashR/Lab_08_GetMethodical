import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        System.out.println("\nTesting getNonZeroLenString.");
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        System.out.println("\nTesting getInt.");
        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You entered: " + age);

        // Test getDouble
        System.out.println("\nTesting getDouble.");
        double salary = SafeInput.getDouble(in, "Enter your salary");
        System.out.println("You entered: " + salary);

        // Test getRangedInt
        System.out.println("\nTesting getRangedInt.");
        int grade = SafeInput.getRangedInt(in, "Enter your grade (1-100)", 1, 100);
        System.out.println("You entered: " + grade);

        // Test getRangedDouble
        System.out.println("\nTesting getRangedDouble.");
        double temperature = SafeInput.getRangedDouble(in, "Enter the temperature (-50.0 to 150.0)", -50.0, 150.0);
        System.out.println("You entered: " + temperature);

        // Test getYNConfirm (Multiple Test Cases)
        System.out.println("\nTesting getYNConfirm.");
        boolean firstAttempt = SafeInput.getYNConfirm(in, "Do you want to continue? (Y/N)");
        System.out.println("You entered: " + (firstAttempt ? "Yes" : "No"));

        boolean secondAttempt = SafeInput.getYNConfirm(in, "Would you like to try again? (Y/N)");
        System.out.println("You entered: " + (secondAttempt ? "Yes" : "No"));

        boolean thirdAttempt = SafeInput.getYNConfirm(in, "Final confirmation needed. Proceed? (Y/N)");
        System.out.println("You entered: " + (thirdAttempt ? "Yes" : "No"));

        // Test getRegExString
        System.out.println("\nTesting getRegExString.");
        String zipCode = SafeInput.getRegExString(in, "Enter a ZIP code (#####)", "\\d{5}");
        System.out.println("You entered: " + zipCode);

        // Test prettyHeader
        System.out.println("\nTesting prettyHeader.");
        SafeInput.prettyHeader("Hello, Java!");

        // Close Scanner
        in.close();
    }
}
