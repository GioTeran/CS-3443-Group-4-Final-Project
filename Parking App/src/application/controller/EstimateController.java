/**
 * This controller is for the Estimate fxml file
 */
package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EstimateController implements Initializable{

	@FXML
    private Button BackButton;
	
    @FXML
    private TextField InfoField;

    @FXML
    private AnchorPane InfoPane;

    @FXML
    private Button OkButton;

    /*
	* Method Name: OkButtonClicked
	* Description: switches to the costs scene 
	* Parameters: event(Action Event)
	* Returns: none
    */
    @FXML
    void OkButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Cost.fxml").toURI().toURL();
   	 	InfoPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(InfoPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
	
    /*
	* Method Name: BackButtonClicked
	* Description: switches to the schedule scene 
	* Parameters: event(Action Event)
	* Returns: none
    */
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	InfoPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(InfoPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
	
    /*
   	* Method Name: initialize
   	* Description: displays permits information
   	* Parameters: arg0(URL), arg1 (ResourceBundle)
   	* Returns: none
    */
    public void initialize(URL arg0, ResourceBundle arg1){
    	InfoField.setText("DON'T FORGET TO PUT INFO ABOUT PERMITS");
    }
}
