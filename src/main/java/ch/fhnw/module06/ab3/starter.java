package ch.fhnw.module06.ab3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class starter extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent rootPanel = new ApplicationUI3();
		
		Scene scene = new Scene(rootPanel);
		
		primaryStage.setTitle("Arbeitsblatt (3)");
		primaryStage.setScene(scene);
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.centerOnScreen();
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
