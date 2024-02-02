import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the current year: ");
        int year = input.nextInt();
        
        System.out.print("Please enter your birth year: ");
        int birthYear = input.nextInt();

        double premium = calculatePremium(year, birthYear);

        System.out.println("Your premium is : $" + premium);
    }

    public static double calculatePremium(int year, int birthYear) {
        int age = year - birthYear;
        double premiumAmount = ((age / 10) + 15) * 20;
        return premiumAmount;
    }
}