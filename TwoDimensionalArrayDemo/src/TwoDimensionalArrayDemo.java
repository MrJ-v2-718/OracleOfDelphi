import java.util.Scanner;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] count = new int[3][3];

        Scanner input = new Scanner(System.in);
        int row, column;
        final int QUIT = 99;

        System.out.print("Enter a row or " + QUIT + " to quit: ");
        row = input.nextInt();

        while (row != QUIT) {
            System.out.print("Enter a column: ");
            column = input.nextInt();

            if (row < count.length && column < count[row].length) {
                count[row][column]++;

                for (int i = 0; i < count.length; i++) {
                    for (int j = 0; j < count[i].length; j++) {
                        System.out.print(count[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid position selected.");
            }
            System.out.print("Enter a row or " + QUIT + " to quit: ");
            row = input.nextInt();
        }
    }
}
