public class IntegerDemo {
    public static void main(String[] args) {
        int anInt = 1234;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;

        // This arithmetic exceeds the maximum value for an integer
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