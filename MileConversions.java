public class MileConversions {
    public static void main(String[] args) {
        int INCHES_IN_MILE = 63360;
        int FEET_IN_MILE = 5280;
        int YARDS_IN_MILE = 1760;
        int miles = 1;

        System.out.println(miles + " mile(s) is equal to " + 
        (INCHES_IN_MILE * miles) + " inches, " + (FEET_IN_MILE * miles) + 
        " feet, or " + (YARDS_IN_MILE * miles) + " yards.");
    }
}