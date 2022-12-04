package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class searchFlightController {
	
	@FXML
	Button mainMenu;
	
	@FXML 
	public TableColumn flightID;
	
	@FXML
	public TableColumn fromCity;
	
	@FXML
	public TableColumn date;
	
	@FXML
	public TableColumn toCity;
	
	@FXML
	public TableColumn numPass;
	
	
	public void menu() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MainFlightScene.fxml"));
		Stage window = (Stage)mainMenu.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	
	

}
