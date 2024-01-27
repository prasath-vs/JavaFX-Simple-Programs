package application;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage;

public class RegistrationForm extends Application {

	@Override 
	   public void start(Stage stage) {    
	      //Label for name 
	      Text nameLabel = new Text("Customer Name"); 
	      
	      //Text field for name 
	      TextField nameText = new TextField(); 
	       
	      //Label for date of birth 
	      Text dobLabel = new Text("Event Date"); 
	      
	      //date picker to choose date 
	      DatePicker datePicker = new DatePicker(); 
	       
	      //Label for gender
	      Text genderLabel = new Text("Type"); 
	      
	      //Toggle group of radio buttons       
	      ToggleGroup groupGender = new ToggleGroup(); 
	      RadioButton maleRadio = new RadioButton("Veg"); 
	      maleRadio.setToggleGroup(groupGender); 
	      RadioButton femaleRadio = new RadioButton("Non - Veg"); 
	      femaleRadio.setToggleGroup(groupGender); 
	       
	      //Label for reservation 
	      Text reservationLabel = new Text("Reservation"); 
	      
	      //Toggle button for reservation 
	      ToggleButton Reservation = new ToggleButton(); 
	      ToggleButton yes = new ToggleButton("Yes"); 
	      ToggleButton no = new ToggleButton("No"); 
	      ToggleGroup groupReservation = new ToggleGroup(); 
	      yes.setToggleGroup(groupReservation);   
	      no.setToggleGroup(groupReservation); 
	       
	      //Label for technologies known 
	      Text technologiesLabel = new Text("Package"); 
	      
	      //check box for education 
	      CheckBox javaCheckBox = new CheckBox("Normal"); 
	      javaCheckBox.setIndeterminate(false); 
	      
	      //check box for education 
	      CheckBox dotnetCheckBox = new CheckBox("Premium"); 
	      javaCheckBox.setIndeterminate(false); 
	       
	      //Label for education 
	      Text educationLabel = new Text("Educational qualification"); 
	      
	      //list View for educational qualification
//	      CheckBox ch1 = new CheckBox("Engineering");
//	      CheckBox ch2 = new CheckBox("MCA");
//	      CheckBox ch3 = new CheckBox("MBA");
//	      CheckBox ch4 = new CheckBox("MTECH");
//	      CheckBox ch5 = new CheckBox("Mphil");
//	      CheckBox ch6 = new CheckBox("Phd");
	      
	      //Label for location 
	      Text locationLabel = new Text("Location"); 
	      
	      //Choice box for location 
	      ChoiceBox locationchoiceBox = new ChoiceBox(); 
	      locationchoiceBox.getItems().addAll("Madurai", "Chennai", "Vellore", "Banglore", "Trichy"); 
	       
	      //Label for register 
	      Button buttonRegister = new Button("Register");  
	      
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(500, 500); 
	       
	      //Setting the padding    
	      gridPane.setPadding(new Insets(10, 10, 10, 10));  
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	      //Arranging all the nodes in the grid 
	      gridPane.add(nameLabel, 0, 0); 
	      gridPane.add(nameText, 1, 0); 
	       
	      gridPane.add(dobLabel, 0, 1);       
	      gridPane.add(datePicker, 1, 1); 
	      
	      gridPane.add(genderLabel, 0, 2); 
	      gridPane.add(maleRadio, 1, 2);       
	      gridPane.add(femaleRadio, 2, 2); 
	      gridPane.add(reservationLabel, 0, 3); 
	      gridPane.add(yes, 1, 3);       
	      gridPane.add(no, 2, 3);  
	       
	      gridPane.add(technologiesLabel, 0, 4); 
	      gridPane.add(javaCheckBox, 1, 4);       
	      gridPane.add(dotnetCheckBox, 2, 4);  
	       
//	      gridPane.add(educationLabel, 0, 5);
//	      gridPane.add(ch1, 0, 2);
//	      gridPane.add(ch2, 1, 2);
//	      gridPane.add(ch3, 2, 2);
//	      gridPane.add(ch4, 3, 2);
//	      gridPane.add(ch5, 4, 2);
//	      gridPane.add(ch6, 5, 2);
	            
	       
	      gridPane.add(locationLabel, 0, 6); 
	      gridPane.add(locationchoiceBox, 1, 6);    
	       
	      gridPane.add(buttonRegister, 2, 8);      
	           
	       
	      //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	      
	      //Setting title to the Stage 
	      stage.setTitle("Catering Management"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);  
	      
	      //Displaying the contents of the stage 
	      stage.show();
	      
	   } 
	
//	public class ConnectDB {
//
//		Connection connection;
//		String dbname = "demo";
//		String dbuser = "root";
//		String dbpassword = "";
//		
//		public Connection getConnection() throws ClassNotFoundException, SQLException{
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname, dbuser, dbpassword);
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			return connection;
//		}
//	}
	
	public static void main(String args[]){ 
	      launch(args);
//	      ConnectDB connectDB = new ConnectDB();
//	    	Connection connection = connectDB.getConnection();
//	    	String sql = "INSERT INTO 'user' (username, password) VALUES ('name')";
//	    	Statement statement = (Statement) connection.createStatement();
//	    	((java.sql.Statement) statement).executeQuery(sql);
//	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
//	    	alert.setHeaderText("Successfully inserted");
//	    	alert.setTitle("SUCCESS");
//	    	alert.showAndWait();
	      
//	      Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con;
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
//			System.out.print("Database Connected");
//			String sql = "INSERT INTO 'catering' (name) VALUES ('"+nameText.getText()"')";
//			Statement statement = connection.createStatement();
//			statement.execute();
	   } 
	}
