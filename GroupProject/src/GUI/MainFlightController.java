package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainFlightController {
	
	@FXML
	Button logout;
	
	
	public void cancelButton() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		Stage window = (Stage)logout.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	

}
