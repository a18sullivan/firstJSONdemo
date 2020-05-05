package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        URL loc = getClass().getResource("Main.fxml");
        try{
            root= FXMLLoader.load(loc);
        }catch(IOException e){
            System.out.println("Couldnt find FXML file");
        }
        Scene windowContents = new Scene(root, 300,400);
        primaryStage.setScene(windowContents);
        primaryStage.setTitle("Showing Web Data");
        primaryStage.show();
    }
}
