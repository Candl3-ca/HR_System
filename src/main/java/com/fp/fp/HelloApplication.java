package com.fp.fp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // you can set the sample FX like this:
        // insert code in the gridPane
        // creat <Label> in the gridPane
        // <Label text = "insert text here" textFill="green">
        // <font>
        // <Font name="Arial bold" size="20" fontWeight="bold" (fontweight doesn't exist though, to add bold insert it  in the font name)>
        // </font>
        // </Label>

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // or like this:
        // GridPane root = new GridPane();
        // root.setAlignment(Pos.CENTER);
        // root.setHgap(10);
        // root.setVgap(10);

        // To set font size and color
        // greeting.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        // greeting.setFill(Color.GREEN);

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("HR_System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}