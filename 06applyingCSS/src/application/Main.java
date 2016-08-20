package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		mainWindow();
	}
	
	public void mainWindow(){
		
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
		try {
			AnchorPane pane = fxmlLoader.load();
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			MainWindowController controller = fxmlLoader.getController();
			controller.setMain(this);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
