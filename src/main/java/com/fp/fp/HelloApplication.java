package com.fp.fp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;


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

        File file = new File("C:\\Users\\Candl3\\IdeaProjects\\Fp\\info.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);


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
//        stage.getIcons().add(new Image("path to the icon")); this is how you add an icon to the window, as well as changing the icon on the taskbar
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}