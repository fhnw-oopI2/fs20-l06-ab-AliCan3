package ch.fhnw.module06.ab3;

import java.awt.TextField;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class ApplicationUI3 extends BorderPane{
	
	private Button button1;
	private Button button2;
	private TextArea t_area1;
	private Button button3;
	private Button button4;
	
	
	private Insets inset = new Insets(10,10,10,10);
	
	public ApplicationUI3() {
		initializeControls();
		Paddings();
		layoutControls();
	}
	
	private void initializeControls() {
		t_area1 = new TextArea("text area");
		button1 = new Button("top");
		button2 = new Button("left");
		button3 = new Button("right");
		button4 = new Button("bottom");	
	}
	
	private void Paddings() {
		button1.setMaxWidth(400);
		button4.setMaxWidth(400);
		setMargin(button1, inset);
		setMargin(button2, new Insets(0,10,0,10));
		setMargin(button3, new Insets(0,10,0,10));
		setMargin(button4, inset);
	
	}
	
	private void layoutControls() {
	setTop(button1);
	setLeft(button2);
	setCenter(t_area1);
	setRight(button3);
	setBottom(button4);
	}

}
