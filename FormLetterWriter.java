import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter your first name: ");
        String lastName = input.nextLine();

        displaySalutation(firstName);
        displaySalutation(firstName, lastName);

    }

    public static void displaySalutation(String first) {
        System.out.println("Dear " + first);
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String first, String last) {
        System.out.println("Dear " + first + " " + last);
        System.out.println("Thank you for your recent order.");
    }
}