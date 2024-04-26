import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args) {
        // Create an application that allows a user to enter values for an array of seven
        // Salesperson objects. Offer the user the choice of displaying the objects in
        // order by either ID number or sales value.
        // Save the application as SalespersonSort.java

        Scanner input = new Scanner(System.in);
        Salesperson[] salesPeople = new Salesperson[7];
        int idNumber;
        double annualSales;
        int selection;

        for (int i = 0; i < salesPeople.length; i++) {
            System.out.print("Enter ID Number: ");
            idNumber = input.nextInt();
            System.out.print("Enter Annual Sales: ");
            annualSales = input.nextDouble();
            salesPeople[i] = new Salesperson(idNumber, annualSales);
        }

        System.out.println();
        System.out.print("Enter 1 to order by ID or 2 to order by sales value: ");
        selection = input.nextInt();

        if (selection == 1) {
            // Order by ID
            idSort(salesPeople);
        } else if (selection == 2) {
            // Order by sales
            salesSort(salesPeople);
        } else {
            System.out.println("Not a valid choice.");
        }
    }

    private static void idSort(Salesperson[] salesPeople) {
        Salesperson[] idSortSalesPeople = new Salesperson[7];
        Salesperson temp = new Salesperson(999999999, 0);
        int idMin = 999999999;
        int j = 0;

        while (j < 8) {
            for (int i = 0; i < salesPeople.length; i++) {
                temp.setIdNumber(salesPeople[i].getIdNumber());
                temp.setAnnualSales(salesPeople[i].getAnnualSales());
                idMin = temp.getIdNumber();
                if (temp.getIdNumber() > idMin) {
                    System.out.println("object made");
                    idSortSalesPeople[j] = new Salesperson(temp.getIdNumber(), temp.getAnnualSales());
                    idMin = idSortSalesPeople[j].getIdNumber();
                    j++;
                    System.out.println("temp id number is less tha id min");
                }
            }
        }

        // Display
        for (int i = 0; i < idSortSalesPeople.length; i++) {
            System.out.println("Object Reference: " + idSortSalesPeople[i]);
            System.out.println("ID Number: " + idSortSalesPeople[i].getIdNumber());
            System.out.println("Annual Sales: " + idSortSalesPeople[i].getAnnualSales());
            System.out.println();
        }
    }

    private static void salesSort(Salesperson[] salesPeople) {
        Salesperson[] salesSortSalesPeople = new Salesperson[7];
        Salesperson temp = new Salesperson(999999999, 0);
        int salesMin = 999999999;
        int j = 0;

        while (j < 8) {
            for (int i = 0; i < salesPeople.length; i++) {
                temp.setIdNumber(salesPeople[i].getIdNumber());
                temp.setAnnualSales(salesPeople[i].getAnnualSales());
                salesMin = temp.getIdNumber();
                if (temp.getIdNumber() > salesMin) {
                    System.out.println("object made");
                    salesSortSalesPeople[j] = new Salesperson(temp.getIdNumber(), temp.getAnnualSales());
                    salesMin = salesSortSalesPeople[j].getIdNumber();
                    j++;
                    System.out.println("temp id number is less tha id min");
                }
            }
        }

        // Display
        for (int i = 0; i < salesSortSalesPeople.length; i++) {
            System.out.println("Object Reference: " + salesSortSalesPeople[i]);
            System.out.println("ID Number: " + salesSortSalesPeople[i].getIdNumber());
            System.out.println("Annual Sales: " + salesSortSalesPeople[i].getAnnualSales());
            System.out.println();
        }
    }
}
