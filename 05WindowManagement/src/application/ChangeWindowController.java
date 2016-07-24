package application;

import javafx.stage.Stage;

public class ChangeWindowController {

	private Main main;
	private Stage tertiaryStage;

	public void setMain(Main main, Stage tertiaryStage) {
		this.main = main;
		this.tertiaryStage = tertiaryStage;
	}
	
	public void goBack(){
		tertiaryStage.close();
	}
	
	

}
