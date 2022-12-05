package GUI;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;
//import javafx.event.ActionEvent;

public class NewAccountController {
	
	@FXML
	Button cancelButton;
	
    @FXML
    Button createNewUser;
	
	
	public void cancelButton() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		Stage window = (Stage)cancelButton.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	
	// need to add update sql database with info line not only go back to login
	public void createNewUser() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		Stage window = (Stage)createNewUser.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	
	}
		
		
}


