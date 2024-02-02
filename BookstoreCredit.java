import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your GPA: ");
        double gpa = input.nextDouble();

        calculateCredit(name, gpa);
    }

    public static void calculateCredit(String name, double gpa) {
        double totalCredit = 10 * gpa;
        System.out.println(name + ", you have a grade point average of " + 
        gpa + ". This has earned you $" + totalCredit + " in bookstore credit.");
    }
}