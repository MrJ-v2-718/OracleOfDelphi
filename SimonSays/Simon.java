import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//****************************************************************************
//  Name: MrJ
//  Date: 9/13/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Driver to create a portion of the simon game that records a sequence
//  of color selections in an array and plays a corresponding sound for each
//  color button that is selected. The user will select 8 colors. The user
//  can select the remember game button to see all previous selections.
//****************************************************************************

public class Simon extends Application {
    //--------------------------------------------------------------------
    //  Launches the simon game.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new SimonPane(), 660, 530);

        primaryStage.setTitle("Simon Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
