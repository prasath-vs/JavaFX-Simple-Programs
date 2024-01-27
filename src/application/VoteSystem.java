package application;

import javafx.application.Application;
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.GridPane;

public class VoteSystem extends Application {

	@Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Label name=new Label("Name: ");
        Label age=new Label("Age: ");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button vote = new Button("Vote");
        vote.setOnAction(new EventHandler<ActionEvent>() {  
            
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                int a = Integer.parseInt(t2.getText());
                if(a >= 18)
                {
                	System.out.println("Eligible to Vote!");
                }
                else
                {
                	System.out.println("Not eligible to vote :(");
                }
            	  
            }  
        });
        GridPane root = new GridPane();
        Scene scene = new Scene(root,400,200);
        root.addRow(0, name, t1);
        root.addRow(1, age, t2);
        root.addRow(2, vote);
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Voting Eligibility System");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
} 
