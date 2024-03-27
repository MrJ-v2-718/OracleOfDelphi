import java.util.*;

public class Inbetween {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        n1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        n2 = input.nextInt();

        if (n1 < n2) {
            if (n2 - n1 <= 1) {
                System.out.println("There are no integers between the entered values.");
            } else {
                while (n1 < n2 - 1) {
                    n1 += 1;
                    System.out.println(n1);
                }
            }
        } else if (n2 < n1) {
            if (n1 - n2 <= 1) {
                System.out.println("There are no integers between the entered values.");
            } else {
                while (n2 < n1 - 1) {
                    n2 += 1;
                    System.out.println(n2);
                }
            }
        } else {
            System.out.println("There are no integers between the entered values.");
        }
    }
}
