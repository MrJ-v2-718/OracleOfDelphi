import java.time.*;
import java.util.Scanner;

public class TestMonthHandling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalDate date1, date2;
		int month, day, year;
		
		System.out.print("Please enter a month: ");
		month = input.nextInt();
		
		System.out.print("Please enter a day: ");
		day = input.nextInt();
		
		System.out.print("Please enter a year: ");
		year = input.nextInt();
		
		date1 = LocalDate.of(year, month, day);
		
		System.out.println("First date: " + date1);
		System.out.println("First date plus one month: " + date1.plusMonths(1));
		System.out.println("First date plus two months: " + date1.plusMonths(2));
		System.out.println("First date plus three months: " + date1.plusMonths(3));
		
		System.out.print("Please enter another month: ");
		month = input.nextInt();
		
		System.out.print("Please enter another day: ");
		day = input.nextInt();
		
		System.out.print("Please enter another year: ");
		year = input.nextInt();
		
		date2 = LocalDate.of(year, month, day);
		
		System.out.println("Second date: " + date2);
		System.out.println("Second date plus one month: " + date2.plusMonths(1));
		System.out.println("Second date plus two months: " + date2.plusMonths(2));
		System.out.println("Second date plus three months: " + date2.plusMonths(3));
	}
}
