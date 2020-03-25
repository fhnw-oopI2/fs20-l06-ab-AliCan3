package ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Starter extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent rootPanel = new ApplicationUI1();
		Scene scene = new Scene(rootPanel);
		
		primaryStage.setTitle("Arbeitsblatt (1)");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.centerOnScreen();
		primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

}
