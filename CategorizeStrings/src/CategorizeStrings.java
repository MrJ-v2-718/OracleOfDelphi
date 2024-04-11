import java.util.Scanner;

public class CategorizeStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput;
        boolean isEmpty = true;
        String[] shortStrings = new String[20];
        String[] longStrings = new String[20];
        final String sentinelValue = "0";
        final String shortList = "short";

        System.out.println("Enter up to 20 strings to evaluate and 0 to end entry.");
        System.out.print("Enter a string >> ");
        userInput = input.nextLine();
        int i = 0;

        if (userInput.length() <= 10) {
            shortStrings[i] = userInput;
        } else {
            longStrings[i] = userInput;
        }

        while (!userInput.equals(sentinelValue) && (i + 1) < 20) {
            i++;
            System.out.print("Enter a string >> ");
            userInput = input.nextLine();
            if (userInput.length() <= 10) {
                shortStrings[i] = userInput;
            } else {
                longStrings[i] = userInput;
            }
        }

        userInput = "1";
        while (!userInput.equals(sentinelValue)) {
            System.out.print("Which type of string list? (short/long) 0 to terminate >> ");
            userInput = input.nextLine();
            if (userInput.equals(shortList)) {
                isEmpty = true;
                for (i = 0; i < shortStrings.length; i++) {
                    for (int j = 0; j < shortStrings.length; j++) {
                        if (shortStrings[j] != null) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (isEmpty) {
                        System.out.println("The list has no strings.");
                        break;
                    } else {

                        if (shortStrings[i] != null) {
                            System.out.println(shortStrings[i]);
                        }

                    }
                }
            } else {
                isEmpty = true;
                for (i = 0; i < longStrings.length; i++) {
                    for (int j = 0; j < longStrings.length; j++) {
                        if (longStrings[j] != null) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (isEmpty) {
                        System.out.println("The list has no strings.");
                        break;
                    } else {

                        if (longStrings[i] != null) {
                            System.out.println(longStrings[i]);
                        }

                    }
                }
            }
        }
    }
}
