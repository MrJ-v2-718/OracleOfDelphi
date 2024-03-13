import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
        int minBedrooms;
        double minBathrooms;
        double maxRent;

        Apartment apartment1 = new Apartment(240, 3, 2, 950.00);
        Apartment apartment2 = new Apartment(241, 2, 1, 725.00);
        Apartment apartment3 = new Apartment(242, 1, 1, 600.00);
        Apartment apartment4 = new Apartment(243, 1, 1, 600.00);
        Apartment apartment5 = new Apartment(244, 2, 1, 725.00);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter minimum number of bedrooms: ");
        minBedrooms = input.nextInt();

        System.out.print("Enter minimum number of bathrooms: ");
        minBathrooms = input.nextDouble();

        System.out.print("Enter maximum rent allowed: $");
        maxRent = input.nextDouble();

        if (apartment1.getBedrooms() >= minBedrooms && apartment1.getBaths() >= minBathrooms &&
                apartment1.getRent() <= maxRent) {
            System.out.println("Apartment 1 meets criteria");
            System.out.println("*******************");
            System.out.println("Apartment Number: " + apartment1.getAptNumber());
            System.out.println("Bedrooms: " + apartment1.getBedrooms());
            System.out.println("Bathrooms: " + apartment1.getBaths());
            System.out.println("Rent: $" + apartment1.getRent());
        } else {
            System.out.println("Apartment 1 does not meet criteria.");
        }

        if (apartment2.getBedrooms() >= minBedrooms && apartment2.getBaths() >= minBathrooms &&
                apartment2.getRent() <= maxRent) {
            System.out.println("Apartment 2 meets criteria");
            System.out.println("*******************");
            System.out.println("Apartment Number: " + apartment2.getAptNumber());
            System.out.println("Bedrooms: " + apartment2.getBedrooms());
            System.out.println("Bathrooms: " + apartment2.getBaths());
            System.out.println("Rent: $" + apartment2.getRent());
        } else {
            System.out.println("Apartment 2 does not meet criteria.");
        }

        if (apartment3.getBedrooms() >= minBedrooms && apartment3.getBaths() >= minBathrooms &&
                apartment3.getRent() <= maxRent) {
            System.out.println("Apartment 3 meets criteria");
            System.out.println("*******************");
            System.out.println("Apartment Number: " + apartment3.getAptNumber());
            System.out.println("Bedrooms: " + apartment3.getBedrooms());
            System.out.println("Bathrooms: " + apartment3.getBaths());
            System.out.println("Rent: $" + apartment3.getRent());
        } else {
            System.out.println("Apartment 3 does not meet criteria.");
        }

        if (apartment4.getBedrooms() >= minBedrooms && apartment4.getBaths() >= minBathrooms &&
                apartment4.getRent() <= maxRent) {
            System.out.println("Apartment 4 meets criteria");
            System.out.println("*******************");
            System.out.println("Apartment Number: " + apartment4.getAptNumber());
            System.out.println("Bedrooms: " + apartment4.getBedrooms());
            System.out.println("Bathrooms: " + apartment4.getBaths());
            System.out.println("Rent: $" + apartment4.getRent());
        } else {
            System.out.println("Apartment 4 does not meet criteria.");
        }

        if (apartment5.getBedrooms() >= minBedrooms && apartment5.getBaths() >= minBathrooms &&
                apartment5.getRent() <= maxRent) {
            System.out.println("Apartment 5 meets criteria");
            System.out.println("*******************");
            System.out.println("Apartment Number: " + apartment5.getAptNumber());
            System.out.println("Bedrooms: " + apartment5.getBedrooms());
            System.out.println("Bathrooms: " + apartment5.getBaths());
            System.out.println("Rent: $" + apartment5.getRent());
        } else {
            System.out.println("Apartment 5 does not meet criteria.");
        }

    }
}