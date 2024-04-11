import java.util.*;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Start with compliant as false and have the loop continue until true
        boolean compliant = false;

        while (!compliant) {
            // Initialize values at beginning of loop
            int numUpper = 0;
            int numLower = 0;
            int numDigits = 0;

            System.out.print("Enter your password: ");
            String password = input.nextLine();

            for (int i = 0; i < password.length(); i++) {
                // Placeholder for character at index i
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    numUpper += 1;
                }
                if (Character.isLowerCase(c)) {
                    numLower += 1;
                }
                if (Character.isDigit(c)) {
                    numDigits += 1;
                }
            }

            if (numUpper >= 2 && numLower >= 3 && numDigits >= 1) {
                System.out.println("Password is valid.");
                compliant = true;
            } else if (numUpper < 2) {
                System.out.println("Invalid Password. Less than 2 upper case characters.");
            } else if (numLower < 3) {
                System.out.println("Invalid Password. Less than 3 lower case characters.");
            } else {
                System.out.println("Invalid Password. Less than 1 digit.");
            }
        }
    }
}
