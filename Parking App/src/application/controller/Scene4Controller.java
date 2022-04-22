/**
 * This controller is for the DaysHours FXML file
 */
package application.controller;

import javafx.scene.control.Button;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Scene4Controller {
	
	

    @FXML
    private CheckBox Fr24hrBox;

    @FXML
    private CheckBox FrCheckBox;

    @FXML
    private TextField FrEndField;

    @FXML
    private TextField FrStartField;

    @FXML
    private CheckBox Mo24hrBox;

    @FXML
    private CheckBox MoCheckBox;

    @FXML
    private TextField MoEndField;

    @FXML
    private TextField MoStartField;

    @FXML
    private CheckBox Sa24hrBox;

    @FXML
    private CheckBox SaCheckBox;

    @FXML
    private TextField SaEndField;

    @FXML
    private TextField SaStartField;

    @FXML
    private CheckBox Su24hrBox;

    @FXML
    private CheckBox SuCheckBox;

    @FXML
    private TextField SuEndField;

    @FXML
    private TextField SuStartField;

    @FXML
    private CheckBox Th24Box;

    @FXML
    private CheckBox ThCheckBox;

    @FXML
    private TextField ThEndField;

    @FXML
    private TextField ThStartField;

    @FXML
    private AnchorPane TimePane;

    @FXML
    private CheckBox Tu24hrBox;

    @FXML
    private CheckBox TuCheckBox;

    @FXML
    private TextField TuEndField;

    @FXML
    private TextField TuStartField;

    @FXML
    private CheckBox We24hrBox;

    @FXML
    private CheckBox WeCheckBox;

    @FXML
    private TextField WeEndField;

    @FXML
    private TextField WeStartField;
    
    @FXML
    private Button Submit;
    
    
    
    
    @FXML
    void SubmitButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Estimates5.fxml").toURI().toURL();
   	 	TimePane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(TimePane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }

}
