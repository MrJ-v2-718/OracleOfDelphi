//****************************************************************************
//  Name: MrJ
//  Date: 10/04/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: The FrequencyAnalysis program analyzes the occurrences of letters
//  in a user specified file.
//****************************************************************************

import java.io.*;
import javax.swing.*;

public class FrequencyAnalysis {
    public static void main(String[] args) throws IOException {
        int[] letterFrequency = new int[26];
        FileReader inFile = null;

        //--------------------------------------------------------------
        //  Allow the user to select a file for frequency analysis
        //--------------------------------------------------------------
        JFileChooser chosenFile = new JFileChooser();
        int chooserStatus = chosenFile.showOpenDialog(null);

        if (chooserStatus != JFileChooser.APPROVE_OPTION) {
            System.out.println("No File Selected");
        } else {
            //---------------------------------------------------------
            //  Declaration of the file object that was chosen
            //---------------------------------------------------------
            File file = chosenFile.getSelectedFile();

            try {
                //----------------------------------------------------------
                //  Passing the file object to the FileReader
                //----------------------------------------------------------
                inFile = new FileReader(file);

                int characterAscii;
                double total = 0;
                String letter;
                //----------------------------------------------------------------
                //   characterAscii will contain the ASCII value of each character
                //   -1 means the end of the file has been reached
                //-----------------------------------------------------------------
                System.out.println("***Starting Analysis***");
                while ((characterAscii = inFile.read()) != -1) {
                    letter = String.valueOf((char) characterAscii).toLowerCase();
                    //-------------------------------------------------------------
                    //  Increment the letterFrequency array according to the letter
                    //  that was read. Index 0-25 represents the alphabet (a-z).
                    //-------------------------------------------------------------
                    switch (letter) {
                        case "a":
                            total++;
                            letterFrequency[0]++;
                            break;
                        case "b":
                            total++;
                            letterFrequency[1]++;
                            break;
                        case "c":
                            total++;
                            letterFrequency[2]++;
                            break;
                        case "d":
                            total++;
                            letterFrequency[3]++;
                            break;
                        case "e":
                            total++;
                            letterFrequency[4]++;
                            break;
                        case "f":
                            total++;
                            letterFrequency[5]++;
                            break;
                        case "g":
                            total++;
                            letterFrequency[6]++;
                            break;
                        case "h":
                            total++;
                            letterFrequency[7]++;
                            break;
                        case "i":
                            total++;
                            letterFrequency[8]++;
                            break;
                        case "j":
                            total++;
                            letterFrequency[9]++;
                            break;
                        case "k":
                            total++;
                            letterFrequency[10]++;
                            break;
                        case "l":
                            total++;
                            letterFrequency[11]++;
                            break;
                        case "m":
                            total++;
                            letterFrequency[12]++;
                            break;
                        case "n":
                            total++;
                            letterFrequency[13]++;
                            break;
                        case "o":
                            total++;
                            letterFrequency[14]++;
                            break;
                        case "p":
                            total++;
                            letterFrequency[15]++;
                            break;
                        case "q":
                            total++;
                            letterFrequency[16]++;
                            break;
                        case "r":
                            total++;
                            letterFrequency[17]++;
                            break;
                        case "s":
                            total++;
                            letterFrequency[18]++;
                            break;
                        case "t":
                            total++;
                            letterFrequency[19]++;
                            break;
                        case "u":
                            total++;
                            letterFrequency[20]++;
                            break;
                        case "v":
                            total++;
                            letterFrequency[21]++;
                            break;
                        case "w":
                            total++;
                            letterFrequency[22]++;
                            break;
                        case "x":
                            total++;
                            letterFrequency[23]++;
                            break;
                        case "y":
                            total++;
                            letterFrequency[24]++;
                            break;
                        case "z":
                            total++;
                            letterFrequency[25]++;
                            break;
                        default:
                            break;
                    }
                }
                //-------------------------------------------------------------
                //  Generate a frequency report of each letter and the number
                //  of occurrences for that letter.
                //-------------------------------------------------------------
                char letterTracker = 'A';
                String frequencyReport = "Letter - Occurrences - Percentage";
                for (int i = 0; i < letterFrequency.length; i++) {
                    frequencyReport += ("\n   " + letterTracker + "     -     " + letterFrequency[i] +
                            "     -     " + String.format("%,.2f", ((letterFrequency[i] / total) * 100)) + "%");
                    letterTracker++;
                }
                System.out.println(frequencyReport);

                //-------------------------------------------------------------
                //  Produce a GUI showing the results of the Frequency Analysis
                //-------------------------------------------------------------
                JOptionPane.showMessageDialog(null, frequencyReport,
                        "Frequency Report", JOptionPane.INFORMATION_MESSAGE);

            } finally {
                //---------------------------------------------------------
                //  After processing, close the input file
                //---------------------------------------------------------
                System.out.println("***Analysis Complete***");
                if (inFile != null) {
                    inFile.close();
                }
            }
        }
    }
}
