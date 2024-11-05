/* --------------------------------
    Name: MrJ
    Date: 11/05/2024
    Instructor: Yoda
    Class: Java II
    Purpose: The VotingQueue program processes a list of cars
    and voters contained in the Voters.csv file.
  ---------------------------------  */


import jsjf.CircularArrayQueue;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class VotingQueue {
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
        CircularArrayQueue<Integer> queue = new CircularArrayQueue<>(120);
        Scanner fileScan = new Scanner(new File("Voters.csv"));
        PrintWriter outFile = new PrintWriter("VoterReport.txt");
        String string;
        int index, voterCount, voterNumber = 0, votingTime, totalVotingTime = 0;
        Random random = new Random();
        LocalDateTime time = LocalDateTime.now();
        String month = String.valueOf(time.getMonth());
        String day = String.valueOf(time.getDayOfMonth());
        String year = String.valueOf(time.getYear());

        //-----------------------------------------------------------
        //  Create a queue of voters
        //-----------------------------------------------------------
        while (fileScan.hasNext()) {
            //-----------------------------------------------------------
            //  Extract voter count from each line of Voters.csv
            //-----------------------------------------------------------
            string = fileScan.nextLine();
            index = string.indexOf(",");
            string = string.substring(index + 1);
            voterCount = Integer.parseInt(string);

            //-----------------------------------------------------------
            //  Add voter count to the queue
            //-----------------------------------------------------------
            queue.enqueue(voterCount);
        }


        //-----------------------------------------------------------
        //  Print headings for the voter report
        //-----------------------------------------------------------
        outFile.println("***********VOTER REPORT***********");
        outFile.println("  Voter Number    Voting Time");


        //-----------------------------------------------------------
        //  Process a queue of voters
        //-----------------------------------------------------------
        for (int i = 0; i < queue.size(); i++) {
            voterCount = queue.dequeue();
            for (int j = 0; j < voterCount; j++) {
                voterNumber++;
                votingTime = random.nextInt(60, 900);
                totalVotingTime += votingTime;
                outFile.println("    " + voterNumber + "                " + votingTime);
            }
        }
        outFile.println("\nReport Date: " + month + "-" + day + "-" + year);
        outFile.println("Total Voters: " + voterNumber);
        outFile.println("Total Voting Time: " + totalVotingTime);
        outFile.println("Average Voting Time: " + (totalVotingTime / voterNumber));
        outFile.close();
    }
}
