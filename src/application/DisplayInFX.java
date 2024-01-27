package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontPosture;
//import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayInFX extends Application{

	public void start(Stage stage) {
	      
	      //Creating labels
	      Label label1 = new Label("Name: ");
	      Label label2 = new Label("Email: ");
		  //Creating nodes
	      TextField textField1 = new TextField();
	      TextField textField2 = new TextField();
	      Button button = new Button("Submit");
	      button.setTranslateX(250);
	      button.setTranslateY(75);
	      //Setting the message with read data
	      Text text = new Text("");
	      //Setting font to the label
//	      Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10);
//	      text.setFont(font);
	      text.setTranslateX(15);
	      text.setTranslateY(125);
//	      text.setFill(Color.BROWN);
//	      text.maxWidth(580);
//	      text.setWrappingWidth(580);
	      //Displaying the message
	      button.setOnAction(new EventHandler<ActionEvent>(){
	         //Retrieving data
	    	  public void handle(ActionEvent arg0) {
	    	  String name = textField1.getText();
	         String email = textField2.getText();
	         text.setText("Hello "+name+" Welcome to VIT. From now, we will communicate with you at "+email);
	    	  }  
	        });
	      //Adding labels for nodes
	      HBox box = new HBox(5);
	      box.setPadding(new Insets(25, 5 , 5, 50));
	      box.getChildren().addAll(label1, textField1, label2, textField2);
	      Group root = new Group(box, button, text);
	      //Setting the stage
	      Scene scene = new Scene(root, 595, 150);
	      stage.setTitle("Text Field Example");
	      stage.setScene(scene);
	      stage.show();
	   }
	   public static void main(String args[]){
	      launch(args);
	   }
}

