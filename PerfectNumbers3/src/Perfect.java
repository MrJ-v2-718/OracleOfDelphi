import java.util.*;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to search to: ");
        int searchTo = input.nextInt();

        for (int n = 2; n <= searchTo; n++) {
            if (isPerfect(n)) {
                System.out.println(n + " is a perfect number.");
            }
        }
    }

    static boolean isPerfect(int n) {
        int s = 1;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                if (i*i != n) {
                    s = s + i + n / i;
                } else {
                    s += i;
                }
            }
        }
        if (s == n && n != 1) {
            return true;
        } else {
            return false;
        }
    }
}
