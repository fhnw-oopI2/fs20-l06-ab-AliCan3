package ch.fhnw.module06.ab2;

import java.awt.TextField;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI2 extends VBox{
	
	private Label label1;
	private javafx.scene.control.TextField t_field1;
	private TextArea t_area1;
	private Button button1;
	private Insets inset = new Insets(10,10,10,10);
	
	public ApplicationUI2() {
		initializeControls();
		Paddings();
		layoutControls();
	}
	
	private void initializeControls() {
		label1 = new Label("ein Label");
		t_field1 = new javafx.scene.control.TextField("text field");
		t_area1 = new TextArea("text area");
		button1 = new Button("ein Button");
		
	}
	
	private void Paddings() {
		setMargin(label1, new Insets(10,10,0,10));
		setMargin(t_field1, new Insets(10,10,0,10));
		setMargin(t_area1, new Insets(10,10,0,10));
		setMargin(button1, new Insets(10,10,10,10));
	}
	
	private void layoutControls() {
	getChildren().addAll(label1,t_field1,t_area1, button1);
	}

}
