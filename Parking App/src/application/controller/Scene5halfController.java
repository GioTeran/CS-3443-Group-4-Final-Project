// controller for cost5.5.fxml scene
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
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene5halfController {

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
    void NextButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/ParkingModel6.fxml").toURI().toURL();
   	 	CostPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(CostPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Estimates5.fxml").toURI().toURL();
   	 	CostPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(CostPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

}

