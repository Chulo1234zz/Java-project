/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package marvell.consultancies.ltd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author HomePC
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button createAcc;
     
    @FXML
    private Button jobId;
     
    @FXML
    private Button clientId;

    @FXML
    void handleOption1(ActionEvent event) {
        createAcc.setText(clientId.getText());
    }

    @FXML
    void handleOption2(ActionEvent event) {
        createAcc.setText(jobId.getText());
    }

    @FXML
    void handleRegister(ActionEvent event) {
        try {
            // Load the signup.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
            Parent root = loader.load();
            
            // Create a new stage for the new scene
            Stage stage = (Stage) createAcc.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Sign Up");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Print the exception to the console
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Any initialization logic can go here
    }    
}