import java.util.*;

public class BarChart {
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
        System.out.println("Points for Game");
        System.out.println();

        System.out.print("Ali ");
        for (int i = aliPts; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Bob ");
        for (int i = bobPts; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Cai ");
        for (int i = caiPts; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Dan ");
        for (int i = danPts; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Eli ");
        for (int i = eliPts; i > 0; i--) {
            System.out.print("*");
        }
        System.out.println();
    }
}
