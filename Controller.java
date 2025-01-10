package com.example.szamologep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import java.io.IOException;

public class Controller {
    @FXML
    private Pane titlePane;
    @FXML
    private ImageView btnMinimize, btnClose;
    @FXML
    public Button btnInfo;
    @FXML
    private Label lblResult;

    private double x, y;
    private double num1 = 0;
    private String operator = "+";

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });

        btnClose.setOnMouseClicked(mouseEvent -> {
            stage.close();
        });

        btnMinimize.setOnMouseClicked(mouseEvent -> {
            stage.setIconified(true);
        });
    }
    public void onInfoClicked(ActionEvent event) {
        try {
            FXMLLoader infoLoader = new FXMLLoader(getClass().getResource("InfoInterface.fxml"));
            Scene infoScene = new Scene(infoLoader.load());

            Stage infoStage = new Stage();
            infoStage.initStyle(StageStyle.UTILITY);
            infoStage.initModality(Modality.APPLICATION_MODAL);
            infoStage.setTitle("Information");
            infoStage.setScene(infoScene);
            infoStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane) event.getSource()).getId().replace("btn", ""));
        lblResult.setText(Double.parseDouble(lblResult.getText()) == 0 ? String.valueOf((double) value) : String.valueOf(Double.parseDouble(lblResult.getText()) * 10 + value));
    }
    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane) event.getSource()).getId().replace("btn", "");
        if (symbol.equals("Equals")) {
            double num2 = Double.parseDouble(lblResult.getText());
            switch (operator) {
                case "+" -> lblResult.setText((num1 + num2) + "");
                case "-" -> lblResult.setText((num1 - num2) + "");
                case "*" -> lblResult.setText((num1 * num2) + "");
                case "/" -> lblResult.setText((num1 / num2) + "");
            }
            operator = ".";
        } else if (symbol.equals("Clear")) {
            lblResult.setText(String.valueOf(0.0));
            operator = ".";
        } 
    }
}
