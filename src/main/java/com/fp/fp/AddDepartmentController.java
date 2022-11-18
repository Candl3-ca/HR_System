package com.fp.fp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddDepartmentController implements Initializable {

    @FXML
    private TextField txtID;
    @FXML
    private TextField txtName;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void add(ActionEvent event) {

        if (txtID.getText().isEmpty()
                || txtName.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Enter all details").showAndWait();
        } else {

            try {

                int depid = Integer.parseInt(txtID.getText());
                String name = txtName.getText();


                Department dep = new Department(depid, name);
                HelloApplication.system.addDepartment(dep);

                try {
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Home.fxml"))));
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                new Alert(Alert.AlertType.ERROR, e.getMessage()).showAndWait();
            }
        }
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
