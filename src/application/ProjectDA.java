package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ProjectDA extends Application{

	 @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("Catering Management System");

	        // Create the registration form grid pane
	        GridPane gridPane = createRegistrationFormPane();
	        // Add UI controls to the registration form grid pane
	        addUIControls(gridPane);
	        // Create a scene with registration form grid pane as the root node
	        Scene scene = new Scene(gridPane, 800, 500);
	        // Set the scene in primary stage
	        primaryStage.setScene(scene);

	        primaryStage.show();
	    }


	    private GridPane createRegistrationFormPane() {
	        // Instantiate a new Grid Pane
	        GridPane gridPane = new GridPane();

	        // Position the pane at the center of the screen, both vertically and horizontally
	        gridPane.setAlignment(Pos.CENTER);

	        // Set a padding of 20px on each side
	        gridPane.setPadding(new Insets(40, 40, 40, 40));

	        // Set the horizontal gap between columns
	        gridPane.setHgap(10);

	        // Set the vertical gap between rows
	        gridPane.setVgap(10);

	        // Add Column Constraints

	        // columnOneConstraints will be applied to all the nodes placed in column one.
	        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
	        columnOneConstraints.setHalignment(HPos.RIGHT);

	        // columnTwoConstraints will be applied to all the nodes placed in column two.
	        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
	        columnTwoConstrains.setHgrow(Priority.ALWAYS);

	        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

	        return gridPane;
	    }

	    private void addUIControls(GridPane gridPane) {
	        // Add Header
	        Label headerLabel = new Label("Enter Details");
	        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
	        gridPane.add(headerLabel, 0,0,2,1);
	        GridPane.setHalignment(headerLabel, HPos.CENTER);
	        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

	        // Add Name Label
	        Label nameLabel = new Label("Customer Name : ");
	        gridPane.add(nameLabel, 0,1);

	        // Add Name Text Field
	        TextField nameField = new TextField();
	        nameField.setPrefHeight(40);
	        gridPane.add(nameField, 1,1);


	        // Add Email Label
	        Label emailLabel = new Label("Email ID : ");
	        gridPane.add(emailLabel, 0, 2);

	        // Add Email Text Field
	        TextField emailField = new TextField();
	        emailField.setPrefHeight(40);
	        gridPane.add(emailField, 1, 2);
	        
	        Label occasionLabel = new Label("Event Name : ");
	        gridPane.add(occasionLabel, 0, 3);
	        
	        TextField occasionField = new TextField();
	        emailField.setPrefHeight(40);
	        gridPane.add(occasionField, 1, 3);
	        
	        Label nopeopleLabel = new Label("No. of People : ");
	        gridPane.add(nopeopleLabel, 0, 4);
	        
	        TextField nopeopleField = new TextField();
	        emailField.setPrefHeight(40);
	        gridPane.add(nopeopleField, 1, 4);

	        // Add Password Label
//	        Label passwordLabel = new Label("Password : ");
//	        gridPane.add(passwordLabel, 0, 3);

	        // Add Password Field
//	        PasswordField passwordField = new PasswordField();
//	        passwordField.setPrefHeight(40);
//	        gridPane.add(passwordField, 1, 3);

	        // Add Submit Button
	        Button submitButton = new Button("Submit");
	        submitButton.setPrefHeight(40);
	        submitButton.setDefaultButton(true);
	        submitButton.setPrefWidth(100);
	        gridPane.add(submitButton, 0, 6, 2, 1);
	        GridPane.setHalignment(submitButton, HPos.CENTER);
	        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

	        submitButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                if(nameField.getText().isEmpty()) {
	                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
	                    return;
	                }
	                if(emailField.getText().isEmpty()) {
	                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
	                    return;
	                }
	                if(occasionField.getText().isEmpty()) {
	                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a event name");
	                    return;
	                }
	                if(nopeopleField.getText().isEmpty()) {
	                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a No. of people");
	                    return;
	                }

	                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Form Completed!", "Welcome " + nameField.getText());
	            }
	        });
	    }

	    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
	        Alert alert = new Alert(alertType);
	        alert.setTitle(title);
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.initOwner(owner);
	        alert.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
}
