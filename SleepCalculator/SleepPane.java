import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.Button;

//************************************************************************
//  Name: MrJ
//  Date: 8/30/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Estimate the amount of time a person has slept in their life.
//************************************************************************

public class SleepPane extends GridPane {
    private final int HOURS_IN_DAY = 24;
    private final int DAYS_IN_YEAR = 365;
    private Label totalHoursSleptResult;
    private Label daysSleptResult;
    private Label yearsSleptResult;
    private Label greetingResult;
    private TextField name;
    private TextField age;
    private TextField hoursPerNight;
    private Button calculateButton;
    private Button exitButton;
    private Button clearButton;

    //--------------------------------------------------------------------
    //  Sets up a GUI containing labeled text fields for name, age, and
    //  number of hours slept per night.
    //--------------------------------------------------------------------
    public SleepPane() {
        Font font = new Font("Courier New", 16);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the users name
        //------------------------------------------------
        Label nameLabel = new Label("Name: ");
        nameLabel.setFont(font);
        GridPane.setHalignment(nameLabel, HPos.RIGHT);

        name = new TextField();
        name.setFont(font);
        name.setPrefWidth(150);
        name.setAlignment(Pos.CENTER);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting the users age
        //------------------------------------------------
        Label ageLabel = new Label("Age: ");
        ageLabel.setFont(font);
        GridPane.setHalignment(ageLabel, HPos.RIGHT);

        age = new TextField();
        age.setFont(font);
        age.setPrefWidth(50);
        age.setAlignment(Pos.CENTER);

        //------------------------------------------------
        //    Creates a label and text field for
        //    collecting hours slept per night
        //------------------------------------------------
        Label hoursSleptLabel = new Label("Hours Slept Per Night: ");
        hoursSleptLabel.setFont(font);
        GridPane.setHalignment(hoursSleptLabel, HPos.RIGHT);

        hoursPerNight = new TextField();
        hoursPerNight.setFont(font);
        hoursPerNight.setPrefWidth(50);
        hoursPerNight.setAlignment(Pos.CENTER);

        //------------------------------------------------
        //    Creates a label for greeting the user
        //    during the results phase by including
        //    their name before their individual results
        //------------------------------------------------
        greetingResult = new Label("");
        greetingResult.setFont(font);
        GridPane.setHalignment(greetingResult, HPos.CENTER);

        //------------------------------------------------
        //    Creates a label and text field for
        //    hours slept display
        //------------------------------------------------
        Label totalHoursSleptLabel = new Label("Total Hours Slept: ");
        totalHoursSleptLabel.setFont(font);
        GridPane.setHalignment(totalHoursSleptLabel, HPos.RIGHT);

        totalHoursSleptResult = new Label("---");
        totalHoursSleptResult.setFont(font);
        GridPane.setHalignment(totalHoursSleptResult, HPos.LEFT);

        //------------------------------------------------
        //    Creates a label and text field for
        //    days slept display
        //------------------------------------------------
        Label daysSleptLabel = new Label("Total Days Slept: ");
        daysSleptLabel.setFont(font);
        GridPane.setHalignment(daysSleptLabel, HPos.RIGHT);

        daysSleptResult = new Label("---");
        daysSleptResult.setFont(font);
        GridPane.setHalignment(daysSleptResult, HPos.LEFT);

        //------------------------------------------------
        //    Creates a label and text field for
        //    years slept display
        //------------------------------------------------
        Label yearsSleptLabel = new Label("Total Years Slept: ");
        yearsSleptLabel.setFont(font);
        GridPane.setHalignment(yearsSleptLabel, HPos.RIGHT);

        yearsSleptResult = new Label("---");
        yearsSleptResult.setFont(font);
        GridPane.setHalignment(yearsSleptResult, HPos.LEFT);

        //------------------------------------------------
        //    Creates 3 button objects:
        //        Calculate
        //        Clear
        //        Exit
        //------------------------------------------------

        calculateButton = new Button("Calculate");
        calculateButton.setOnAction(this::processButtons);
        GridPane.setHalignment(calculateButton, HPos.CENTER);

        exitButton = new Button("Exit");
        exitButton.setOnAction(this::processButtons);
        GridPane.setHalignment(exitButton, HPos.CENTER);

        clearButton = new Button("Clear");
        clearButton.setOnAction(this::processButtons);
        GridPane.setHalignment(clearButton, HPos.CENTER);

        //------------------------------------------------
        //    Settings for the JavaFX pane
        //------------------------------------------------

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(50);
        setStyle("-fx-background-color: deepskyblue");

        //------------------------------------------------
        //    Add the components to the pane
        //    The parameters are:
        //           component name
        //           column
        //           row
        //           number of columns the component spans
        //           number of rows the component spans
        //------------------------------------------------
        add(nameLabel, 0, 0, 1, 1);
        add(name, 1, 0, 2, 1);
        add(ageLabel, 0, 1, 1, 1);
        add(age, 1, 1, 1, 1);
        add(hoursSleptLabel, 0, 2, 1, 1);
        add(hoursPerNight, 1, 2, 1, 1);
        add(greetingResult, 2, 3, 2, 1);
        add(totalHoursSleptLabel, 0, 4, 1, 1);
        add(totalHoursSleptResult, 1, 4, 1, 1);
        add(daysSleptLabel, 2, 4, 1, 1);
        add(daysSleptResult, 3, 4, 1, 1);
        add(yearsSleptLabel, 4, 4, 1, 1);
        add(yearsSleptResult, 5, 4, 1, 1);
        add(calculateButton, 1, 5, 1, 1);
        add(clearButton, 2, 5, 1, 1);
        add(exitButton, 3, 5, 1, 1);
    }

    //--------------------------------------------------------------------
    //  Handler for the buttons
    //--------------------------------------------------------------------
    public void processButtons(ActionEvent event) {
        //--------------------------------------------------------------------
        //  Calculate button:
        //    Computes and displays the total hours, days, and years slept
        //    when the user presses the calculate button and displays the
        //    results with their name.
        //--------------------------------------------------------------------
        if (event.getSource() == calculateButton) {
            String nameInput = name.getText();
            double hoursSleptInput = Double.parseDouble(hoursPerNight.getText());
            int ageInput = Integer.parseInt(age.getText());
            double hoursSleptInLife = ageInput * DAYS_IN_YEAR * hoursSleptInput;
            double daysSleptInLife = hoursSleptInLife / HOURS_IN_DAY;
            double yearsSleptInLife = daysSleptInLife / DAYS_IN_YEAR;
            greetingResult.setText("Results for " + nameInput);
            totalHoursSleptResult.setText(String.format("%,.2f", hoursSleptInLife));
            daysSleptResult.setText(String.format("%,.2f", daysSleptInLife));
            yearsSleptResult.setText(String.format("%,.2f", yearsSleptInLife));
        }

        //--------------------------------------------------------------------
        //  Clear button:
        //    Clear the result text fields.
        //    Set the focus (cursor) in the name text field.
        //--------------------------------------------------------------------
        else if (event.getSource() == clearButton) {
            totalHoursSleptResult.setText("---");
            daysSleptResult.setText("---");
            yearsSleptResult.setText("---");
            greetingResult.setText("");
            name.setText("");
            age.setText("");
            hoursPerNight.setText("");
            name.requestFocus();
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
