import java.util.*;

public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite inspirational quote: ");
        String quote = input.nextLine();
        int numSpaces = 0;

        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                numSpaces += 1;
            }
        }
        System.out.println(numSpaces);
    }
}