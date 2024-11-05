/* --------------------------------
    Name: MrJ
    Date: 11/05/2024
    Instructor: Yoda
    Class: Java II
    Purpose: The VotingQueue2 program processes voters as they arrive.
  ---------------------------------  */


import jsjf.CircularArrayQueue;
import jsjf.exceptions.EmptyCollectionException;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class VotingQueue2 {
    /*-----------------------------------------------------------------------------
     *   This program should use the Scanner class to input the number of voters arriving at a
     *	voting precinct. There are 2 items on each line (record) in the file:
     *		(1)  A sequential car number
     *		(2)  The number of voters arriving in the car
     *
     *
     *   This program will be used to process the voters in a queue.
     *---------------------------------------------------------------------------------*/

    public static void main(String[] args) throws IOException {
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>();
        Scanner scanner = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter("VoterReport.txt");
        int voterCount, voterNumber = 0, votingTime, totalVotingTime = 0;
        Random random = new Random();
        LocalDateTime time = LocalDateTime.now();
        String month = String.valueOf(time.getMonth());
        String day = String.valueOf(time.getDayOfMonth());
        String year = String.valueOf(time.getYear());
        boolean endProgram = false;
        int menuSelection;
        String voterRecord = "";

        //-----------------------------------------------------------
        //  Create report headers
        //-----------------------------------------------------------
        outFile.println("***********VOTER REPORT***********");
        outFile.println("  Voter Number    Voting Time");

        //-----------------------------------------------------------
        //  Create a queue of voters
        //-----------------------------------------------------------
        while (!endProgram) {
            try {
                displayMenu();
                menuSelection = Integer.parseInt(scanner.nextLine());
                switch (menuSelection) {
                    case 1:
                        System.out.print("Please enter the number of voters in the car: ");
                        voterCount = Integer.parseInt(scanner.nextLine());
                        queue.enqueue(voterCount);
                        System.out.println("Added " + voterCount + " voters.");
                        break;
                    case 2:
                        voterCount = queue.dequeue();
                        for (int i = 0; i < voterCount; i++) {
                            voterNumber++;
                            votingTime = random.nextInt(60, 900);
                            totalVotingTime += votingTime;

                            //-----------------------------------------------------------
                            //  Add car to voter report
                            //-----------------------------------------------------------
                            outFile.println("    " + voterNumber + "                " + votingTime);

                            //-----------------------------------------------------------
                            //  Add car to voter record
                            //-----------------------------------------------------------
                            voterRecord += "    " + voterNumber + "                " + votingTime + "\n";
                        }
                        System.out.println("Processed " + voterCount + " voters.");
                        break;
                    case 3:
                        if (voterNumber == 0) {
                            System.out.println("No statistics available.");
                            continue;
                        }
                        System.out.println();
                        System.out.println("***********VOTER REPORT***********");
                        System.out.println("  Voter Number    Voting Time");
                        System.out.println(voterRecord);
                        System.out.println("Report Date: " + month + "-" + day + "-" + year);
                        System.out.println("Total Voters: " + voterNumber);
                        System.out.println("Total Voting Time: " + totalVotingTime);
                        System.out.println("Average Voting Time: " + (totalVotingTime / voterNumber));
                        System.out.println("Cars Remaining: " + queue.size());
                        System.out.println();
                        break;
                    case 4:
                        outFile.println("\nReport Date: " + month + "-" + day + "-" + year);
                        outFile.println("Total Voters: " + voterNumber);
                        outFile.println("Total Voting Time: " + totalVotingTime);
                        if (voterNumber != 0) {
                            outFile.println("Average Voting Time: " + (totalVotingTime / voterNumber));
                        }
                        outFile.println("Cars Remaining: " + queue.size());
                        outFile.close();
                        endProgram = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a number.");
            } catch (ArithmeticException exception) {
                System.out.println("No statistics available.");
                break;
            } catch (EmptyCollectionException exception) {
                System.out.println("The queue is empty.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("Please Select From The Following Menu: ");
        System.out.println("1 - Add A Carload Of Voters To The Queue");
        System.out.println("2 - Process Voters From A Car Into A Report");
        System.out.println("3 - Display Voter Statistics");
        System.out.println("4 - End The Program");
        System.out.println();
    }
}
