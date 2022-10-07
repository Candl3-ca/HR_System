package com.fp.fp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome operator to your HR management system!");
    }

//    @FXML
//    protected void onExitButtonClick() {
//        welcomeText.setText("Goodbye operator!");
//        System.exit(0);
//    }
//
//    @FXML
//    protected void onLoginButtonClick() {
//    }
//
//    @FXML
//    protected void onSignupButtonClick() {
//    }


}