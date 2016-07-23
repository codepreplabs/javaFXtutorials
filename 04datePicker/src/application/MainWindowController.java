package application;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

public class MainWindowController {
	
	private Main main;
	
	@FXML
	private DatePicker datePicker;
	
	public void setMain(Main main){
		this.main = main;
		datePicker.setValue(LocalDate.now());
		datePicker.setOnAction(event -> {
			LocalDate date = datePicker.getValue();
			System.out.println("date selected : "+date);
		});
	}
}
