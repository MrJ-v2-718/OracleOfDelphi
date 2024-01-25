public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 69;
        int INCHES_IN_FOOT = 12;

        System.out.println(inches + " inches is equal to " + 
        (inches / INCHES_IN_FOOT) + " feet and " + 
        (inches % INCHES_IN_FOOT) + " inches.");
    }
}