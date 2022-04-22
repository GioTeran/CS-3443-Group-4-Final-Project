/**
 * This is the controller for the Parking Model
 */
package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene6Controller {

    @FXML
    private Button HomeButton;
    
    @FXML
    private Button BackButton;

    @FXML
    private AnchorPane ParkingPane;

    @FXML
    void HomeButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
   	 	ParkingPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(ParkingPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Cost5.5.fxml").toURI().toURL();
   	 	ParkingPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(ParkingPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

}

