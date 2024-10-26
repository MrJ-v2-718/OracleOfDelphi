import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

//************************************************************************
//  Name: MrJ
//  Date: 10/26/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: This GUI program serves to keep track of volunteers for a
//  particular project. The information maintained is the first name,
//  last name, and email of each volunteer.
//************************************************************************

public class VolunteerList extends Application {
    //--------------------------------------------------------------------
    //  Launches the Volunteer List application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage) throws FileNotFoundException {
        Scene scene = new Scene(new VolunteerPane(), 750, 800);

        primaryStage.setTitle("Volunteer List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
