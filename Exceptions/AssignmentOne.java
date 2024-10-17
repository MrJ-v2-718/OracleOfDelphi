//****************************************************************************
//  Name: MrJ
//  Date: 10/17/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The AssignmentOne program reads 10 number from a user and prints
//  their average. Each input is read as a string and converted to a double.
//  If a NumberFormatException is thrown, print an error message and prompt
//  the user for the number again. 
//****************************************************************************

import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        //-----------------------------------------------------------------
        //  Create the necessary data members for calculating the average
        //-----------------------------------------------------------------
        String input = "";
        double currentNumber;
        double total = 0.0;
        double average;
        int numberCount = 0;
        Scanner scanner = new Scanner(System.in);

        //-----------------------------------------------------------------
        //  Create the while loop used to read input and parse doubles
        //-----------------------------------------------------------------
        while (numberCount != 10) {
            try {
                System.out.print("Please enter a number: ");
                input = scanner.nextLine();
                currentNumber = Double.parseDouble(input);
                total += currentNumber;
                numberCount++;
            } catch (NumberFormatException exception) {
                System.out.println(input + " is not a number.");
            }
        }
        //-----------------------------------------------------------------
        //  Compute the sum after all the numbers are collected
        //-----------------------------------------------------------------
        average = total / numberCount;
        System.out.println("The average is " + average);
    }
}
