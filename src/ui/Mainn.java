package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mainn extends Application {
	@Override 
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("magicSquare.fxml"));
		
		Scene scene = new Scene(root);
		stage.setTitle("Magic Square!");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
