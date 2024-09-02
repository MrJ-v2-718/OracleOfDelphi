import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  Name: MrJ
//  Date: 8/30/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Estimate the amount of time a person has slept in their life.
//************************************************************************

public class SleepCalculator extends Application {
    //--------------------------------------------------------------------
    //  Launches the sleep calculator application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new SleepPane(), 1024, 576);

        primaryStage.setTitle("Sleep Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
