import java.time.*;
import java.util.Scanner;

public class TenThousandDaysOld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalDate birthday;
		int month, day, year;
		
		System.out.print("Please enter a month: ");
		month = input.nextInt();
		
		System.out.print("Please enter a day: ");
		day = input.nextInt();
		
		System.out.print("Please enter a year: ");
		year = input.nextInt();
		
		birthday = LocalDate.of(year, month, day);
		
		System.out.println("You will be 10,000 days old on " + birthday.plusDays(10000));
		
	}
}
