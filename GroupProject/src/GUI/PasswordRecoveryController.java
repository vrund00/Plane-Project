package GUI;
import java.io.FileInputStream;
import java.io.IOException;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
public class PasswordRecoveryController extends Application
{
	//
	public static void main(String[] args) 
    {
		Application.launch(args);
    }
	{
        {
            SqlConnection con = new SqlConnection();
            con.ConnectionString = "jdbc:sqlserver://flightapp.database.windows.net:1433;database=CIS Application Project;user=vrund00@flightapp;password={Nehalp1974*};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;\";\r\n" ";Integrated Security=True;User Instance=True";
            string q = ("select SEC_QUESTION,ANSWER from Table1 where USERNAME='" + textBox1.Text + "'");
            con.Open();
            SqlCommand cmd = new SqlCommand(q, con);
            SqlDataReader dr = cmd.ExecuteReader();
            if (dr.HasRows == true)
            {
                Form2 f2 = new Form2();
                while (dr.Read())
                {
                    f2.label1.Text = dr["SEC_QUESTION"].ToString();
                    f2.textBox2.Text = dr["ANSWER"].ToString();
                }
                dr.Close();
                con.Close();
                f2.Show();
            }
            
            
            private void validateUserInDatabase(ActionEvent event) throws SQLException {
                if (!Objects.equals(passwordrecovery_username.getText(), "") && !Objects.equals(passwordrecovery_email.getText(), "")){
                      username = passwordrecovery_username.getText();
                      Connection con = connectionProvider.getConnection();
                      String query = "SELECT username_email FROM userdata WHERE username_email = ?";
                      PreparedStatement pstmtLogin = con.prepareStatement(query);
                      pstmtLogin.setString(1, username);
                      ResultSet resultSet = pstmtLogin.executeQuery();
                      resultSet.next();
                      email = resultSet.getString("username_email");
                      con.close();
                      if (email.equals(passwordrecovery_email.getText())){
                          npwd = new String(generateNpwd.Npwd(7));
                          String msg = "Your Npwd is "+ npwd;
                          sendMail.send_Mail(email,msg , "FlightScene" : "PasswordRecovery");
                          passwordrecovery_label.setVisible(true);
                          passwordrecovery_npwd.setVisible(true);
                          passwordrecovery_validateNpwd.setVisible(true);
                      }else{
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("Please enter email address");
                            alert.show();
                      }
                }
            }
            public void validateNpwd(ActionEvent event) throws SQLException {
                if (!Objects.equals(passwordrecovery_npwd.getText(), "")){
//                    System.out.println("here : "+npwd);                // error test here
//                    System.out.println("here3 : "+passwordrecovery_npwd.getText());
                    if (Objects.equals(fgp_otp.getText(), otp)){
                        Connection con = connectionProvider.getConnection();
                        String query = "SELECT user_password FROM userdata WHERE username = ?";
                        PreparedStatement pstmtLogin = con.prepareStatement(query);
                        pstmtLogin.setString(1, username);
                        ResultSet resultSet = pstmtLogin.executeQuery();
                        resultSet.next();
                        String password = resultSet.getString("user_password");
                        con.close();
                        passwordrecovery_passwordLabel.setText("Your Password : "+"password);
                        passwordrecovery_mailBtn.setDisable(true);
                        passwordrecovery_validateNpwd.setDisable(true);
                    }else{
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Invalid Npwd");
                        alert.show();
                    }

                }
            }
            public void goBackToMainFlights(ActionEvent event) throws IOException {
                DataBaseConnection.changeScene(event,"login.fxml","Login",null);
            }
        }




