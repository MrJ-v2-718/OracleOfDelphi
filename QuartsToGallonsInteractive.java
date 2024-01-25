import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int quartsNeeded;
        
        Scanner input = new Scanner(System.in);
        quartsNeeded = input.nextInt();

        int QUARTS_IN_GALLON = 4;
        int gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON; 
        int remainderQuarts = quartsNeeded % QUARTS_IN_GALLON;

        System.out.println("A job that needs " + quartsNeeded + 
        " quarts requires " + gallonsNeeded + " gallons plus " + 
        remainderQuarts + " quarts.");
    }
}