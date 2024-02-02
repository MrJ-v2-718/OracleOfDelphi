import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of inches: ");
        double inches = input.nextDouble();

        inchesToFeet(inches);
        inchesToYards(inches);
    }

    public static void inchesToFeet(double inches) {
        double totalFeet = inches / 12.0;
        System.out.println("There are " + totalFeet + " feet in " + inches + " inches.");
    }

    public static void inchesToYards(double inches) {
        double totalYards = inches / 36.0; // 36 is the number of inches in a yard
        System.out.println("There are " + totalYards + " yards in " + inches + " inches.");
    }
}