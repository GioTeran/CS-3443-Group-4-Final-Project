/* This controller is for Permit Selection FXML file
 */
package application.controller;

import java.io.File;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.model.*;

public class SelectionMenuController {

	@FXML
	private Button BackButton;

    @FXML
    private Button DaySurfaceButton;

    @FXML
    private Button FullYearButton;

    @FXML
    private Button FullYearSurfaceButton;

    @FXML
    private Button HourlyGarageButton;

    @FXML
    private Button HourlySurfaceButton;

    @FXML
    private Button OneDayGarageButton;

    @FXML
    private AnchorPane SelectorPane;
    
    SelectionModel selection = new SelectionModel();

    @FXML
    void DaySurfaceButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("surface", "day");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    @FXML
    void FullYearButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("garage", "year");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    @FXML
    void FullYearSurfaceButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("surface", "year");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    @FXML
    void HourlyGarageButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("garage", "hourly");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    @FXML
    void HourlySurfaceButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("surface", "hourly");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

    @FXML
    void OneDayGarageButtonClicked(ActionEvent event) throws IOException {
    	selection.saveSelection("garage", "day");
    	URL url = new File("src/DaysHours.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Status.fxml").toURI().toURL();
   	 	SelectorPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(SelectorPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

}