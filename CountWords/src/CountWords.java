import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        int numberOfWords = 0;
        int stringLength;
        char c, c2;

        System.out.print("Enter a string >> ");
        userInput = input.nextLine();

        stringLength = userInput.length();

        for (int i = 0; i < stringLength - 1; i++) {
            c = userInput.charAt(i);
            c2 = userInput.charAt(i + 1);

            if (!Character.isWhitespace(c) && Character.isWhitespace(c2)) {
                numberOfWords += 1;
            }
            if (i == stringLength - 2 && (Character.isLetter(c2) || !Character.isWhitespace(c2))) {
                // Accounts for ending a sentence w/o punctuation
                numberOfWords += 1;
            }
        }
        System.out.println("There are " + numberOfWords + " words in the string");
    }
}
