import java.util.*;

public class BarChart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter points earned by Ali: ");
        int aliPts = input.nextInt();

        System.out.print("Enter points earned by Bob: ");
        int bobPts = input.nextInt();

        System.out.print("Enter points earned by Cai: ");
        int caiPts = input.nextInt();

        System.out.print("Enter points earned by Dan: ");
        int danPts = input.nextInt();

        System.out.print("Enter points earned by Eli: ");
        int eliPts = input.nextInt();

        System.out.println();
        System.out.println("Points for Season");
        System.out.println("One asterisk for every 10 points");
        System.out.println();

        System.out.print("Ali ");
        for (int i = aliPts; i >= 10;) {
            System.out.print("*");
            i -= 10;
        }
        System.out.println();

        System.out.print("Bob ");
        for (int i = bobPts; i >= 10;) {
            System.out.print("*");
            i -= 10;
        }
        System.out.println();

        System.out.print("Cai ");
        for (int i = caiPts; i >= 10;) {
            System.out.print("*");
            i -= 10;
        }
        System.out.println();

        System.out.print("Dan ");
        for (int i = danPts; i >= 10;) {
            System.out.print("*");
            i -= 10;
        }
        System.out.println();

        System.out.print("Eli ");
        for (int i = eliPts; i >= 10;) {
            System.out.print("*");
            i -= 10;
        }
        System.out.println();
    }
}
