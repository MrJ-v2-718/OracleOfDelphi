import java.util.Scanner;


public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length: ");
        double length = input.nextDouble();

        System.out.print("Please enter width: ");
        double width = input.nextDouble();

        System.out.print("Please enter height: ");
        double height = input.nextDouble();

        double finalPrice = calculatePrice(length, width, height);
        System.out.println("The price is: $" + finalPrice);
    }

    public static double calculatePrice(double length, double width, double height) {
        double wallArea = length * height * 2 + height * width * 2;
        double gallons = paintNeeded(wallArea);
        System.out.println("You need " + gallons + " gallons.");
        double price = 32.0 * gallons;
        return price;
    }

    public static double paintNeeded(double wallArea) {
        double gallonsNeeded = wallArea / 350.0;

        return gallonsNeeded;
    }
}