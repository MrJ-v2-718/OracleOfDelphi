//****************************************************************************
//  Name: MrJ
//  Date: 10/17/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Prompt a user to enter strings or DONE to exit the program.
//  If a string is longer than 5 characters a StringTooLongException is thrown.
//****************************************************************************

import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) throws StringTooLongException {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        //-----------------------------------------------------------------
        //  Define the StringTooLongException
        //-----------------------------------------------------------------
        StringTooLongException problem = new StringTooLongException("String is longer than 5 characters.");

        while (!input.equals("DONE")) {
            System.out.print("Enter a string or (DONE) to exit: ");
            input = scanner.nextLine();
            //-----------------------------------------------------------------
            //  Throw an exception if the input is longer than 5 characters
            //-----------------------------------------------------------------
            if (input.length() > 5) {
                throw problem;
            }
        }
    }
}
