package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LotController {

    @FXML
    private Button exitButton;

    @FXML
    private AnchorPane parkingPane;

    @FXML
    private Button returnBtn;
    
    Stage stage;

    @FXML
    void returnToMain(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
    	parkingPane = FXMLLoader.load(url);
    	Scene scene = new Scene(parkingPane);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void closeApp(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		
		if(alert.showAndWait().get() == ButtonType.OK){
			stage = (Stage) parkingPane.getScene().getWindow();
			stage.close();
		}

    }

}

