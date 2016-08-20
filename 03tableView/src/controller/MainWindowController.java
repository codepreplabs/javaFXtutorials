package controller;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Person;

public class MainWindowController {

	@SuppressWarnings("unused")
	private Main main;
	private Stage primaryStage;

	@FXML
	private TableView<Person> tableView;

	@FXML
	private TableColumn<Person, String> firstNameColumn;

	@FXML
	private TableColumn<Person, String> lastNameColumn;

	@FXML
	private TableColumn<Person, String> ageColumn;

	private ObservableList<Person> persons = FXCollections.observableArrayList();
	
	public void initialize(){
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
	}

	public void closeButton() {
		primaryStage.close();
	}
	
	public void populatePerson(){
		persons.add(new Person("Steve", "Jobs", "78"));
		persons.add(new Person("Bill", "Gates", "68"));
		persons.add(new Person("Steve", "Woznaik", "70"));
	}
	
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.primaryStage = primaryStage;
		populatePerson();
		tableView.setItems(persons);
	}

}
