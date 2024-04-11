import java.util.Scanner;

public class CategorizeStrings2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput;
        boolean isEmpty = true;
        int numberOfSpaces = 0;
        String[] noSpaces = new String[20];
        String[] oneSpace = new String[20];
        String[] moreThanOne = new String[20];
        final String noSpacesList = "none";
        final String oneSpaceList = "one";
        final String moreThanOneList = "more";
        final String sentinelValue = "0";

        System.out.println("Enter up to 20 strings to evaluate and 0 to end entry.");
        System.out.print("Enter a string >> ");
        userInput = input.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (c == ' ') {
                numberOfSpaces += 1;
            }
        }

        int i = 0;
        if (numberOfSpaces == 0) {
            noSpaces[i] = userInput;
        } else if (numberOfSpaces == 1) {
            oneSpace[i] = userInput;
        } else {
            moreThanOne[i] = userInput;
        }

        while (!userInput.equals(sentinelValue) && (i + 1) < 20) {
            numberOfSpaces = 0;
            i++;
            System.out.print("Enter a string >> ");
            userInput = input.nextLine();
            for (int j = 0; j < userInput.length(); j++) {
                char c = userInput.charAt(j);
                if (c == ' ') {
                    numberOfSpaces += 1;
                }
            }
            if (numberOfSpaces == 0) {
                noSpaces[i] = userInput;
            } else if (numberOfSpaces == 1) {
                oneSpace[i] = userInput;
            } else {
                moreThanOne[i] = userInput;
            }

        }

        userInput = "1";
        while (!userInput.equals(sentinelValue)) {
            System.out.print("Which type of string list? (none/one/more) 0 to terminate >> ");
            userInput = input.nextLine();
            if (userInput.equals(noSpacesList)) {
                isEmpty = true;
                for (i = 0; i < noSpaces.length; i++) {
                    for (int j = 0; j < noSpaces.length; j++) {
                        if (noSpaces[j] != null) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (isEmpty) {
                        System.out.println("The list has no strings.");
                        break;
                    } else {

                        if (noSpaces[i] != null && !noSpaces[i].equals(sentinelValue)) {
                            System.out.println(noSpaces[i]);
                        }

                    }
                }
            } else if (userInput.equals(oneSpaceList)) {
                isEmpty = true;
                for (i = 0; i < oneSpace.length; i++) {
                    for (int j = 0; j < oneSpace.length; j++) {
                        if (oneSpace[j] != null) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (isEmpty) {
                        System.out.println("The list has no strings.");
                        break;
                    } else {

                        if (oneSpace[i] != null && !oneSpace[i].equals(sentinelValue)) {
                            System.out.println(oneSpace[i]);
                        }

                    }
                }
            } else if (userInput.equals(moreThanOneList)) {
                isEmpty = true;
                for (i = 0; i < moreThanOne.length; i++) {
                    for (int j = 0; j < moreThanOne.length; j++) {
                        if (moreThanOne[j] != null) {
                            isEmpty = false;
                            break;
                        }
                    }
                    if (isEmpty) {
                        System.out.println("The list has no strings.");
                        break;
                    } else {

                        if (moreThanOne[i] != null && !moreThanOne[i].equals(sentinelValue)) {
                            System.out.println(moreThanOne[i]);
                        }

                    }
                }
            } else {
                // Print all
                for (int j = 0; j < noSpaces.length; j++) {
                    if (noSpaces[j] != null && !noSpaces[j].equals(sentinelValue)) {
                        System.out.println(noSpaces[j]);
                    }
                }
                for (int j = 0; j < oneSpace.length; j++) {
                    if (oneSpace[j] != null && !oneSpace[j].equals(sentinelValue)) {
                        System.out.println(oneSpace[j]);
                    }
                }
                for (int j = 0; j < moreThanOne.length; j++) {
                    if (moreThanOne[j] != null && !moreThanOne[j].equals(sentinelValue)) {
                        System.out.println(moreThanOne[j]);
                    }
                }

            }
        }
    }
}
