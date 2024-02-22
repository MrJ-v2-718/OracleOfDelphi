import java.time.*;
import java.util.Scanner;

public class DaysTilNextMonth {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	LocalDate date;
	
	int month, day, year, daysUntilNextMonth;
		
	System.out.print("Please enter a month: ");
	month = input.nextInt();
	
	System.out.print("Please enter a day: ");
	day = input.nextInt();
		
	System.out.print("Please enter a year: ");
	year = input.nextInt();
	
	date = LocalDate.of(year, month, day);
	
	daysUntilNextMonth = lengthOfMonth(month, day, year);
	
	System.out.println("There are " + daysUntilNextMonth + " days until " + 
		date.plusMonths(1).getMonth() + " starts.");
	}
	
	public static int lengthOfMonth(int month, int day, int year) {
	LocalDate date2;
	int day2, daysTilNextMonth;
	date2 = LocalDate.of(year, month, day);
	day2 = date2.getDayOfMonth();
	daysTilNextMonth = date2.lengthOfMonth() - day2;
	
	return daysTilNextMonth;
	
	}
}
