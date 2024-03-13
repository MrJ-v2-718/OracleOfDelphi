import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hoursWorked;
        double regularHoursWorked = 0.0;
        double overtimeHoursWorked = 0.0;
        int shiftNumber;
        double hourlyPayRate;
        double regularPayRate = 0.0;
        double regularPay;
        double overtimePayRate;
        double overtimePay;
        double totalPay;
        double retirementDeduction = 0.0;
        double netPay;
        int retirementChoice = 2;

        System.out.print("Please enter shift number: ");
        shiftNumber = input.nextInt();

        System.out.print("Please enter hours worked: ");
        hoursWorked = input.nextDouble();

        // If shift is 2nd or 3rd, prompt user for retirement choice
        if (shiftNumber == 2 || shiftNumber == 3) {
            System.out.println("Would you like to participate in the retirement plan? (1 = y / 2 = n)");
            retirementChoice = input.nextInt();
        }

        if (shiftNumber == 1) {
            // Pay rate is $17.00/hour for 1st shift
            regularPayRate = 17.00;
        } else if (shiftNumber == 2) {
            // Pay rate is $18.50/hour for 2nd shift
            regularPayRate = 18.50;
        } else if (shiftNumber == 3) {
            // Pay rate is $22.00/hour for 3rd shift
            regularPayRate = 22.00;
        } else {
            // If shift number is anything besides 1, 2, or 3
            System.out.println("Error");
        }

        if (hoursWorked > 40.0) {
            regularHoursWorked = 40.0;
            overtimeHoursWorked = hoursWorked - 40.0;
        } else if (hoursWorked <= 40.0) {
            regularHoursWorked = hoursWorked;
        } else {
            System.out.println("Error");
        }

        System.out.println();

        // hours worked
        System.out.println("Hours Worked: " + hoursWorked);

        // shift
        System.out.println("Shift Number: " + shiftNumber);

        // hourly pay rate
        System.out.println("Hourly Pay Rate: $" + regularPayRate);

        // regular pay
        regularPay = regularHoursWorked * regularPayRate;
        System.out.println("Regular pay is $" + regularPay + "0");

        // overtime pay
        overtimePayRate = regularPayRate * 1.5;
        overtimePay = overtimeHoursWorked * overtimePayRate;
        System.out.println("Overtime Pay: $" + overtimePay);

        // total of regular and overtime pay
        totalPay = regularPay + overtimePay;
        System.out.println("Total Pay: $" + totalPay);

        // retirement deduction, if any
        if (retirementChoice == 1) {
            retirementDeduction = totalPay * 0.03;
        } else if (retirementChoice == 2){
            retirementDeduction = 0.0;
        } else {
            System.out.println("Error");
        }
        System.out.println("Retirement Deduction: $" + retirementDeduction);

        // net pay (subtract retirement deduction, if any)
        totalPay -= retirementDeduction;
        System.out.println("Net Pay: " + totalPay);
    }
}