package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginController {
	
	@FXML
	Button loginButton;
	
	@FXML
	Button forgotPassB;
	
	@FXML
	Button newUser;
	
	@FXML
	TextField usernameID;
	
	@FXML
	PasswordField passwordID;
	
	@FXML
	Label status;
	
	@FXML
	Label welcomeID;
	
	
	/*public void login() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("MainFlightScene.fxml"));
		Stage window = (Stage)loginButton.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}*/
	
public static Connection getConnection() throws SQLException{
		
		String connectionString = "jdbc:sqlserver://flightapp.database.windows.net:1433;database=CIS Application Project;user=vrund00@flightapp;password={Nehalp1974*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
				
				Connection connection = DriverManager.getConnection(connectionString);
				System.out.println("Connection Established");
				return connection;

}
	
	public void login2() throws Exception{
		
		status.setText("it works");
		
		
	
}
	public void validateLogin () {
		DatabaseConnection connectNow = new DatabaseConnection();
		Connection connectionDB = connectNow.getConnection();
		
		
		
		
		String verifyLogin = ("SELECT count(1) from [dbo].[UserInfo] where username ='" + usernameID.getText() + "' AND password = '" + passwordID.getText() + "'");
		try {
			Statement statement = connectionDB.createStatement();
			ResultSet queryResult = statement.executeQuery(verifyLogin);
			
			
			while (queryResult.next()) {
				if (queryResult.getInt(1) == 1) {
					Parent root = FXMLLoader.load(getClass().getResource("MainFlightScene.fxml"));
					
					Stage window = (Stage)loginButton.getScene().getWindow();
					window.setScene(new Scene(root, 600, 600));
					
					String username = usernameID.getText();
					FXMLLoader loader = new FXMLLoader(getClass().getResource("MainFlightScene.fxml"));
					root = loader.load();
					MainFlightController scene2 = loader.getController();
					scene2.displayName(username);
					
					//Parent root2 = FXMLLoader.load(getClass().getResource("searchFlightScene.fxml"));
					//FXMLLoader loader2 = new FXMLLoader(getClass().getResource("searchFlightController.fxml"));
					//root2 = loader2.load();
					//searchFlightController name = loader2.getController();
					//name.bookFlight(username);
					
					
					
					
					
				}
				else {
					status.setText("Login incorrect, try again!");

				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void forgot() throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("PasswordRecoveryScene.fxml"));
		Stage window = (Stage)forgotPassB.getScene().getWindow();
		window.setScene(new Scene(root, 400, 450));
	}
	
	
	public void newUser() throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("NewAccountScene.fxml"));
		Stage window = (Stage)newUser.getScene().getWindow();
		window.setScene(new Scene(root, 600, 600));
	}

}
