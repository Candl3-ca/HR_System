package com.fp.fp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Parent;

public class HelloApplication extends Application {

    public static HRSystem system = new HRSystem();

    @Override
    public void start(Stage stage) throws IOException {
        system.loadData();
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("HR_System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
