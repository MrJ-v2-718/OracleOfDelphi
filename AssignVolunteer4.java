import java.util.Scanner;

public class AssignVolunteer4 {

	public static void main(String[] args) {
		int donationType;
		String volunteer = "N/A";
		String message = "N/A";
		final int CLOTHING_CODE = 1;
		final int FURNITURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Selena";
		final String FURNITURE_PRICER = "Hotaru";
		final String ELECTRONICS_PRICER = "David";
		final String OTHER_PRICER = "Anthony";

		Scanner input = new Scanner(System.in);
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + 
			" for clothing, " + "\nEnter " + FURNITURE_CODE + 
			" for furniture, " + "\nEnter " + ELECTRONICS_CODE + 
			" for electronics, " + "\nEnter " + OTHER_CODE + 
			" for other... ");
			donationType = input.nextInt();
		
		switch(donationType) {
			case(CLOTHING_CODE): {
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			}
			case(FURNITURE_CODE): {
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE): {
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			}
			case(OTHER_CODE): {
				volunteer = OTHER_PRICER;
				message = "an other donation";
				break;
			}
			default: {
				volunteer = "invalid";
				message = "an invalid donation type";
			}
		}
			
		System.out.println("You entered " + donationType);
		System.out.println("The volunteer who will price this item is " + 
			volunteer);
		System.out.println("This is " + message);
	}
}

