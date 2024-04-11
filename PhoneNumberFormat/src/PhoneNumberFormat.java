import java.util.Scanner;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String sentinel = "999";
        String userInput = "1";


        while (!userInput.equals(sentinel)) {
            System.out.print("Enter a ten digit phone number or 999 to terminate >> ");
            userInput = input.nextLine();
            if (userInput.length() == 10) {
                StringBuilder phoneNumber = new StringBuilder(userInput);
                phoneNumber.insert(0, "(");
                phoneNumber.insert(4, ")");
                phoneNumber.insert(5, " ");
                phoneNumber.insert(9, "-");
                System.out.println(phoneNumber);
            }
        }
    }
}
