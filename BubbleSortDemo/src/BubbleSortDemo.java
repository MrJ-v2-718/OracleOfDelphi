import java.util.Scanner;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] someNumbers = new int[5];
        int comparisonsToMake = someNumbers.length - 1;
        Scanner input = new Scanner(System.in);
        int i, j, temp;

        for (i = 0; i < someNumbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            someNumbers[i] = input.nextInt();
        }
        display(someNumbers, 0);

        for (i = 0; i < someNumbers.length - 1; i++) {
            for (j = 0; j < comparisonsToMake; j++) {
                if (someNumbers[j] > someNumbers[j + 1]) {
                    temp = someNumbers[j];
                    someNumbers[j] = someNumbers[j + 1];
                    someNumbers[j + 1] = temp;
                }
            }
            display(someNumbers, (i + 1));
            comparisonsToMake--;
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
