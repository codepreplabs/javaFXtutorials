package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	@SuppressWarnings("unused")
	private Stage secondaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		firstWindow();
	}

	public void firstWindow() {

		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("FirstWindowView.fxml"));
		try {
			AnchorPane pane = fxmlLoader.load();
			FirstWindowController controller = fxmlLoader.getController();
			controller.setMain(this);
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void secondWindow() {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SecondWindowView.fxml"));
			AnchorPane pane = fxmlLoader.load();
			Scene scene = new Scene(pane);
			Stage secondaryStage = new Stage();
			SecondWindowController controller = fxmlLoader.getController();
			controller.setMain(this, secondaryStage);
			secondaryStage.initOwner(primaryStage);
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			secondaryStage.setScene(scene);
			secondaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void changeWindow(){
		
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ChangeWindowView.fxml"));
			AnchorPane pane = fxmlLoader.load();
			Scene scene = new Scene(pane);
			Stage tertiaryStage = new Stage();
			ChangeWindowController controller = fxmlLoader.getController();
			controller.setMain(this, tertiaryStage);
			tertiaryStage.initOwner(primaryStage);
			tertiaryStage.initModality(Modality.WINDOW_MODAL);
			tertiaryStage.setScene(scene);
			tertiaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
