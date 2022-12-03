package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class searchFlightController {
	
	@FXML
	
	Button mainMenu;
	
	public void menu() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MainFlightScene.fxml"));
		Stage window = (Stage)mainMenu.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}

}
