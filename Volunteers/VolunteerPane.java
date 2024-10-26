import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//************************************************************************
//  Name: MrJ
//  Date: 10/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: This GUI pane serves to keep track of volunteers for a
//  particular project. The information maintained is the first name,
//  last name, and email of each volunteer.
//************************************************************************

public class VolunteerPane extends GridPane {
    private Label volunteerTable;
    private Label tableHeader;
    private TextField firstName;
    private TextField lastName;
    private TextField email;
    private TextField index;
    private Button addButton;
    private Button removeButton;
    private Button exitButton;
    private Button clearButton;
    private Button displayButton;
    private boolean changesMade = false;

    //--------------------------------------------------------------------
    //  Sets up a GUI containing labeled text fields for name, lastName, and
    //  email.
    //--------------------------------------------------------------------
    public VolunteerPane() throws FileNotFoundException {
        Font font = new Font("Courier New", 14);

        //------------------------------------------------
        //  Creates a label and text field for
        //  collecting the users first name
        //------------------------------------------------
        Label firstNameLabel = new Label("First Name: ");
        firstNameLabel.setFont(font);
        GridPane.setHalignment(firstNameLabel, HPos.RIGHT);

        firstName = new TextField();
        firstName.setFont(font);
        firstName.setPrefWidth(100);
        firstName.setAlignment(Pos.TOP_CENTER);

        //------------------------------------------------
        //  Creates a label and text field for
        //  collecting the users last name
        //------------------------------------------------
        Label lastNameLabel = new Label("Last Name: ");
        lastNameLabel.setFont(font);
        GridPane.setHalignment(lastNameLabel, HPos.RIGHT);

        lastName = new TextField();
        lastName.setFont(font);
        lastName.setPrefWidth(100);
        lastName.setAlignment(Pos.TOP_CENTER);

        //------------------------------------------------
        //  Creates a label and text field for
        //  collecting the users email
        //------------------------------------------------
        Label emailLabel = new Label("Email: ");
        emailLabel.setFont(font);
        GridPane.setHalignment(emailLabel, HPos.RIGHT);

        email = new TextField();
        email.setFont(font);
        email.setPrefWidth(100);
        email.setAlignment(Pos.TOP_CENTER);

        //------------------------------------------------
        //  Creates a label and text field for
        //  collecting index of volunteer to remove
        //------------------------------------------------
        Label indexLabel = new Label("Index: ");
        indexLabel.setFont(font);
        GridPane.setHalignment(indexLabel, HPos.RIGHT);

        index = new TextField();
        index.setFont(font);
        index.setPrefWidth(50);
        index.setAlignment(Pos.TOP_CENTER);

        //------------------------------------------------
        //  Creates a label for the table header
        //------------------------------------------------
        tableHeader = new Label("\t\t    Volunteer List\n\n" +
                "Index  First & Last Name         Email");
        tableHeader.setFont(font);
        GridPane.setHalignment(tableHeader, HPos.CENTER);

        //--------------------------------------------------------------------
        //  Load volunteer data
        //--------------------------------------------------------------------
        String volunteers = loadVolunteerTable();

        //------------------------------------------------
        //  Creates a label to display the volunteer list
        //------------------------------------------------
        volunteerTable = new Label(volunteers);
        volunteerTable.setFont(font);
        GridPane.setHalignment(volunteerTable, HPos.CENTER);

        //------------------------------------------------
        //    Creates 3 button objects:
        //        Add Volunteer
        //        Remove Volunteer
        //        Clear
        //        Exit
        //------------------------------------------------
        addButton = new Button("  Add Volunteer ");
        addButton.setOnAction(actionEvent -> {
            try {
                String firstInput = firstName.getText();
                String lastInput = lastName.getText();
                String emailInput = email.getText();
                firstName.setText("");
                lastName.setText("");
                email.setText("");

                ArrayList<String> volunteerData = new ArrayList<String>();
                String string, lastNameRead, firstNameRead, emailRead, volunteerUpdate = "";
                int index, volunteerIndex = 0;

                Scanner fileScan = new Scanner(new File("Volunteers.csv"));

                //--------------------------------------------------------------------
                //  Extract data from a line of input and store in string
                //--------------------------------------------------------------------
                while (fileScan.hasNext()) {
                    string = fileScan.nextLine();
                    volunteerData.add(string);
                }

                //--------------------------------------------------------------------
                //  Add user to ArrayList
                //--------------------------------------------------------------------
                volunteerData.add(lastInput + "," + firstInput + "," + emailInput + "\n");

                string = "";
                for (int i = 0; i < volunteerData.size(); i++) {
                    string = volunteerData.get(i);

                    index = string.indexOf(",");
                    lastNameRead = string.substring(0, index);
                    string = string.substring(index + 1);

                    index = string.indexOf(",");
                    firstNameRead = string.substring(0, index);
                    string = string.substring(index + 1);

                    emailRead = string;
                    volunteerUpdate += (volunteerIndex + "    " + firstNameRead +
                            "    " + lastNameRead + "    " + emailRead + "\n");

                    volunteerIndex++;
                }

                volunteerTable.setText(volunteerUpdate);
                changesMade = true;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        GridPane.setHalignment(addButton, HPos.CENTER);

        removeButton = new Button("Remove Volunteer");
        removeButton.setOnAction(actionEvent -> {
            try {
                int indexToRemove = Integer.parseInt(index.getText());
                index.setText("");

                String proceed = JOptionPane.showInputDialog(null,
                        "Are you sure you would like to remove index " + indexToRemove + "?(y/n)", "Remove?",
                        JOptionPane.INFORMATION_MESSAGE);

                if (!proceed.equalsIgnoreCase("y")) {
                    return;
                }

                ArrayList<String> volunteerData = new ArrayList<String>();
                String string, lastNameRead, firstNameRead, emailRead, volunteerUpdate = "";
                int index, volunteerIndex = 0;

                Scanner fileScan = new Scanner(new File("Volunteers.csv"));

                //--------------------------------------------------------------------
                //  Extract data from a line of input and store in string
                //--------------------------------------------------------------------
                while (fileScan.hasNext()) {
                    string = fileScan.nextLine();
                    volunteerData.add(string);
                }

                //--------------------------------------------------------------------
                //  Remove user from to ArrayList
                //--------------------------------------------------------------------
                volunteerData.remove(indexToRemove);

                string = "";
                for (int i = 0; i < volunteerData.size(); i++) {
                    string = volunteerData.get(i);

                    index = string.indexOf(",");
                    lastNameRead = string.substring(0, index);
                    string = string.substring(index + 1);

                    index = string.indexOf(",");
                    firstNameRead = string.substring(0, index);
                    string = string.substring(index + 1);

                    emailRead = string;
                    volunteerUpdate += (volunteerIndex + "    " + firstNameRead +
                            "    " + lastNameRead + "    " + emailRead + "\n");

                    volunteerIndex++;
                }

                volunteerTable.setText(volunteerUpdate);
                changesMade = true;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        clearButton = new Button("      Clear     ");
        clearButton.setOnAction(this::processButtons);
        GridPane.setHalignment(clearButton, HPos.CENTER);

        exitButton = new Button("      Exit      ");
        exitButton.setOnAction(actionEvent -> {
            try {
                if (changesMade) {
                    //--------------------------------------------------------------------
                    //  If changes are made, ask the user if they would like to save
                    //--------------------------------------------------------------------
                    String save = JOptionPane.showInputDialog(null,
                            "Would you like to save changes?(y/n)", "Save Changes?",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (save.equalsIgnoreCase("y")) {
                        String currentVolunteers = volunteerTable.getText();
                        String string, lastNameRead, firstNameRead, emailRead;
                        int index;
                        Scanner fileScan = new Scanner(currentVolunteers);

                        PrintWriter outFile = new PrintWriter("Volunteers2.csv");
                        while (fileScan.hasNext()) {
                            string = fileScan.nextLine();
                            index = string.indexOf("    ");
                            string = string.substring(index + 4);

                            index = string.indexOf("    ");
                            firstNameRead = string.substring(0, index);
                            string = string.substring(index + 4);

                            index = string.indexOf("    ");
                            lastNameRead = string.substring(0, index);
                            string = string.substring(index + 4);

                            emailRead = string;

                            outFile.println(lastNameRead + "," + firstNameRead +
                                    "," + emailRead);
                        }
                        outFile.close();
                        System.exit(0);
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        GridPane.setHalignment(exitButton, HPos.CENTER);

        //------------------------------------------------
        //    Settings for the JavaFX pane
        //------------------------------------------------
        setAlignment(Pos.TOP_LEFT);
        setHgap(20);
        setVgap(20);
        setPadding(new Insets(50));
        setStyle("-fx-background-color: ivory");

        //------------------------------------------------
        //    Add the components to the pane
        //    The parameters are:
        //           component name
        //           column
        //           row
        //           number of columns the component spans
        //           number of rows the component spans
        //------------------------------------------------
        add(firstNameLabel,
                0, 0, 1, 1);
        add(firstName,
                1, 0, 3, 1);
        add(indexLabel,
                4, 0, 1, 1);
        add(index,
                5, 0, 1, 1);
        add(lastNameLabel,
                0, 1, 1, 1);
        add(lastName,
                1, 1, 3, 1);
        add(emailLabel,
                0, 2, 1, 1);
        add(email,
                1, 2, 3, 1);
        add(addButton,
                1, 3, 1, 1);
        add(removeButton,
                5, 1, 1, 1);
        add(tableHeader,
                0, 5, 5, 3);
        add(volunteerTable,
                0, 5, 6, 23);
        add(clearButton,
                1, 28, 1, 1);
        add(exitButton,
                3, 28, 1, 1);
    }

    public String loadVolunteerTable() throws FileNotFoundException {
        ArrayList<String> volunteerData = new ArrayList<String>();
        String string, lastNameRead, firstNameRead, emailRead, volunteers = "";
        int index, volunteerIndex = 0;

        Scanner fileScan = new Scanner(new File("Volunteers.csv"));

        //--------------------------------------------------------------------
        //  Extract data from a line of add to ArrayList
        //--------------------------------------------------------------------
        while (fileScan.hasNext()) {
            string = fileScan.nextLine();
            volunteerData.add(string);
        }

        //--------------------------------------------------------------------
        //  Create the string that will be returned and used as the table
        //--------------------------------------------------------------------
        string = "";
        for (int i = 0; i < volunteerData.size(); i++) {
            string = volunteerData.get(i);

            index = string.indexOf(",");
            lastNameRead = string.substring(0, index);
            string = string.substring(index + 1);

            index = string.indexOf(",");
            firstNameRead = string.substring(0, index);
            string = string.substring(index + 1);

            emailRead = string;
            volunteers += (volunteerIndex + "    " + firstNameRead +
                    "    " + lastNameRead + "    " + emailRead + "\n");

            volunteerIndex++;
        }

        return volunteers;
    }

    public void processButtons(ActionEvent event) {
        //--------------------------------------------------------------------
        //  Clear button:
        //    Clears the text fields and sets the focus on firstName
        //--------------------------------------------------------------------
        if (event.getSource() == clearButton) {
            firstName.setText("");
            lastName.setText("");
            email.setText("");
            index.setText("");
            firstName.requestFocus();
        } else {
            System.exit(0);
        }

    }
}
