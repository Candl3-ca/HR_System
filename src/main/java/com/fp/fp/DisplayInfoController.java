package com.fp.fp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class DisplayInfoController implements Initializable {
    
    @FXML
    private TextArea txtArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtArea.setText(HelloApplication.system.getInfo());
    }
    
    @FXML
    private void home(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Home.fxml"))));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
