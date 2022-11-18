package com.fp.fp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddStaffController implements Initializable {

    @FXML
    private TextField txtID;
    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtLName;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtDepartment;
    @FXML
    private TextField txtDuty;
    @FXML
    private TextField txtWorkLoad;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void add(ActionEvent event) {

        if (txtDepartment.getText().isEmpty()
                || txtAddress.getText().isEmpty()
                || txtDuty.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtFName.getText().isEmpty()
                || txtLName.getText().isEmpty()
                || txtID.getText().isEmpty()
                || txtWorkLoad.getText().isEmpty()
                || txtPhone.getText().isEmpty()
                || txtPassword.getText().isEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Enter all details").showAndWait();
        } else {

            try {

                int depid = Integer.parseInt(txtDepartment.getText());
                int id = Integer.parseInt(txtID.getText());
                String fname = txtFName.getText();
                String lname = txtLName.getText();
                String address = txtAddress.getText();
                String phone = txtPhone.getText();
                String email = txtEmail.getText();
                String pass = txtPassword.getText();
                String duty = txtDuty.getText();
                int workLoad = Integer.parseInt(txtWorkLoad.getText());

                Staff staff = new Staff(id, fname, lname, email, address, pass, phone, duty, workLoad);
                HelloApplication.system.addPerson(depid, staff);

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
