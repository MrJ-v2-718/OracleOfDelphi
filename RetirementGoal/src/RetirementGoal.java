import java.util.*;

public class RetirementGoal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years until retirement: ");
        int yearsToFreedom = input.nextInt();
        if (yearsToFreedom <= 0) {
            while (yearsToFreedom <= 0) {
                System.out.print("Enter number of years until retirement: ");
                yearsToFreedom = input.nextInt();
            }
        }

        System.out.print("Enter annual investment: ");
        double annualInvestment = input.nextDouble();
        if (annualInvestment <= 0) {
            while (annualInvestment <= 0) {
                System.out.print("Enter annual investment: ");
                annualInvestment = input.nextDouble();
            }
        }

        double retirementSavings = 0.0;
        while (yearsToFreedom != 0) {
            retirementSavings += annualInvestment;
            yearsToFreedom--;
        }
        System.out.println("You will have $" + String.format("%.2f",retirementSavings) + " at retirement.");
    }
}
