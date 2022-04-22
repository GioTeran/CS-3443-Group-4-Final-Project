/**
 * This controller is for the Estimate fxml file
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene5Controller {

	@FXML
    private Button BackButton;
	
    @FXML
    private TextField InfoField;

    @FXML
    private AnchorPane InfoPane;

    @FXML
    private Button OkButton;

    @FXML
    void OkButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Cost5.5.fxml").toURI().toURL();
   	 	InfoPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(InfoPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/DaysHours4.fxml").toURI().toURL();
   	 	InfoPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(InfoPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
}
