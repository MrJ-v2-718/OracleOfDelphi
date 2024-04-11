public class CountSpaces {
    public static void main(String[] args) {
        String quote = "Mighty Oaks from little acorns grow.";
        int numSpaces = 0;

        for (int i = 0; i < quote.length(); i++) {
            if (quote.charAt(i) == ' ') {
                numSpaces += 1;
            }
        }
        System.out.println(numSpaces);
    }
}
