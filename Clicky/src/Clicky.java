import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Clicky {
    public static void main(String[] args) throws AWTException {
        Robot clicky = new Robot();
        Random randy = new Random();
        Scanner scanny = new Scanner(System.in);
        LocalDateTime startTime, endTime;
        int difference;
        // Set the number of clicks
        System.out.print("How many clicks? >>> ");
        int iterations = scanny.nextInt();

        clicky.mouseMove(300, 300);
        startTime = LocalDateTime.now();
        int startMinute = startTime.getMinute();
        int startSeconds = startTime.getSecond();

        for (int i = 0; i < iterations; i++) {
            // Averages 12.5 clicks per second
            int clickDelay = randy.nextInt(50, 100);
            // Press left mouse button
            clicky.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            // Release left mouse button
            clicky.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            // Wait between 50 and 100 milliseconds
            clicky.delay(clickDelay);
        }

        endTime = LocalDateTime.now();
        int endMinute = endTime.getMinute();
        int endSeconds = endTime.getSecond();
        if (startMinute == endMinute) {
            difference = endSeconds - startSeconds;
        } else {
            difference = ((endMinute - startMinute) * 60) + (endSeconds - startSeconds);
        }


        JOptionPane.showMessageDialog(null,
                "Time: " + difference + " seconds");
    }
}
