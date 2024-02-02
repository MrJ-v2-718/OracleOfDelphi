import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter job name: ");
        String name = input.nextLine();

        System.out.print("Enter material cost: ");
        double materialCost = input.nextDouble();

        System.out.print("Enter hours of work required: ");
        double hoursOfWork = input.nextDouble();

        System.out.print("Enter hours of travel time: ");
        double hoursOfTravel = input.nextDouble();

        double returnedEstimate = calculateEstimate(materialCost, hoursOfWork, hoursOfTravel);

        System.out.println("The estimate for " + name + " is $" + returnedEstimate);
    }

    public static double calculateEstimate(double material, double work, double travel) {
        double estimate = material + (35.0 * work) + (12.0 * travel);
        return estimate;
    }
}