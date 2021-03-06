// controller for Cost FXML file
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
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.model.*;

public class Cost implements Initializable{

	@FXML
	private Button BackButton;

    @FXML
    private AnchorPane CostPane;

    @FXML
    private Button NextButton;

    @FXML
    private TextArea OtherPermits1;

    @FXML
    private TextArea OtherPermits2;

    @FXML
    private TextArea OtherPermits3;

    @FXML
    private TextArea OtherPermits4;

    @FXML
    private TextArea OtherPermits5;

    @FXML
    private TextArea OtherPermits6;

    @FXML
    private TextArea PermitCost;
	
    @FXML
    private ListView<String> list;
    
    /*
	* Method Name: NextButtonClicked
	* Description: switches to the parking lot scene 
	* Parameters: event(Action Event)
	* Returns: none
    */
    @FXML
    void NextButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/ParkingLot.fxml").toURI().toURL();
   	 	CostPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(CostPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    /*
	* Method Name: BackButtonClicked
	* Description: switches to Estimate scene 
	* Parameters: event(Action Event)
	* Returns: none
    */
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Estimations.fxml").toURI().toURL();
   	 	CostPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(CostPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    Estimate estimate = new Estimate();
    /*
	* Method Name: initialize
	* Description: displays permits to text fields and list view
	* Parameters: arg0(URL), arg1 (ResourceBundle)
	* Returns: none
    */
    public void initialize(URL arg0, ResourceBundle arg1){
    	try {
			estimate.finalEstimate(PermitCost, list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
