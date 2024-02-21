import java.util.Scanner;
import java.time.*;

public class TestFitnessTracker {
	public static void main(String[] args) {
		
		String activity;
		int minutesInput;
		LocalDate date;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter activity: ");
		activity = input.nextLine();
		System.out.print("Enter minutes spent on activity: ");
		minutesInput = input.nextInt();
		date = LocalDate.now();
		
		FitnessTracker activity1 = new FitnessTracker(activity, minutesInput, date);

		System.out.println(activity1.getActivity() + 
			" " + activity1.getMinutes() + " minutes on " + 
			" " + activity1.getDate());
			
		FitnessTracker activity2 = new FitnessTracker();
			
		System.out.println(activity2.getActivity() + 
			" " + activity2.getMinutes() + " minutes on " +
			" " + activity2.getDate());
	}
	
}
