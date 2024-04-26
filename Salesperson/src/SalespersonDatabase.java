import java.util.Scanner;

public class SalespersonDatabase {
    // Create an application that allows you to store an array that acts as a database
    // of any number of Salesperson objects up to 20. While the user decides to continue,
    // offer three options: to add a record to the database, to delete a record from the
    // database, or to change a record in the database. Then proceed as follows:
    // -If the user selects the add option, issue an error message if the database is full.
    // Otherwise, prompt the user for an ID number. If the ID number already exists in the
    // database, issue an error message. Otherwise, prompt the user for a sales value and
    // add the new record to the database.
    // -If the user selects the delete option, issue an error message if the database is empty.
    // Otherwise, prompt the user for an ID number. If the ID number does not exist, issue an
    // error message. Otherwise, do not access the record for any future processing.
    // -If the user selects the change option, issue an error message if the database is empty.
    // Otherwise, prompt the user for an ID number. If the requested record does not exist,
    // issue an error message. Otherwise, prompt the user for a new sales value and change
    // the sales value for the record.
    // -After each option executes, display the updated database in ascending order by Salesperson
    // ID number and prompt the user to select the next action.
    // Save the application as SalespersonDatabase.java

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keep_running = "y";
        int menuChoice, idNum;
        int personIndex = 0;
        double annualSale;
        boolean found = false;
        Salesperson[] salesPeople = new Salesperson[20];

        while (keep_running.equals("y")) {
            displayMenu();
            System.out.print("Enter menu selection #: ");
            menuChoice = input.nextInt();
            System.out.println();

            if (menuChoice == 1) {
                if (salesPeople[19] != null) {
                    System.out.println("Database is full.");
                    continue;
                }
                System.out.print("Enter ID #: ");
                idNum = input.nextInt();

                for (int i = 0; i < salesPeople.length; i++) {
                    if (salesPeople[i] == null) {
                        continue;
                    }
                    if (salesPeople[i].getIdNumber() == idNum) {
                        System.out.println("Entry already exists.");
                        break;
                    }
                }

                System.out.print("Enter annual sales: ");
                annualSale = input.nextDouble();

                salesPeople[personIndex] = new Salesperson(idNum, annualSale);
                personIndex++;
            } else if (menuChoice == 2) {
                System.out.print("Enter ID #: ");
                idNum = input.nextInt();

                for (int i = 0; i < salesPeople.length; i++) {
                    if (salesPeople[i] == null) {
                        continue;
                    }
                    if (salesPeople[i].getIdNumber() == idNum) {
                        salesPeople[i] = null;
                    } else {
                        System.out.println("Entry does not exist.");
                        break;
                    }
                }
            } else if (menuChoice == 3) {

                System.out.print("Enter ID #: ");
                idNum = input.nextInt();

                for (int i = 0; i < salesPeople.length; i++) {
                    if (salesPeople[i] == null) {;
                        continue;
                    }
                    if (salesPeople[i].getIdNumber() == idNum) {
                        salesPeople[i].setIdNumber(idNum);
                        System.out.print("Enter annual sales: ");
                        annualSale = input.nextDouble();
                        salesPeople[i].setAnnualSales(annualSale);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Entry does not exist.");
                }
            } else if (menuChoice == 4) {
                keep_running = "n";
            } else {
                System.out.println("Not a valid menu selection.");
            }
            for (int i = 0; i < salesPeople.length; i++) {
                if (salesPeople[i] == null) {
                    continue;
                }
                System.out.println();
                System.out.println("Object Reference: " + salesPeople[i]);
                System.out.println("ID Number: " + salesPeople[i].getIdNumber());
                System.out.println("Annual Sales: $" + salesPeople[i].getAnnualSales());
                System.out.println();
            }
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("Welcome to Salesperson Database");
        System.out.println("*******************************");
        System.out.println("1. Add a record to the database");
        System.out.println("2. Delete a record from the database");
        System.out.println("3. Change a record in the database");
        System.out.println("4. Exit");
        System.out.println();
    }
}
