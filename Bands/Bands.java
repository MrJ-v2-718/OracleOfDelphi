import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//****************************************************************************
//  Name: MrJ
//  Date: 9/5/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: Form that collects information for band auditions at Rupp Arena.
//****************************************************************************

public class Bands extends Application {
    //--------------------------------------------------------------------
    //  Launches the bands application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new BandsPane(), 850, 750);

        primaryStage.setTitle("Bands at Rupp Arena");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
