package GUI;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public Connection databaseLink;
	
	public Connection getConnection () {
		
		try {
			databaseLink = DriverManager.getConnection("jdbc:sqlserver://flightapp.database.windows.net:1433;database=CIS Application Project;user=vrund00@flightapp;password={Nehalp1974*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return databaseLink;
	}

}
