package ch.fhnw.module06.ab1;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI1 extends StackPane {

	private Button button;
	
	public ApplicationUI1() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		button = new Button("Hello World");;
	}
	
	private void layoutControls() {
		getChildren().add(button);
	}
}
