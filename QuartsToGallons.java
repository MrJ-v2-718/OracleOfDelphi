public class QuartsToGallons {
    public static void main(String[] args) {
        int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON; 
        int remainderQuarts = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs " + quartsNeeded + 
        " quarts requires " + gallonsNeeded + " gallons plus " + 
        remainderQuarts + " quarts.");
    }
}