import java.time.*;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        int currentYear = currentDate.getYear();

        int month, day, year;

        System.out.print("Please enter a month: ");
        month = input.nextInt();

        System.out.print("Please enter a day: ");
        day = input.nextInt();

        System.out.print("Please enter a year: ");
        year = input.nextInt();


        if (year != currentYear) {
            System.out.println("Not this year.");
        } else if (month < currentMonth) {
            System.out.println("In an earlier month this year.");
        } else if (month > currentMonth) {
            System.out.println("In a greater month this year.");
        } else if (month == currentMonth) {
            System.out.println("This month.");
        } else {
            System.out.println("Error");
        }
    }
}