/* This controller is for the Status FXML file
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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import application.model.*;

public class StatusController {

    @FXML
    private Button GuestButton;

    @FXML
    private Button StaffButton;

    @FXML
    private Button StatusBackButton;

    @FXML
    private Pane StatusPane;

    @FXML
    private Button StudentButton;

    StatusModel status = new StatusModel();
    
    /*
     * Name: GuestButtonClicked
     * Description: switches to the permit selection scene
   	 * Parameters: event (ActionEvent)
   	 * returns: nothing
     */
    @FXML
    void GuestButtonClicked(ActionEvent event) throws IOException {
    	status.saveStatus("guest");
    	URL url = new File("src/SelectionMenu.fxml").toURI().toURL();
   	 	StatusPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(StatusPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    /*
     * Name: StaffButtonClicked
     * Description: switches to the permit selection scene
   	 * Parameters: event (ActionEvent)
   	 * returns: nothing
     */
    @FXML
    void StaffButtonClicked(ActionEvent event) throws IOException {
    	status.saveStatus("staff");
    	URL url = new File("src/SelectionMenu.fxml").toURI().toURL();
   	 	StatusPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(StatusPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    /*
     * Name: StatusButtonClicked
     * Description: switches to the main scene
   	 * Parameters: event (ActionEvent)
   	 * returns: nothing
     */
    @FXML
    void StatusBackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
   	 	StatusPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(StatusPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    /*
     * Name: StudentButtonClicked
     * Description: switches to the permit selection scene
   	 * Parameters: event (ActionEvent)
   	 * returns: nothing
     */
    @FXML
    void StudentButtonClicked(ActionEvent event) throws IOException {
    	status.saveStatus("student");
    	URL url = new File("src/SelectionMenu.fxml").toURI().toURL();
   	 	StatusPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(StatusPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Main.fxml").toURI().toURL();
   	 	StatusPane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(StatusPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

}
