package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[]args) {
	
		String connectionString = "jdbc:sqlserver://flightapp.database.windows.net:1433;database=CIS Application Project;user=vrund00@flightapp;password={Nehalp1974*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		
		try {
			try (Connection connection = DriverManager.getConnection(connectionString)) {
				System.out.println("Connection Established");
			}
		} catch (SQLException e) {
			System.out.println("Error connection to the database");
			e.printStackTrace();
		}
		
	}
	

}
