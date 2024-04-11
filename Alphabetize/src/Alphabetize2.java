import java.util.Scanner;

public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput1, userInput2, userInput3;
        String position1, position2, position3;

        System.out.print("Enter the first string >> ");
        userInput1 = input.nextLine();
        System.out.print("Enter the second string >> ");
        userInput2 = input.nextLine();
        System.out.print("Enter the third string >> ");
        userInput3 = input.nextLine();

        if (userInput1.compareToIgnoreCase(userInput2) < 0) {
            if (userInput1.compareToIgnoreCase(userInput3) < 0) {
                position1 = userInput1;
                if (userInput2.compareToIgnoreCase(userInput3) < 0) {
                    position2 = userInput2;
                    position3 = userInput3;
                } else {
                    position2 = userInput3;
                    position3 = userInput2;
                }
            } else {
                position1 = userInput3;
                if (userInput2.compareToIgnoreCase(userInput1) < 0) {
                    position2 = userInput2;
                    position3 = userInput1;
                } else {
                    position2 = userInput1;
                    position3 = userInput2;
                }
            }
        } else {
            if (userInput2.compareToIgnoreCase(userInput3) < 0) {
                position1 = userInput2;
                if (userInput1.compareToIgnoreCase(userInput3) < 0) {
                    position2 = userInput1;
                    position3 = userInput3;
                } else {
                    position2 = userInput3;
                    position3 = userInput1;
                }
            } else {
                position1 = userInput3;
                if (userInput2.compareToIgnoreCase(userInput1) < 0) {
                    position2 = userInput2;
                    position3 = userInput1;
                } else {
                    position2 = userInput1;
                    position3 = userInput2;
                }
            }
        }
        System.out.println(position1);
        System.out.println(position2);
        System.out.println(position3);
    }
}