 /* This controller is for the DaysHours FXML file
 */
package application.controller;

import javafx.scene.control.Button;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.model.*;



public class DaysHoursController {
	
	
	@FXML
	private Button BackButton;
	
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
    
    ArrayList<String> days = new ArrayList<>();
    ArrayList<Double> startTimes = new ArrayList<>();
    ArrayList<Double> endTimes = new ArrayList<>();
    DaysHours daysHours = new DaysHours();
    
    public void getDaysInfo() {
    	if(MoCheckBox.isSelected()) {
    		days.add("Mon");
    		if(Mo24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(MoStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(MoEndField.getText()));
    		}
    	}
    	
    	if(TuCheckBox.isSelected()) {
    		days.add("Tue");
    		
    		if(Tu24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(TuStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(TuEndField.getText()));
    		}
    	}
    	
    	if(WeCheckBox.isSelected()) {
    		days.add("Wed");
    		if(We24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(WeStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(WeEndField.getText()));
    		}
    	}
    	
    	if(ThCheckBox.isSelected()) {
    		days.add("Thr");
    		if(Th24Box.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(ThStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(ThEndField.getText()));
    		}
    	}
    	
    	if(FrCheckBox.isSelected()) {
    		days.add("Fri");
    		
    		if(Fr24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(FrStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(FrEndField.getText()));
    		}
    	}
    	
    	if(SaCheckBox.isSelected()) {
    		days.add("Sat");
    		if(Sa24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else {
    			startTimes.add(daysHours.toMilitaryTime(SaStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(SaEndField.getText()));
    		}
    	}
   
   
    	if(SuCheckBox.isSelected()) {
    		days.add("Sun");
    		if(Su24hrBox.isSelected()) {
    			startTimes.add(0.0);
    			endTimes.add(24.0);
    		}
    		else{
    			startTimes.add(daysHours.toMilitaryTime(SuStartField.getText()));
    			endTimes.add(daysHours.toMilitaryTime(SuEndField.getText()));
    		}
    	} 
    	
    }
    
    
    
    @FXML
    void SubmitButtonClicked(ActionEvent event) throws IOException {
    	getDaysInfo();
    	daysHours.saveDaysInfo(days, startTimes, endTimes);
    	URL url = new File("src/application/Estimations.fxml").toURI().toURL();
   	 	TimePane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(TimePane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();

    }
    
    @FXML
    void BackButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/SelectionMenue.fxml").toURI().toURL();
   	 	TimePane = FXMLLoader.load(url);// pane you are GOING TO
        Scene scene = new Scene(TimePane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
    
    @FXML
    void SunChecked(ActionEvent event) {
    	Su24hrBox.setSelected(true);
    }

    @FXML
    void MonChecked(ActionEvent event) {
    	Mo24hrBox.setSelected(true);
    }

    @FXML
    void TueChecked(ActionEvent event) {
    	Tu24hrBox.setSelected(true);
    }

    @FXML
    void WedChecked(ActionEvent event) {
    	We24hrBox.setSelected(true);
    }

    @FXML
    void ThrChecked(ActionEvent event) {
    	Th24Box.setSelected(true);
    }
    
    @FXML
    void FriChecked(ActionEvent event) {
    	Fr24hrBox.setSelected(true);
    }

    @FXML
    void SatChecked(ActionEvent event) {
    	Sa24hrBox.setSelected(true);
    }


}
