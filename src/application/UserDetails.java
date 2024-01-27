package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class UserDetails extends Application{

	@Override
    public void start(Stage primaryStage) {
    // Label controls
		Label idLabel  = new Label("ID");
	    Label nameLabel = new Label("Name");
	    Label mobLabel = new Label("Mobile Number");
	    Label genderLabel  = new Label("Gender");
	    Label resultLabel = new Label();
 
    //TextField Controls
	    TextField idText = new TextField();
	    TextField nameText = new TextField();
	    TextField mobText = new TextField();
   
	//Radio Button controls
	    RadioButton male = new RadioButton("Male");
	    RadioButton female = new RadioButton("Female");
	    RadioButton transgender = new RadioButton("Transgender");
	    ToggleGroup gender = new ToggleGroup();
	    
    //Grouping Radio Buttons
	    male.setToggleGroup(gender);
	    female.setToggleGroup(gender);
	    transgender.setToggleGroup(gender);
	    male.setSelected(true);
    
	//Button controls
	    Button submitBtn = new Button("SUBMIT");
        Button resetBtn = new Button("RESET");
        
    //Creating Pane
        GridPane gp =new GridPane();
        
   //set Pane spacing
        gp.setPadding(new Insets(15,15,15,15));
        gp.setVgap(10);
        gp.setHgap(10);
        
  //adding controls to the pane
        gp.addRow(0,idLabel,idText);
        gp.addRow(1,nameLabel,nameText);
        gp.addRow(2,mobLabel,mobText);
        gp.addRow(3, genderLabel,male);
        gp.add(female,1,4);
        gp.add(transgender,1,5);
        gp.add(submitBtn,1,6);
        gp.add(resetBtn,2,6);
        gp.add(resultLabel,2,7);

//click event methods for button        
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //adding the input field values
                String s ="id - "+ idText.getText()+" Name - "+nameText.getText()+" Mobile - "+mobText.getText()+" Gender - ";
               //finding which radio button was selected
                if (male.isSelected())
                    s = s+male.getText();
                else if (female.isSelected())
                     s = s +female.getText();
                else
                    s = s+transgender.getText();
                resultLabel.setText(s);
            }
        });
        resetBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                idText.setText("");
                nameText.setText("");
                mobText.setText("");
                resultLabel.setText("");
            }
        });
        
  //creating scene with pane      
        Scene scene = new Scene(gp, 500, 500);
 //set the scene to the stage       
        primaryStage.setTitle("User Details");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

	
}
