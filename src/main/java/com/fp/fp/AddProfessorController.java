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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AddProfessorController implements Initializable {

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
    private TextField txtWorkHours;
    @FXML
    private RadioButton rdbtnFullTime;
    @FXML
    private ToggleGroup g1;
    @FXML
    private TextField txtSpeciality;
    @FXML
    private ComboBox<String> cbDegree;
    @FXML
    private CheckBox isDean;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbDegree.getItems().addAll("PhD", "Master", "Bachelor");
        cbDegree.getSelectionModel().select(0);
    }

    @FXML
    private void fullTime(ActionEvent event) {
        txtWorkHours.setDisable(true);
    }

    @FXML
    private void partTime(ActionEvent event) {
        txtWorkHours.setDisable(false);
    }

    @FXML
    private void add(ActionEvent event) {
        if (txtDepartment.getText().isEmpty()
                || txtAddress.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtFName.getText().isEmpty()
                || txtLName.getText().isEmpty()
                || txtID.getText().isEmpty()
                || txtPhone.getText().isEmpty()
                || txtPassword.getText().isEmpty()
                || txtSpeciality.getText().isEmpty()
                || (txtWorkHours.getText().isEmpty() && !rdbtnFullTime.isSelected())) {
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
                String speciality = txtSpeciality.getText();
                String degree = cbDegree.getSelectionModel().getSelectedItem();
                Professor professor;
                if (!rdbtnFullTime.isSelected()) {
                    int workHours = Integer.parseInt(txtWorkHours.getText());
                    professor = new PartTime(id, fname, lname, email, address, pass, phone, speciality, degree, workHours);
                } else {
                    professor = new FullTime(id, fname, lname, email, address, pass, phone, speciality, degree);
                }

                if (isDean.isSelected()) {
                    HelloApplication.system.setDean(depid, professor);
                } else {
                    HelloApplication.system.addPerson(depid, professor);
                }

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
