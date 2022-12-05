package GUI;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MainFlightController {
	
	@FXML
    private TableColumn<?, ?> FlightDate_Col;

    @FXML
    private TableColumn<?, ?> FromCity_Col;

    @FXML
    private TableColumn<?, ?> Passengers_Col;

    @FXML
    private TableColumn<?, ?> ToCity_Col;

    @FXML
    private TableColumn<?, ?> flightID_Col;

    @FXML
    private Button logout;

    @FXML
    private TableView<UserFlightData> myFlights_Table;

    @FXML
    private Button searchButton;

    @FXML
    private Label welcomeID;
    
    ObservableList<UserFlightData> listU;

	
	
	
	
	
	
	
	public void logout() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
		Stage window = (Stage)logout.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	public void search() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("SearchFlightScene.fxml"));
		Stage window = (Stage)logout.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}
	
	public void cancel() throws Exception {
		
	}
	
	public void displayName(String username) {
		welcomeID.setText("Welcome" + username);
		
	}

}
