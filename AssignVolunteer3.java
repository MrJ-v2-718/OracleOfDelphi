import java.util.Scanner;

public class AssignVolunteer3 {

	public static void main(String[] args) {
		int donationType;
		String volunteer = "N/A";
		String message = "N/A";
		final int CLOTHING_CODE = 1;
		final int OTHER_CODE = 2;
		final String CLOTHING_PRICER = "Selena";
		final String OTHER_PRICER = "Anthony";

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + 
			" for clothing, " + OTHER_CODE + 
			" for anything else... ");
			donationType = input.nextInt();
		
		if(donationType == CLOTHING_CODE) {
			volunteer = CLOTHING_PRICER;
			message = "a clothing donation";
		}
		else if (donationType != 1 && donationType != 2) {
			System.out.println("Error, " + donationType + 
				" is not a valid code.");
		} 
		else {
				volunteer = OTHER_PRICER;
				message = "a non-clothing donation";
		}
			
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + 
			volunteer);
		System.out.println("This is " + message);
	}
}

