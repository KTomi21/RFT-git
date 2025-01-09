package com.example.szamologep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    
    private Stage mainStage;

    public void setMainStage(Stage stage) {
        this.mainStage = stage;
    }

    @FXML
    public void onLoginClicked(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (DatabaseHandler.validateUser(username, password)) {
            loadCalculatorScreen(event);
        } else {
            showError("Invalid username or password!");
        }
    }

    private void loadCalculatorScreen(ActionEvent event) {
        try {
            Stage calculatorStage = new Stage();
            calculatorStage.initStyle(StageStyle.UNDECORATED);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/szamologep/WindowInterface.fxml"));
            Parent root = loader.load();

            Controller calculatorController = loader.getController();
            calculatorController.init(calculatorStage);

            Scene scene = new Scene(root);
            calculatorStage.setScene(scene);
            calculatorStage.setTitle("Számológép");
            calculatorStage.show();

            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
            showError("Failed to load calculator screen.");
        }
    }
}
