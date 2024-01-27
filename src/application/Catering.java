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

public class Catering extends Application{

	@Override 
	   public void start(Stage stage) {    
	      
	      Text nameLabel = new Text("Customer Name"); 
	      TextField nameText = new TextField(); 
	      
	      Text dobLabel = new Text("Event Date");  
	      DatePicker datePicker = new DatePicker(); 
	      
	      Text typeLabel = new Text("Type");      
	      ToggleGroup groupType = new ToggleGroup(); 
	      RadioButton vegRadio = new RadioButton("Veg"); 
	      vegRadio.setToggleGroup(groupType); 
	      RadioButton nonvegRadio = new RadioButton("Non - Veg"); 
	      nonvegRadio.setToggleGroup(groupType); 
	       
	      Text reservationLabel = new Text("Reservation"); 
	      ToggleButton Reservation = new ToggleButton(); 
	      ToggleButton yes = new ToggleButton("Yes"); 
	      ToggleButton no = new ToggleButton("No"); 
	      ToggleGroup groupReservation = new ToggleGroup(); 
	      yes.setToggleGroup(groupReservation);   
	      no.setToggleGroup(groupReservation); 
	        
	      Text packageLabel = new Text("Package");  
	      CheckBox normalCheckBox = new CheckBox("Normal"); 
	      normalCheckBox.setIndeterminate(false); 
	      CheckBox premiumCheckBox = new CheckBox("Premium"); 
	      normalCheckBox.setIndeterminate(false); 
	       
	      //Text educationLabel = new Text("Educational qualification"); 
	      Text locationLabel = new Text("Location"); 
	      ChoiceBox locationchoiceBox = new ChoiceBox(); 
	      locationchoiceBox.getItems().addAll("Madurai", "Chennai", "Vellore", "Banglore", "Trichy"); 
	       
	       
	      Button buttonRegister = new Button("Register");  
	       
	      GridPane gridPane = new GridPane();    
	      gridPane.setMinSize(500, 500); 
	      gridPane.setPadding(new Insets(10, 10, 10, 10));   
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      gridPane.setAlignment(Pos.CENTER); 
	       
	      gridPane.add(nameLabel, 0, 0); 
	      gridPane.add(nameText, 1, 0);  
	      gridPane.add(dobLabel, 0, 1);       
	      gridPane.add(datePicker, 1, 1); 
	      gridPane.add(typeLabel, 0, 2); 
	      gridPane.add(vegRadio, 1, 2);       
	      gridPane.add(nonvegRadio, 2, 2); 
	      gridPane.add(reservationLabel, 0, 3); 
	      gridPane.add(yes, 1, 3);       
	      gridPane.add(no, 2, 3);  
	      gridPane.add(packageLabel, 0, 4); 
	      gridPane.add(normalCheckBox, 1, 4);       
	      gridPane.add(premiumCheckBox, 2, 4);    
	      gridPane.add(locationLabel, 0, 6); 
	      gridPane.add(locationchoiceBox, 1, 6);    
	      gridPane.add(buttonRegister, 2, 8);      
	           
	        
	      Scene scene = new Scene(gridPane);  
	      stage.setTitle("Catering Management"); 
	      stage.setScene(scene);  
	      stage.show();
	      
	      buttonRegister.setOnAction(new EventHandler<ActionEvent>() {  
	            
	            @Override  
	            public void handle(ActionEvent arg0) {  
	             
	                String name = nameText.getText(); 
	                System.out.println("The Customer "+name+" has registered");  
	            }  
	        });
	      
	   } 
	
	public static void main(String args[]){ 
	      launch(args);
	   } 
	}


