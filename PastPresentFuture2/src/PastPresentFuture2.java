import java.time.*;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        LocalDate enteredDate;

        int month, day, year;

        System.out.print("Please enter a month: ");
        month = input.nextInt();

        System.out.print("Please enter a day: ");
        day = input.nextInt();

        System.out.print("Please enter a year: ");
        year = input.nextInt();


        enteredDate = LocalDate.of(year, month, day);

        if (enteredDate.isBefore(currentDate)) {
            System.out.println("In the past");
        } else if (enteredDate.equals(currentDate)) {
            System.out.println("Current Date");
        } else if (enteredDate.isAfter(currentDate)) {
            System.out.println("In the future");
        } else {
            System.out.println("Error");
        }
    }
}