package GUI;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	Button cancelButton;
	
	
	@FXML
	public void cancelButton() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		Stage window = (Stage)cancelButton.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
		
		
		
	}


