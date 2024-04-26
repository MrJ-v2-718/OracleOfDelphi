import javax.swing.*;
import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        // Create an application that prompts a user for 10 integers and stores them in an array.
        // The application should call five methods that in turn:
        //     a. Display all the integers
        //     b. Display all the integers in reverse order
        //     c. Display the sum of the integers
        //     d. Display all values less than 12 or a message if none are less than 12
        //     e. Display all values that are higher than the calculated average value
        // Save the file as ArrayMethodDemo.java

        Scanner input = new Scanner(System.in);
        int userInput;
        int[] userArray = new int[10];
        System.out.println();
        System.out.println("Enter ten integers to evaluate");
        System.out.println("******************************");

        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Enter an integer: ");
            userInput = input.nextInt();
            userArray[i] = userInput;
        }
        System.out.println();

        // Display all integers
        displayIntegers(userArray);
        System.out.println();
        // Display all the integers in reverse order
        displayReverse(userArray);
        System.out.println();
        // Display the sum of the integers
        displaySum(userArray);
        System.out.println();
        // Display all values less than 12 or a message if none are less than 12
        displayLessThan12(userArray);
        System.out.println();
        // Display all values that are higher than the calculated average value
        displayAboveAvg(userArray);
        System.out.println();
    }

    private static void displayIntegers(int[] array) {
        System.out.println("Display all integers");
        System.out.println("********************");
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void displayReverse(int[] array) {
        System.out.println("Display all the integers in reverse order");
        System.out.println("*****************************************");
        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    private static void displaySum(int[] array) {
        int sum = 0;
        System.out.println("Display the sum of the integers");
        System.out.println("*******************************");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    private static void displayLessThan12(int[] array) {
        boolean lessThan = false;
        System.out.println("Display all values less than 12 or a message if none are less than 12");
        System.out.println("*********************************************************************");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 12) {
                System.out.println(array[i]);
                lessThan = true;
            }
        }
        if (!lessThan) {
            System.out.println("No values less than 12");
        }
    }

    private static void displayAboveAvg(int[] array) {
        int sum = 0;
        System.out.println("Display all values that are higher than the calculated average value");
        System.out.println("********************************************************************");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.println("Average: " + average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
    }
}
