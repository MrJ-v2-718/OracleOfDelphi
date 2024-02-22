import java.time.*;
import java.util.Scanner;

public class TestWedding {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter groom's birth month: ");
		int month = input.nextInt();
		
		System.out.print("Please enter groom's birth day: ");
		int day = input.nextInt();
		
		System.out.print("Please enter groom's birth year: ");
		int year = input.nextInt();
		
		LocalDate birthDate1 = LocalDate.of(year, month, day);
		
		System.out.print("Please enter bride's birth month: ");
		month = input.nextInt();
		
		System.out.print("Please enter bride's birth day: ");
		day = input.nextInt();
		
		System.out.print("Please enter bride's birth year: ");
		year = input.nextInt();
		
		LocalDate birthDate2 = LocalDate.of(year, month, day);
		
		System.out.print("Please enter wedding month: ");
		month = input.nextInt();
		
		System.out.print("Please enter wedding day: ");
		day = input.nextInt();
		
		System.out.print("Please enter wedding year: ");
		year = input.nextInt();
		
		LocalDate weddingDate1 = LocalDate.of(year, month, day);
		
		input.nextLine();
		
		System.out.print("Enter the groom's first name: ");
		String groomFirst = input.nextLine();
		
		System.out.print("Enter the groom's last name: ");
		String groomLast = input.nextLine();
		
		System.out.print("Enter the bride's first name: ");
		String brideFirst = input.nextLine();
		
		System.out.print("Enter the bride's last name: ");
		String brideLast = input.nextLine();
		
		System.out.print("Enter the location: ");
		String location1 = input.nextLine();
		
		Person groom1 = new Person(groomFirst, groomLast, birthDate1);
		Person bride1 = new Person(brideFirst, brideLast, birthDate2);
		Couple couple1 = new Couple(groom1, bride1);
		Wedding wedding1 = new Wedding(weddingDate1, couple1, location1);
		
		displayWeddingDetails(wedding1);
	}
	
	public static void displayWeddingDetails(Wedding wed) {
		LocalDate weddingDate = wed.getWeddingDate();
		Couple couple = wed.getCouple();
		String location = wed.getLocation();
		Person groom = couple.getGroom();
		Person bride = couple.getBride();
		String firstGroom = groom.getFirstName();
		String lastGroom = groom.getLastName();
		LocalDate groomBirthday1 = groom.getBirthDate();
		String firstBride = bride.getFirstName();
		String lastBride = bride.getLastName();
		LocalDate brideBirthday1 = bride.getBirthDate();
		System.out.println(lastGroom + "&" + lastBride + " Wedding");
		System.out.println("Date: " + weddingDate);
		System.out.println("Location: " + location);
		System.out.println("Groom: " + firstGroom + " " + lastGroom + 
			" " + groomBirthday1);
		System.out.println("Bride: " + firstBride + " " + lastBride + 
			" " + brideBirthday1);
	}
}
