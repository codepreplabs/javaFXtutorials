package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainWindowController {
	
	private Main main;
	
	public void setMain(Main main){
		this.main = main;
	}
	
	public void handleAlert1(){
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("This is the header");
		alert.setContentText("this is the content text");
		alert.showAndWait();
		
	}
	
	public void handleAlert2(){
		
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Information");
		alert.setHeaderText("This is the header");
		alert.setContentText("this is the content text");
		alert.showAndWait();
	}
	
	public void handleAlert3(){
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Information");
		alert.setHeaderText("This is the header");
		alert.setContentText("this is the content text");
		alert.showAndWait();
	}
	
	public void handleAlert4(){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Information");
		alert.setHeaderText("This is the header");
		alert.setContentText("this is the content text");
		alert.showAndWait();
	}

}
