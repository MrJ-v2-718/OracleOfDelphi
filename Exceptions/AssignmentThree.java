//****************************************************************************
//  Name: MrJ
//  Date: 10/17/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Prompt a user to enter strings or DONE to exit the program.
//  If a string is longer than 5 characters a StringTooLongException is thrown.
//  Instead of terminating the program, the exception notifies the user and
//  continues processing strings.
//****************************************************************************

import java.util.Scanner;

public class AssignmentThree {

    public static void main(String[] args) throws StringTooLongException {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        //-----------------------------------------------------------------
        //  Define the StringTooLongException
        //-----------------------------------------------------------------
        StringTooLongException problem = new StringTooLongException("String is longer than 5 characters.");

        while (!input.equals("DONE")) {
            try {
                System.out.print("Enter a string or (DONE) to exit: ");
                input = scanner.nextLine();
                //-----------------------------------------------------------------
                //  Throw an exception if the input is longer than 5 characters
                //-----------------------------------------------------------------
                if (input.length() > 5) {
                    throw problem;
                }
            } catch (StringTooLongException exception) {
                //-----------------------------------------------------------------
                //  Catch the exception and print the exception
                //-----------------------------------------------------------------
                System.out.println(problem);
            }
        }
    }
}
