package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Calculator extends Application{

	@Override
    public void start(Stage primaryStage) {
        Label n1Label  = new Label("Number1");
        Label n2Label  = new Label("Number2");
        Label resLabel  = new Label("Result");
        
        TextField n1Text = new TextField();
        TextField n2Text = new TextField();
        TextField resText = new TextField();
        resText.setEditable(false);
        
        Button addbtn = new Button("ADDITION");
        Button mulbtn = new Button("MULTIPLICATION");
        Button divbtn = new Button("DIVISION");
        Button subbtn = new Button("SUBTRACTION");
        
        addbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int res;
                res = Integer.parseInt(n1Text.getText()) + Integer.parseInt(n2Text.getText());
                resText.setText(Integer.toString(res));
                resLabel.setText("Addition");
            }
        });
        subbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int res;
                res = Integer.parseInt(n1Text.getText()) - Integer.parseInt(n2Text.getText());
                resText.setText(Integer.toString(res));
               resLabel.setText("Sutraction");
             }
        });
        mulbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int res;
                res = Integer.parseInt(n1Text.getText()) * Integer.parseInt(n2Text.getText());
                resText.setText(Integer.toString(res));
                resLabel.setText("Multiplication");
            }
        });
        divbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int res;
                res = Integer.parseInt(n1Text.getText()) / Integer.parseInt(n2Text.getText());
                resText.setText(Integer.toString(res));
                  resLabel.setText("Divsion");
          }
        });
        
        GridPane root = new GridPane();
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(10);
        root.setHgap(5);
        root.addRow(0,n1Label,n1Text);
        root.addRow(1,n2Label,n2Text);
        root.addRow(2,resLabel,resText);
        root.addRow(3,addbtn,subbtn);
        root.addRow(4,mulbtn,divbtn);
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
