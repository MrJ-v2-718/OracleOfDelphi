import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

//****************************************************************************
//  Name: MrJ
//  Date: 9/5/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Form that collects information for band auditions at Rupp Arena.
//****************************************************************************

public class BandsPane extends GridPane {
    private ImageView imageView;
    private TextField bandName;
    private TextField bandWebsite;
    private TextField contactName;
    private TextField contactPhone;
    private RadioButton letsDance;
    private RadioButton funkedUp;
    private CheckBox tuesdayCheckBox;
    private CheckBox fridayCheckBox;
    private CheckBox saturdayCheckBox;
    private Button submitButton;
    private Button clearButton;
    private Button exitButton;

    //--------------------------------------------------------------------
    //  Sets up a GUI containing labeled text fields for name of the band,
    //  the band website or facebook page, radio boxes for sample sound clips
    //  of songs, checkboxes for the days of the week the band is available,
    //  and text fields for the contact name, and the contact phone number.
    //--------------------------------------------------------------------
    public BandsPane() {
        //--------------------------------------------------
        //  Implements a font style for the application
        //--------------------------------------------------
        Font font = new Font("Courier New", 16);

        //--------------------------------------------------
        //  Places an image in the center of the top row
        //--------------------------------------------------
        Image concert = new Image("file:BandsAtRupp.png");
        imageView = new ImageView(concert);
        GridPane.setHalignment(imageView, HPos.CENTER);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the band name
        //------------------------------------------------
        Label bandNameLabel = new Label("Name of Band: ");
        bandNameLabel.setFont(font);
        GridPane.setHalignment(bandNameLabel, HPos.RIGHT);

        bandName = new TextField();
        bandName.setFont(font);
        bandName.setPrefWidth(300);
        GridPane.setHalignment(bandName, HPos.LEFT);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the band website
        //------------------------------------------------
        Label bandWebsiteLabel = new Label("Band website or Facebook page: ");
        bandWebsiteLabel.setFont(font);
        GridPane.setHalignment(bandWebsiteLabel, HPos.RIGHT);

        bandWebsite = new TextField();
        bandWebsite.setFont(font);
        bandWebsite.setPrefWidth(300);
        GridPane.setHalignment(bandWebsiteLabel, HPos.LEFT);

        //------------------------------------------------
        //    Creates a label and radio buttons for
        //    selecting sample sound clips of songs
        //------------------------------------------------
        Label soundClipsLabel = new Label("Sample sound clips of songs: ");
        soundClipsLabel.setFont(font);
        GridPane.setHalignment(soundClipsLabel, HPos.RIGHT);

        ToggleGroup group = new ToggleGroup();

        letsDance = new RadioButton("Let's Dance");
        letsDance.setToggleGroup(group);
        GridPane.setHalignment(letsDance, HPos.LEFT);
        letsDance.setFont(font);

        funkedUp = new RadioButton("Funked Up");
        funkedUp.setToggleGroup(group);
        GridPane.setHalignment(funkedUp, HPos.LEFT);
        funkedUp.setFont(font);

        //------------------------------------------------
        //    Creates a label and checkboxes for
        //    selecting days available for playing
        //------------------------------------------------
        Label daysLabel = new Label("Days of the week you are typically available " +
                "for playing (check all that apply): ");
        daysLabel.setFont(font);
        GridPane.setHalignment(daysLabel, HPos.RIGHT);

        tuesdayCheckBox = new CheckBox("Tuesday");
        GridPane.setHalignment(tuesdayCheckBox, HPos.LEFT);
        tuesdayCheckBox.setFont(font);

        fridayCheckBox = new CheckBox("Friday");
        GridPane.setHalignment(fridayCheckBox, HPos.LEFT);
        fridayCheckBox.setFont(font);

        saturdayCheckBox = new CheckBox("Saturday");
        GridPane.setHalignment(saturdayCheckBox, HPos.LEFT);
        saturdayCheckBox.setFont(font);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the contact name
        //------------------------------------------------
        Label contactNameLabel = new Label("Contact Name: ");
        contactNameLabel.setFont(font);
        GridPane.setHalignment(contactNameLabel, HPos.RIGHT);

        contactName = new TextField();
        contactName.setFont(font);
        contactName.setPrefWidth(200);
        GridPane.setHalignment(contactName, HPos.LEFT);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the contact phone number
        //------------------------------------------------
        Label contactPhoneLabel = new Label("Contact Phone: ");
        contactPhoneLabel.setFont(font);
        GridPane.setHalignment(contactPhoneLabel, HPos.RIGHT);

        contactPhone = new TextField();
        contactPhone.setFont(font);
        contactPhone.setPrefWidth(200);
        GridPane.setHalignment(contactPhone, HPos.LEFT);

        //------------------------------------------------
        //    Creates 3 button objects:
        //        Submit Audition
        //        Clear
        //        Exit
        //------------------------------------------------

        submitButton = new Button("Submit Audition");
        submitButton.setOnAction(this::processButtons);
        submitButton.setMinWidth(150);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        submitButton.setFont(font);

        clearButton = new Button("Clear Form");
        clearButton.setOnAction(this::processButtons);
        clearButton.setMinWidth(150);
        GridPane.setHalignment(clearButton, HPos.CENTER);
        clearButton.setFont(font);

        exitButton = new Button("Exit");
        exitButton.setOnAction(this::processButtons);
        exitButton.setMinWidth(150);
        GridPane.setHalignment(exitButton, HPos.CENTER);
        exitButton.setFont(font);

        //------------------------------------------------
        //    Settings for the JavaFX pane
        //------------------------------------------------

        setStyle("-fx-background-color: #F0F8FF");
        setPadding(new Insets(20));
        setAlignment(Pos.TOP_LEFT);
        setHgap(20);
        setVgap(20);

        //------------------------------------------------
        //    Add the components to the pane
        //    The parameters are:
        //           component name
        //           column
        //           row
        //           number of columns the component spans
        //           number of rows the component spans
        //------------------------------------------------
        add(imageView, 0, 0, 3, 1);
        add(bandNameLabel, 0, 1, 1, 1);
        add(bandName, 1, 1, 3, 1);
        add(bandWebsiteLabel, 0, 2, 1, 1);
        add(bandWebsite, 1, 2, 3, 1);
        add(soundClipsLabel, 0, 3, 1, 1);
        add(letsDance, 1, 4, 1, 1);
        add(funkedUp, 1, 5, 1, 1);
        add(daysLabel, 0, 6, 3, 1);
        add(tuesdayCheckBox, 1, 7, 1, 1);
        add(fridayCheckBox, 1, 8, 1, 1);
        add(saturdayCheckBox, 1, 9, 1, 1);
        add(contactNameLabel, 0, 10, 1, 1);
        add(contactName, 1, 10, 3, 1);
        add(contactPhoneLabel, 0, 11, 1, 1);
        add(contactPhone, 1, 11, 3, 1);
        add(submitButton, 0, 14, 1, 1);
        add(clearButton, 1, 14, 1, 1);
        add(exitButton, 2, 14, 1, 1);
    }

    //--------------------------------------------------------------------
    //  Handler for the buttons
    //--------------------------------------------------------------------
    public void processButtons(ActionEvent event) {
        //--------------------------------------------------------------------
        //  Submit Audition button:
        //    Generates a pop-up dialog box displaying the following:
        //
        //  The following information was successfully submitted:
        //  Band: {Band Name}
        //  Website/FB Page: {Band Website}
        //  Sound clips were successfully uploaded
        //  {Band Name} are available to play on
        //  --Tuesday (if checked)
        //  --Friday (if checked)
        //  --Saturday (if checked)
        //  Contact Information: {Contact Name} at {Contact Phone}
        //
        //--------------------------------------------------------------------
        if (event.getSource() == submitButton) {
            String bandNameInput = bandName.getText();
            String websiteInput = bandWebsite.getText();
            String sampleSubmission = "Sound clips were not uploaded";

            if (letsDance.isSelected() || funkedUp.isSelected()) {
                sampleSubmission = "Sound clips were successfully uploaded";
            }

            String availableDaysInput = "";

            if (tuesdayCheckBox.isSelected()) {
                availableDaysInput += "--Tuesday\n";
            }

            if (fridayCheckBox.isSelected()) {
                availableDaysInput += "--Friday\n";
            }

            if (saturdayCheckBox.isSelected()) {
                availableDaysInput += "--Saturday\n";
            }

            if (!tuesdayCheckBox.isSelected() && !fridayCheckBox.isSelected() && !saturdayCheckBox.isSelected()) {
                availableDaysInput = "N/A\n";
            }

            String contactNameInput = contactName.getText();
            String contactPhoneInput = contactPhone.getText();

            String bandInfo = "The following information was successfully submitted:\n" +
                    "Band: " + bandNameInput + "\n" +
                    "Website/FB Page: " + websiteInput + "\n" +
                    sampleSubmission + "\n" +
                    bandNameInput + " is/are available to play on\n" +
                    availableDaysInput +
                    "Contact Information: " + contactNameInput + " at " + contactPhoneInput;

            Alert bandInfoDialog = new Alert(Alert.AlertType.INFORMATION);
            bandInfoDialog.setHeaderText(null);
            bandInfoDialog.setTitle(bandNameInput + " Information");
            bandInfoDialog.setContentText(bandInfo);
            bandInfoDialog.showAndWait();
        }

        //--------------------------------------------------------------------
        //  Clear button:
        //    Clear all the text fields, radio buttons, and checkboxes.
        //    Set the focus (cursor) in the bandName text field.
        //--------------------------------------------------------------------
        else if (event.getSource() == clearButton) {
            bandName.setText("");
            bandWebsite.setText("");
            letsDance.setSelected(false);
            funkedUp.setSelected(false);
            tuesdayCheckBox.setSelected(false);
            fridayCheckBox.setSelected(false);
            saturdayCheckBox.setSelected(false);
            contactName.setText("");
            contactPhone.setText("");
            bandName.requestFocus();
        }

        //--------------------------------------------------------------------
        //  Exit button:
        //    End the application
        //--------------------------------------------------------------------
        else {
            System.exit(0);
        }

    }
}
