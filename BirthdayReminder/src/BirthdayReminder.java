import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        // Write an application that allows a user to enter the names and birthdates
        // of up to 10 friends. Continue to prompt the user for names and birthdates
        // until the user enters the sentinel value ZZZ for a name or has entered 10
        // names, whichever comes first. When the user is finished entereing names,
        // produce a count of how many names were entered, and then display the names.
        // In a loop, continually ask the user to type one of the names and display
        // the corresponding birthdate or an error message if the name has not been
        // previously entered. The loop continues until the user enters ZZZ for a name.
        // Save the application as BirthdayReminder.java

        Scanner input = new Scanner(System.in);
        String[] names = new String[10];
        String[] birthdays = new String[10];
        int totalNames = 0;
        final String SENTINEL = "ZZZ";
        String userInput;
        boolean nameFound = false;
        System.out.println("Welcome to the Birthday Database");
        System.out.println("********************************");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter friend's name or ZZZ to exit: ");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            names[i] = userInput;
            System.out.print("Enter friend's birthday: ");
            birthdays[i] = input.nextLine();
            System.out.println();
            totalNames++;
        }

        System.out.println(totalNames + " names were entered.");
        for (int i = 0; i < totalNames; i++) {
            System.out.println(names[i]);
        }

        userInput = "";
        while (!userInput.equalsIgnoreCase(SENTINEL)) {
            System.out.println("Enter a name to search or ZZZ to exit: ");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase(SENTINEL)) {
                break;
            }
            for (int i = 0; i < totalNames; i++) {
                if (names[i].equalsIgnoreCase(userInput)) {
                    System.out.println(names[i] + "'s Birthday: " + birthdays[i]);
                    nameFound = true;
                }
            }
            if (!nameFound) {
                System.out.println("Name not found");
            }
        }
    }
}
