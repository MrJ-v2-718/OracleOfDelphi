public class ChiliToGo {
    public static void main(String[] args) {
        int ADULT_MEAL_PRICE = 7;
        int CHILD_MEAL_PRICE = 4;

        int adultOrders = 1;
        int childOrders = 1;

        int adultTotal = adultOrders * ADULT_MEAL_PRICE;
        int childTotal = childOrders * CHILD_MEAL_PRICE;
        int totalCollected = (adultOrders * ADULT_MEAL_PRICE) + 
        (childOrders * CHILD_MEAL_PRICE);

        System.out.println("The total money collected for adults meals is $" + 
        adultTotal + ".");
        System.out.println("The total money collected for children's meals is $" + 
        childTotal + ".");
        System.out.println("The total money collected for all meals is $" + 
        totalCollected + ".");
    }
}