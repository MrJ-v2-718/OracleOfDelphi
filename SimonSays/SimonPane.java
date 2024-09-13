import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;

import java.io.File;

//****************************************************************************
//  Name: MrJ
//  Date: 9/13/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Pane to create a portion of the simon game that records a sequence
//  of color selections in an array and plays a corresponding sound for each
//  color button that is selected. The user will select 8 colors. The user
//  can select the remember game button to see all previous selections.
//****************************************************************************

public class SimonPane extends GridPane {
    private int[] colorArray = new int[8];
    private int colorCount;
    private AudioClip[] colorSounds;
    private Label notificationLabel;
    private Button redButton;
    private Button greenButton;
    private Button yellowButton;
    private Button blueButton;
    private Button newGameButton;
    private Button rememberGameButton;
    private Button endGameButton;

    //--------------------------------------------------------------------
    //  Sets up a GUI containing a notification label for displaying
    //  text to the user, four color buttons, a new game button,
    //  a remember game button, and an end game button.
    //--------------------------------------------------------------------
    public SimonPane() {
        //--------------------------------------------------
        //  Implements a font style for the game
        //--------------------------------------------------
        Font font = new Font("Arial", 16);

        //--------------------------------------------------
        //  Identifies the audio files to be used for the
        //  button sounds and adds them to colorSounds[]
        //--------------------------------------------------
        File[] audioFiles = {
                new File("Red.wav"),
                new File("Blue.wav"),
                new File("Green.wav"),
                new File("Yellow.wav")
        };
        colorSounds = new AudioClip[audioFiles.length];
        for (int i = 0; i < audioFiles.length; i++) {
            colorSounds[i] = new AudioClip(audioFiles[i].toURI().toString());
        }

        //------------------------------------------------
        //  Creates a notification label for displaying
        //  text to the user.
        //------------------------------------------------
        notificationLabel = new Label("");
        notificationLabel.setFont(font);
        GridPane.setHalignment(notificationLabel, HPos.CENTER);

        //------------------------------------------------
        //  Creates 4 button objects:
        //  -Red Button
        //  -Green Button
        //  -Yellow Button
        //  -Blue Button
        //
        //  Include the names of each color inside the
        //  button to make the game colorblind accessible.
        //------------------------------------------------

        redButton = new Button("Red");
        redButton.setOnAction(this::processButtons);
        redButton.setMinHeight(150);
        redButton.setMinWidth(300);
        GridPane.setHalignment(redButton, HPos.CENTER);
        redButton.setStyle("-fx-background-color: #FF0000");
        redButton.setFont(font);
        redButton.setDisable(true);

        greenButton = new Button("Green");
        greenButton.setOnAction(this::processButtons);
        greenButton.setMinHeight(150);
        greenButton.setMinWidth(300);
        GridPane.setHalignment(greenButton, HPos.CENTER);
        greenButton.setStyle("-fx-background-color: #008000");
        greenButton.setFont(font);
        greenButton.setDisable(true);

        yellowButton = new Button("Yellow");
        yellowButton.setOnAction(this::processButtons);
        yellowButton.setMinHeight(150);
        yellowButton.setMinWidth(300);
        GridPane.setHalignment(yellowButton, HPos.CENTER);
        yellowButton.setStyle("-fx-background-color: #FFFF00");
        yellowButton.setFont(font);
        yellowButton.setDisable(true);

        blueButton = new Button("Blue");
        blueButton.setOnAction(this::processButtons);
        blueButton.setMinHeight(150);
        blueButton.setMinWidth(300);
        GridPane.setHalignment(blueButton, HPos.CENTER);
        blueButton.setStyle("-fx-background-color: #0000FF");
        blueButton.setFont(font);
        blueButton.setDisable(true);

        //------------------------------------------------
        //  Creates 3 button objects:
        //  -New Game
        //  -Remember Game
        //  -End Game
        //------------------------------------------------

        newGameButton = new Button("New Game");
        newGameButton.setOnAction(this::processButtons);
        newGameButton.setMinWidth(150);
        GridPane.setHalignment(newGameButton, HPos.CENTER);
        newGameButton.setFont(font);

        rememberGameButton = new Button("Remember Game");
        rememberGameButton.setOnAction(this::processButtons);
        rememberGameButton.setMinWidth(150);
        GridPane.setHalignment(rememberGameButton, HPos.CENTER);
        rememberGameButton.setFont(font);
        rememberGameButton.setDisable(true);

        endGameButton = new Button("End Game");
        endGameButton.setOnAction(this::processButtons);
        endGameButton.setMinWidth(150);
        GridPane.setHalignment(endGameButton, HPos.CENTER);
        endGameButton.setFont(font);

        //------------------------------------------------
        //  Settings for the JavaFX pane
        //------------------------------------------------

        setStyle("-fx-background-color: #F8F8FF");
        setPadding(new Insets(20));
        setAlignment(Pos.TOP_LEFT);
        setHgap(20);
        setVgap(20);

        //------------------------------------------------
        //  Adds the components to the pane
        //  The parameters are:
        //  -component name
        //  -column
        //  -row
        //  -number of columns the component spans
        //  -number of rows the component spans
        //
        //  For example:
        //  add(guiComponent, 0, 0, 1, 1);
        //------------------------------------------------
        add(notificationLabel, 0, 0, 2, 2);
        add(redButton, 0, 3, 1, 1);
        add(greenButton, 1, 3, 1, 1);
        add(yellowButton, 0, 4, 1, 1);
        add(blueButton, 1, 4, 1, 1);
        add(newGameButton, 0, 5, 1, 1);
        add(rememberGameButton, 1, 5, 1, 1);
        add(endGameButton, 0, 6, 2, 1);
    }

    //--------------------------------------------------------------------
    //  Handler for the buttons
    //--------------------------------------------------------------------
    public void processButtons(ActionEvent event) {
        //--------------------------------------------------------------------
        //  Handler for the new game button
        //--------------------------------------------------------------------
        if (event.getSource() == newGameButton) {
            redButton.setDisable(false);
            greenButton.setDisable(false);
            yellowButton.setDisable(false);
            blueButton.setDisable(false);
            rememberGameButton.setDisable(true);
            notificationLabel.setText("Click 8 color buttons, one at a time.");
            colorCount = 0;
            for (int i = 0; i < colorArray.length; i++) {
                colorArray[i] = 9;
            }
        }

        //--------------------------------------------------------------------
        //  Handler for the remember game button
        //--------------------------------------------------------------------
        else if (event.getSource() == rememberGameButton) {
            String notification = "";
            for (int i = 0; i < colorArray.length; i++) {
                if (colorArray[i] == 0) {
                    notification += (i + 1) + ".Red  ";
                } else if (colorArray[i] == 1) {
                    notification += (i + 1) + ".Blue  ";
                } else if (colorArray[i] == 2) {
                    notification += (i + 1) + ".Green  ";
                } else if (colorArray[i] == 3) {
                    notification += (i + 1) + ".Yellow  ";
                } else {
                    break;
                }
            }
            notificationLabel.setText(notification);
        }

        //--------------------------------------------------------------------
        //  Handler for the red button
        //--------------------------------------------------------------------
        else if (event.getSource() == redButton) {
            for (int i = 0; i <= 3; i++) {
                colorSounds[i].stop();
            }
            colorSounds[0].play();
            colorArray[colorCount] = 0;
            colorCount += 1;
            if (colorCount >= colorArray.length) {
                redButton.setDisable(true);
                greenButton.setDisable(true);
                yellowButton.setDisable(true);
                blueButton.setDisable(true);
                rememberGameButton.setDisable(false);
                notificationLabel.setText(colorCount + " Color(s) Selected. You have completed color selection.");
                return;
            }
            notificationLabel.setText(colorCount + " Color(s) Selected");
        }

        //--------------------------------------------------------------------
        //  Handler for the blue button
        //--------------------------------------------------------------------
        else if (event.getSource() == blueButton) {
            for (int i = 0; i <= 3; i++) {
                colorSounds[i].stop();
            }
            colorSounds[1].play();
            colorArray[colorCount] = 1;
            colorCount += 1;
            if (colorCount >= colorArray.length) {
                redButton.setDisable(true);
                greenButton.setDisable(true);
                yellowButton.setDisable(true);
                blueButton.setDisable(true);
                rememberGameButton.setDisable(false);
                notificationLabel.setText(colorCount + " Color(s) Selected. You have completed color selection.");
                return;
            }
            notificationLabel.setText(colorCount + " Color(s) Selected");
        }

        //--------------------------------------------------------------------
        //  Handler for the green button
        //--------------------------------------------------------------------
        else if (event.getSource() == greenButton) {
            for (int i = 0; i <= 3; i++) {
                colorSounds[i].stop();
            }
            colorSounds[2].play();
            colorArray[colorCount] = 2;
            colorCount += 1;
            if (colorCount >= colorArray.length) {
                redButton.setDisable(true);
                greenButton.setDisable(true);
                yellowButton.setDisable(true);
                blueButton.setDisable(true);
                rememberGameButton.setDisable(false);
                notificationLabel.setText(colorCount + " Color(s) Selected. You have completed color selection.");
                return;
            }
            notificationLabel.setText(colorCount + " Color(s) Selected");
        }

        //--------------------------------------------------------------------
        //  Handler for the yellow button
        //--------------------------------------------------------------------
        else if (event.getSource() == yellowButton) {
            for (int i = 0; i <= 3; i++) {
                colorSounds[i].stop();
            }
            colorSounds[3].play();
            colorArray[colorCount] = 3;
            colorCount += 1;
            if (colorCount >= colorArray.length) {
                redButton.setDisable(true);
                greenButton.setDisable(true);
                yellowButton.setDisable(true);
                blueButton.setDisable(true);
                rememberGameButton.setDisable(false);
                notificationLabel.setText(colorCount + " Color(s) Selected. You have completed color selection.");
                return;
            }
            notificationLabel.setText(colorCount + " Color(s) Selected");
        }

        //--------------------------------------------------------------------
        //  Handler for the end game button
        //--------------------------------------------------------------------
        else {
            System.exit(0);
        }

    }
}
