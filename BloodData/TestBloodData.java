import java.util.Scanner;

public class TestBloodData {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter blood type: ");
		String bloodType = input.nextLine();
		
		System.out.print("Enter rH Factor: ");
		String rhFactor = input.nextLine();
		
		
		BloodData bld1 = new BloodData(bloodType, rhFactor);
		BloodData bld2 = new BloodData();
		display(bld1);
		display(bld2);
	}
	
	public static void display(BloodData bl) {
		System.out.println("Blood Type: " + bl.getBloodType() + bl.getRhFactor());
	}
}
