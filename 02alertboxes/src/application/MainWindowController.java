package application;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

public class MainWindowController {
	
	@SuppressWarnings("unused")
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
		alert.setTitle("Warning");
		alert.setHeaderText("warning header");
		alert.setContentText("A serious warning");
		alert.showAndWait();
	}
	
	public void handleAlert3(){
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText("Error header");
		alert.setContentText("fatal error ");
		alert.showAndWait();
	}
	
	public void handleAlert4(){
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation");
		alert.setHeaderText("Confirmation header");
		alert.setContentText("I agree with this notice");
		Optional<ButtonType> result = alert.showAndWait();
		if(result.get() == ButtonType.OK){
			System.out.println("YES");
		}else{
			System.out.println("CANCELLED");
		}
	}
	
	public void handleAlert5(){
		
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Input");
		dialog.setContentText("Please enter your age");
		Optional<String> result = dialog.showAndWait();
		if (Integer.parseInt(result.get()) > 18) {
			System.out.println("Allowed");
		}else{
			System.out.println("Kids not allowed, Adults only");
		}
	}

}
