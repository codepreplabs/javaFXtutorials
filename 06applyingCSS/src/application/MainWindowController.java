package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class MainWindowController {
	
	private Main main;
	
	@FXML
	Region region;
	
	@FXML
	private Label titlelabel, firstNameLabel, emailLabel;
	
	@FXML
	private TextField firstNameField, lastNameField, emailField;
	
	@FXML
	private Button okButton, cancelButton;
	
	public void setMain(Main main){
		this.main = main;
	}
	
	public void handleOK(){
		System.out.println("OK");
	}
	
	public void handleCancel(){
		System.out.println("canceled");
	}

}
