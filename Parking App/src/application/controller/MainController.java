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

public class MainController {

    @FXML
    private AnchorPane MainPane;

    @FXML
    private Button GetPermitButton;

    @FXML
    void GetPermitButtonClicked(ActionEvent event) throws IOException {
    	URL url = new File("src/Status.fxml").toURI().toURL();
    	MainPane = FXMLLoader.load(url);
    	Scene scene = new Scene(MainPane);// pane you are GOING TO show
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

}