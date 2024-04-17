import java.util.Scanner;

public class InsertionSortDemo {

    public static void main(String[] args) {
        int[] someNumbers = new int[5];
        Scanner input = new Scanner(System.in);
        int i, j, temp;

        for (i = 0; i < someNumbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            someNumbers[i] = input.nextInt();
        }
        display(someNumbers, 0);

        i = 1;
        while (i < someNumbers.length) {
            temp = someNumbers[i];
            j = i - 1;
            while (j >= 0 && someNumbers[j] > temp) {
                someNumbers[j + 1] = someNumbers[j];
                j--;
            }
            someNumbers[j + 1] = temp;
            display(someNumbers, i);
            i++;
        }
    }

    public static void display(int[] someNumbers, int i) {
        System.out.print("Iteration " + i + ": ");
        for (int someNumber : someNumbers) {
            System.out.print(someNumber + " ");
        }
        System.out.println();
    }
}
