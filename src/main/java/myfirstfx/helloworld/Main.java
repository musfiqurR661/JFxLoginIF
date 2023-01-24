package myfirstfx.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
public class Main extends Application {
    @Override
    public void start(Stage PrimaryStage) throws Exception {
        //root,application start
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        PrimaryStage.setTitle("Welcome");
        PrimaryStage.setScene(new Scene(root));
        PrimaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
