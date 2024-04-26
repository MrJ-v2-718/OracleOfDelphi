import javax.swing.*;
import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        // Write an application for Chapa's Car Care Shop that shows a user a list of available services:
        // oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string
        // that corresponds to one of the options, and display the option and its price as $25, $22, $15,
        // or $5, accordingly. Display an error message if the user enters an invalid item.
        // Save the file as CarCareChoice.java

        Scanner input = new Scanner(System.in);
        String userInput;
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
            if (userInput.equals(s)) {
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
