//****************************************************************************
//  Name: MrJ
//  Date: 10/18/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The CustomerList program tests the Customer class by reading each
//  record from Customer.csv, instantiate a customer object with the data from
//  the record, which encrypts the password, and outputs a report containing
//  the customer ID, first name, last name, original password from the text file
//  the encrypted password (using the accessor for password), and the decrypted
//  password (using the decrypt() method).
//****************************************************************************

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CustomerList {

    public static void main(String[] args) throws InvalidPWException, IOException {
        String string, customerId, lastName, firstName, emailAddress, userName, originalPassword;
        boolean needToPrintHeadings = true;
        LocalDateTime time = LocalDateTime.now();
        String month = String.valueOf(time.getMonth());
        String day = String.valueOf(time.getDayOfMonth());
        String year = String.valueOf(time.getYear());
        float bankBalance;
        boolean complex, tooShortBoolean;
        int index;
        int recordCount = 0;
        Scanner fileScan = new Scanner(new File("Customer.csv"));
        PrintWriter outFile = new PrintWriter("CustomerReport.txt");
        Customer customer;
        char c;
        int tooShortExceptions = 0;
        int notComplexExceptions = 0;

        //-----------------------------------------------------------------
        //  Define the StringTooLongException
        //-----------------------------------------------------------------
        InvalidPWException tooShort = new InvalidPWException("The password is too short.");
        InvalidPWException notComplex = new InvalidPWException("The password is not complex.");

        while (fileScan.hasNext()) {
            tooShortBoolean = false;
            complex = false;
            if (needToPrintHeadings) {
                outFile.println("*****************************************CUSTOMER REPORT*****************************************");
                outFile.println("Customer ID--First Name--Last Name--Original Password--Encrypted Password--Decrypted Password--Errors");
                needToPrintHeadings = false;
            }
            //-----------------------------------------------------------------------------------------
            //  Extract data from a line of input and store in variables
            //---------------------------------------------------------------------------------------------
            string = fileScan.nextLine();

            index = string.indexOf(",");
            customerId = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            lastName = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            firstName = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            emailAddress = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            userName = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            bankBalance = Float.parseFloat(string.substring(0, index));
            string = string.substring(index + 1);

            originalPassword = string;

            try {
                //-----------------------------------------------------------------
                //  Loop through password to see if it is complex or not
                //-----------------------------------------------------------------
                for (int i = 0; i < originalPassword.length(); i++) {
                    c = originalPassword.charAt(i);
                    if (Character.isDigit(c)) {
                        complex = true;
                    }
                }
                //-----------------------------------------------------------------
                //  Throw an exception if the password doesn't contain any digits
                //-----------------------------------------------------------------
                if (!complex) {
                    throw notComplex;
                }
                //-----------------------------------------------------------------
                //  Throw an exception if the password is shorter than 10 characters
                //-----------------------------------------------------------------
                if (originalPassword.length() < 10) {
                    throw tooShort;
                }
            } catch (InvalidPWException exception) {
                //-----------------------------------------------------------------
                //  Catch and print the exceptions
                //-----------------------------------------------------------------
                if (exception == tooShort) {
                    tooShortExceptions++;
                }
                if (exception == notComplex) {
                    notComplexExceptions++;
                }
            }

            //-----------------------------------------------------------------
            //  Create customer object with the parameters customerId, lastName,
            //  firstName, emailAddress, userName, bankBalance, and password
            //-----------------------------------------------------------------
            customer = new Customer(customerId, lastName, firstName,
                    emailAddress, userName, bankBalance, originalPassword);
            outFile.println(
                    customer.getCustomerId() + "------" +
                            customer.getFirstName() + "------" +
                            customer.getLastName() + "------" +
                            originalPassword + "------" +
                            customer.getPassword() + "------" +
                            customer.decrypt() + "------" +
                            "Short:" + tooShortBoolean +
                            "\tComplex:" + complex
            );
            recordCount++;
        }
        outFile.println("Report Date: " + month + "-" + day + "-" + year);
        outFile.println("Total Records: " + recordCount);
        outFile.println("Number of Short Passwords: " + tooShortExceptions);
        outFile.println("Number of Non-Complex Passwords: " + notComplexExceptions);
        outFile.close();
    }
}
