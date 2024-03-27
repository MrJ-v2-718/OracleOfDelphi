import java.util.*;

public class IncreasedProduction {
    public static void main(String[] args) {
        double partsPerMonth;
        double goal = 10_000.00;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter parts per month: ");
        partsPerMonth = input.nextDouble();
        boolean firstMonth = true;

        while (i < 24) {
            i++;
            System.out.println("Month " + i + ": " + (partsPerMonth += (partsPerMonth * 0.06)) + " parts per month");
            if (partsPerMonth > goal && firstMonth) {
                System.out.println("The month in which production exceeds 10000.0 is month " + i);
                firstMonth = false;
            }
            if (i == 24 && partsPerMonth < goal) {
                System.out.println("This worker will not reach 10000.0 in 24 months");
            }
        }
    }
}
