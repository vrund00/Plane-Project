package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class LoginController {
	
	@FXML
	Button loginButton;
	
	Button forgotPass;
	
	Button newUser;
	
	public void login() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MainFlightScene.fxml"));
		Stage window = (Stage)loginButton.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	
	
	
	public void newUser() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("NewAccountScene.fxml"));
		Stage window = (Stage)newUser.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}

}
