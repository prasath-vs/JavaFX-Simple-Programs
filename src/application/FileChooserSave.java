package application;

import javafx.application.Application;
import java.io.File;
import javafx.scene.Scene;  
import javafx.scene.control.Button;   
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;  
import javafx.stage.Stage;

public class FileChooserSave extends Application{

	public static void main(String[] args) {  
		launch(args);  
		}  
		@Override  
		public void start(Stage primaryStage)  
		{  
		    Button btn = new Button("SAVE");  
		    btn.setOnAction(e->  
		    {  
		        FileChooser file = new FileChooser();  
		        file.setTitle("Save Image");  
		        //System.out.println(pic.getId());  
		        File file1 = file.showSaveDialog(primaryStage);  
		        System.out.println(file1);  
		    });  
		      
		    StackPane root = new StackPane();  
		    Scene scene = new Scene(root,200,300);  
		    primaryStage.setScene(scene);  
		    root.getChildren().add(btn);  
		    primaryStage.show();  
		}  
}
