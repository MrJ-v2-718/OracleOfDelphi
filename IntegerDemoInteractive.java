import java.util.Scanner;

public class IntegerDemoInteractive {
    public static void main(String[] args) {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer >> ");
        anInt = input.nextInt();

        System.out.println("Please enter a byte >> ");
        aByte = input.nextByte();

        System.out.println("Please enter a short >> ");
        aShort = input.nextShort();

        System.out.println("Please enter a long >> ");
        aLong = input.nextLong();

        // Be sure to clear the enter keystroke left in memory
        // before accepting any string input or it will skip it.
        input.nextLine();

        // New Line
        System.out.println();

        System.out.println("Please enter your name >> ");
        name = input.nextLine();
        System.out.println();
        System.out.println("Thank you, " + name);

        // If anInt is too high, then this arithmetic 
        // exceeds the maximum value for an integer
        // and once the max value is reached, it continues with
        // the minimum value and counts up, wrapping around in a loop.
        // Integer range: -2,147,483,648 to 2,147,483,647
        int anotherInt = anInt * 10_000_000;

        System.out.println("The int is   " + anInt);
        System.out.println("The byte is  " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is  " + aLong);
        System.out.println("Another int is " + anotherInt);
    }
}