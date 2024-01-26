public class MoonWeight {
    public static void main(String[] args) {
        // A program to calculate your weight on the Moon.
        double earthPounds = 160.0;
        double moonPounds;
        double gFactor = 0.165;

        moonPounds = earthPounds * gFactor;


        System.out.println("Your weight on the Moon is " +
                moonPounds + " pounds.");

    }
}
