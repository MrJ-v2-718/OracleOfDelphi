import java.util.Scanner;

public class TestPatient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Default patient 1
		Patient pat1 = new Patient();
		display(pat1);
		
		// User input patient 2
		System.out.print("Enter ID number: ");
		String id = input.nextLine();
		System.out.print("Enter age: ");
		int age = input.nextInt();

		BloodData bl = new BloodData();
		Patient pat2 = new Patient(id, age, bl.getBloodType(), bl.getRhFactor());
		display(pat2);
		
		input.nextLine();
		// User input, but default
		System.out.print("Enter ID number: ");
		id = input.nextLine();
		System.out.print("Enter age: ");
		age = input.nextInt();
		
		Patient pat3 = new Patient();
		display(pat3);
	}
	
	public static void display(Patient pat) {
		BloodData bld = pat.getBloodData();
		System.out.println("Patient #" + pat.getId() + "  age: " + + pat.getAge() +
         "\n   The blood is type " + bld.getBloodType() + bld.getRhFactor());
	}
}
