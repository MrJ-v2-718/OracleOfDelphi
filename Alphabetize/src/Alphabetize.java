import java.util.Scanner;

public class Alphabetize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput1, userInput2, userInput3;
        boolean alphabetized = false;

        System.out.print("Enter the first string >> ");
        userInput1 = input.nextLine();
        System.out.print("Enter the second string >> ");
        userInput2 = input.nextLine();
        System.out.print("Enter the third string >> ");
        userInput3 = input.nextLine();

        if (userInput1.compareToIgnoreCase(userInput2) < 0) {
            if (userInput1.compareToIgnoreCase(userInput3) < 0) {
                if (userInput2.compareToIgnoreCase(userInput3) < 0) {
                    alphabetized = true;
                }
            }
        }

        if (alphabetized) {
            System.out.println("Strings are in alphabetical order");
        } else {
            System.out.println("Strings are not in alphabetical order");
        }
    }
}
