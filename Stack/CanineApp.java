/* --------------------------------
   Name: MrJ
   Date: 11/01/2024
   Instructor: Yoda
   Class: Java II
   Purpose: The CanineApp program tracks a companion dogs movement, which
   is used to guide the owner home should they become lost, or to notify a
   family member of the shortest route to their location.
  ---------------------------------  */

import jsjf.ArrayStack;

import java.util.Scanner;

public class CanineApp {

    public static void main(String[] args) {
        /* --------------------------------
        Instantiate an ArrayStack of the String type
        ---------------------------------  */
        ArrayStack<String> stack = new ArrayStack<>();
        Scanner scanner = new Scanner(System.in);
        String getHome;
        int userInput = 0;

        /* --------------------------------
        While loop receives user input for directions traveled
        ---------------------------------  */
        while (userInput != -1) {
            try {
                System.out.println(
                        "Enter A Direction\n" +
                                "1 = North\n" +
                                "2 = South\n" +
                                "3 = East\n" +
                                "4 = West\n" +
                                "-1 = Finish"
                );
                userInput = Integer.parseInt(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        stack.push("North");
                        break;
                    case 2:
                        stack.push("South");
                        break;
                    case 3:
                        stack.push("East");
                        break;
                    case 4:
                        stack.push("West");
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a number.");
            }
        }
        /* --------------------------------
        call the returnHome() method and pass it the stack
        ---------------------------------  */
        getHome = returnHome(stack);
        System.out.println(getHome);
    }

    public static String returnHome(ArrayStack<String> stack) {
        String directionsHome = "";
        String directionsToOwner = "";
        String direction;
        int northBlocks = 0, southBlocks = 0, eastBlocks = 0, westBlocks = 0;
        int northSouthDifference, eastWestDifference;

        /* --------------------------------
        Traverse through the stack, popping each element and reversing it before
        adding it to the directionsHome string.
        ---------------------------------  */
        while (!stack.isEmpty()) {
            direction = stack.pop();
            switch (direction) {
                case "North":
                    northBlocks++;
                    directionsHome += " South ";
                    break;
                case "South":
                    southBlocks++;
                    directionsHome += " North ";
                    break;
                case "East":
                    eastBlocks++;
                    directionsHome += " West ";
                    break;
                case "West":
                    westBlocks++;
                    directionsHome += " East ";
                    break;
                default:
                    break;
            }
        }

        /* --------------------------------
        Calculate the North/South difference
        for the shortest route to the owner.
        ---------------------------------  */
        System.out.println("*****Shortest Route to Owner*****");
        if (northBlocks > southBlocks) {
            northSouthDifference = northBlocks - southBlocks;
            directionsToOwner += (northSouthDifference + " block(s) North\n");
        } else if (southBlocks > northBlocks) {
            northSouthDifference = southBlocks - northBlocks;
            directionsToOwner += (northSouthDifference + " block(s) South\n");
        } else {
            northSouthDifference = 0;
        }

        /* --------------------------------
        Calculate the East/West difference
        for the shortest route to the owner.
        ---------------------------------  */
        if (eastBlocks > westBlocks) {
            eastWestDifference = eastBlocks - westBlocks;
            directionsToOwner += (eastWestDifference + " block(s) East.\n");
        } else if (westBlocks > eastBlocks) {
            eastWestDifference = westBlocks - eastBlocks;
            directionsToOwner += (eastWestDifference + " block(s) West.\n");
        } else {
            eastWestDifference = 0;
        }

        /* --------------------------------
        Return the shortest route to owner and directions
        home in an easy to read format.
        ---------------------------------  */
        return directionsToOwner + "\n*********Directions Home*********\n" + directionsHome;
    }
}
