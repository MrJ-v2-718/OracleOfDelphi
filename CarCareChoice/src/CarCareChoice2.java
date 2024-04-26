import javax.swing.*;
import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        // It might not be reasonable to expect users to type long entries such as "oil change" accurately.
        // Modify the CarCareChoice class so that as long as the user enters the first three characters of
        // a service, the choice is considered valid. Save the file as CarCareChoice2.java.

        Scanner input = new Scanner(System.in);
        String userInput;
        String firstThree;
        String firstThree2;
        int selection = 99;


        // Create an array for offered services
        String[] services = {
                "oil change",
                "tire rotation",
                "battery check",
                "brake inspection"
        };

        // Create a parallel array for corresponding prices
        int[] servicePrices = {
                25,
                22,
                15,
                5
        };

        displayMenu();
        System.out.print("Please type your selection: ");
        userInput = input.nextLine().toLowerCase();
        System.out.println();

        // Determine selection
        int i = 0;
        for (String s : services) {
            // If user enters less than three characters, exit loop
            if (userInput.length() < 3) {
                break;
            }
            // Get first three characters of userInput and the String from services
            firstThree = s.substring(0, 3);
            firstThree2 = userInput.substring(0,3);
            // Check if they are equal
            if (userInput.equals(s) || firstThree2.equals(firstThree)) {
                selection = i;
            }
            i++;
        }

        if (selection >= 0 && selection < 5) {
            System.out.println("Option: " + services[selection]);
            System.out.println("Price: $" + servicePrices[selection]);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Item",
                    "Invalid Item", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void displayMenu() {
        // Menu
        System.out.println("Chapa's Car Care Shop");
        System.out.println("*********************");
        System.out.println("oil change");
        System.out.println("tire rotation");
        System.out.println("battery check");
        System.out.println("brake inspection");
        System.out.println();
    }
}
