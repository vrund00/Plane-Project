package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInfo {
	
	public static Connection getConnection() throws SQLException{
		
		String connectionString = "jdbc:sqlserver://flightapp.database.windows.net:1433;database=CIS Application Project;user=vrund00@flightapp;password={Nehalp1974*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
				
				Connection connection = DriverManager.getConnection(connectionString);
				System.out.println("Connection Established");
				return connection;	
	}		
	
	public static void createUser() throws Exception{
		
		try {
			Connection con = getConnection();
			//PreparedStatement create = con.prepareStatement(" create table UserTest(username varchar(30), password varchar(40))");
			PreparedStatement create = con.prepareStatement("Create table UserInfo(firstName varchar(15), "
					+ "																lastName varchar(15),"
					+ "																street varchar(30), "
					+ "																city char(15), "
					+ "																state char(30), "
					+ "																zipcode char(5),"
					+ "																email varchar(30), "
					+ "																ssn char(9),"
					+ "																username varchar(15), "
					+ "																password varchar(30),"
					+ "																answer1 varchar(15), "
					+ "																answer2 varchar(15), "
					+ "																admin varchar(5), "
					+ "																adminId char(5), "
					+ "																primary key (ssn))");
			create.executeUpdate();
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Function completed");};
		
	}
	
	public static void main(String[]args) throws Exception{
		
		createUser();
	}

}
