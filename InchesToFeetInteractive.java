import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        int INCHES_IN_FOOT = 12;

        System.out.println(inches + " inches is equal to " + 
        (inches / INCHES_IN_FOOT) + " feet and " + 
        (inches % INCHES_IN_FOOT) + " inches.");
    }
}