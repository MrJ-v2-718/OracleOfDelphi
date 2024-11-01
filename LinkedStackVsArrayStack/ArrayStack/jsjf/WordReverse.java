package jsjf;

import java.util.Scanner;

/**
 * Name: MrJ
 * Date: 11/01/2024
 * Instructor: Yoda
 * Class: Java II
 * Purpose: The WordReverse program reads a sentence from a user and prints it with
 * the characters of each word in reverse.
 */

public class WordReverse {
    public static void main(String[] args) {
        String sentence, word, reversedWord = "", reversedWordSentence = "";
        int index;
        char[] wordArray;
        Scanner scanner = new Scanner(System.in);
        /**
         * Instantiates the ArrayStack with a character array type
         */
        ArrayStack<char[]> words = new ArrayStack<>();
        System.out.println("Enter a sentence to reverse the words: ");
        sentence = scanner.nextLine();
        sentence += " ";

        /**
         * Adds to the ArrayStack using character arrays of each word.
         */
        while (sentence.contains(" ")) {
            index = sentence.indexOf(" ");
            word = sentence.substring(0, index);
            words.push(word.toCharArray());
            sentence = sentence.substring(index + 1);
        }

        /**
         * Pops each character array from the ArrayStack and reverses it.
         * It then prepends the reversed word to the new sentence.
         */
        System.out.println("The sentence with the words reversed reads: ");
        while (!words.isEmpty()) {
            reversedWord = "";
            wordArray = words.pop();
            for (int i = wordArray.length - 1; i >= 0; i--) {
                reversedWord += wordArray[i];
            }
            reversedWordSentence = reversedWord + " " + reversedWordSentence;
        }
        System.out.println(reversedWordSentence);
    }
}
