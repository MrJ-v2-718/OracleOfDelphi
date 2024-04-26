import javax.swing.*;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        // Allow a user to enter any number of double values up to 15.
        // The user should enter 99999 to quit entering numbers.
        // Display an error message if the user quits without entering any numbers;
        // otherwise, display a count of the numbers entered, the arithmetic average
        // of the numbers, and each entered value and its distance from the average.
        // Save the file as DistanceFromAverage.java

        Scanner input = new Scanner(System.in);
        double userInput = 0.0;
        boolean isEmpty = true;
        final double SENTINEL_VALUE = 99999;
        double[] doubleValues = new double[15];
        int arrayLength = doubleValues.length;
        int valuesEntered = 0;
        double sum = 0.0;
        double average = 0.0;
        double distanceFromAverage = 0.0;

        // Menu Prompt
        System.out.println("Enter up to fifteen double values to evaluate and 99999 to stop entering values.");
        // Loop iterates as long as userInput doesn't equal the sentinel value
        while (userInput != SENTINEL_VALUE) {
            for (int i = 0; i < arrayLength; i++) {
                System.out.print("Enter a double value or 99999 to stop: ");
                userInput = input.nextDouble();
                // Don't add to array if user enters sentinel value
                if (userInput == SENTINEL_VALUE) {
                    break;
                }
                // Add input to array
                doubleValues[i] = userInput;
            }
        }
        if (doubleValues[0] == 0.0) {
            // The default value for double arrays is 0.0
            JOptionPane.showMessageDialog(null, "You quit without entering any numbers.",
                    "No Entries Found", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < arrayLength; i++) {
                if (doubleValues[i] != 0.0) {
                    // Add value to sum and increment valuesEntered
                    valuesEntered++;
                    sum += doubleValues[i];
                }
            }
            // Calculate average
            average = sum / valuesEntered;
            System.out.println();
            System.out.println("Number of entries: " + valuesEntered);
            System.out.println("Average: " + average);
            System.out.println();
            System.out.println("          Values");
            System.out.println("***************************");

            for (int i = 0; i < arrayLength; i++) {
                if (doubleValues[i] != 0.0) {
                    // Calculate each entered value's distance from average
                    if (average > doubleValues[i]) {
                        distanceFromAverage = average - doubleValues[i];
                    } else if (doubleValues[i] > average) {
                        distanceFromAverage = doubleValues[i] - average;
                    } else {
                        distanceFromAverage = 0.0;
                    }
                    System.out.println("Entered value: " + doubleValues[i]);
                    System.out.println("Distance from average: " + distanceFromAverage);
                    System.out.println();
                }

            }
        }
    }
}
