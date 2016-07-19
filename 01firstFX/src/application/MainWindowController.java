package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {
	
	private Main main;
	
	@FXML
	private Label label;
	
	@FXML
	private TextField field;
	
	public void setMain(Main main){
		this.main = main;
	}
	
	public void handleButton(){
		String text = field.getText();
		label.setText(text);
		field.clear();
	}

}
