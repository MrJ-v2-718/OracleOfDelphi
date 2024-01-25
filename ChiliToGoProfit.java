public class ChiliToGoProfit {
    public static void main(String[] args) {
        int ADULT_MEAL_PRICE = 7;
        int CHILD_MEAL_PRICE = 4;
        double ADULT_MEAL_COST = 4.35;
        double CHILD_MEAL_COST = 3.10;

        int adultOrders = 1;
        int childOrders = 1;

        double adultTotal = adultOrders * (ADULT_MEAL_PRICE - ADULT_MEAL_COST);
        double childTotal = childOrders * (CHILD_MEAL_PRICE - CHILD_MEAL_COST);
        double totalCollected = adultTotal + childTotal;

        System.out.println("The total profit collected for adults meals is $" + 
        adultTotal + ".");
        System.out.println("The total profit collected for children's meals is $" + 
        childTotal + ".");
        System.out.println("The total profit collected for all meals is $" + 
        totalCollected + ".");
    }
}