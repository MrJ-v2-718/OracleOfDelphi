import java.util.Scanner;

public class BookBilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books ordered: ");
        int quantityOrdered = input.nextInt();

        System.out.print("Enter coupon value: $");
        double couponValue = input.nextDouble();

        double calculatedTotal1 = computeBill();
        System.out.println("The first method total is $" + calculatedTotal1);

        double calculatedTotal2 = computeBill(quantityOrdered);
        System.out.println("The second method total is $" + calculatedTotal2);

        double calculatedTotal3 = computeBill(quantityOrdered, couponValue);
        System.out.println("The third method total is $" + calculatedTotal3);
        
    }

    public static double computeBill() {
        double taxRate = 0.08;
        double total = 14.99 + (14.99 * taxRate);
        return total;
    }

    public static double computeBill(int quantity) {
        double taxRate = 0.08;
        double bookPrice = 14.99;
        double subtotal = quantity * bookPrice;
        double total = subtotal + (subtotal * taxRate);
        return total;
    }

    public static double computeBill(int quantity, double coupon) {
        double taxRate = 0.08;
        double bookPrice = 14.99;
        double subtotal = quantity * bookPrice;
        subtotal = subtotal - coupon;
        double total = subtotal + (subtotal * taxRate);
        return total;
    }
}