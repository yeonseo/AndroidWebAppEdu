package controller.view_control.test;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	
	@FXML private ListView<String> listView;
	@FXML private TableView<Phone> tableView;
	@FXML private ImageView imageView;
	@FXML private Button buttonOK;
	@FXML private Button buttonExit;
	
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		insertListViewItemAndEventProcess();
		insertTableViewItemAndEventProcess();
		
	}//end of initialize()

	private void insertTableViewItemAndEventProcess() {
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		tableViewData.add(new Phone("Galaxy S1","phone01.png"));
		tableViewData.add(new Phone("Galaxy S2","phone02.png"));
		tableViewData.add(new Phone("Galaxy S3","phone03.png"));
		tableViewData.add(new Phone("Galaxy S4","phone04.png"));
		tableViewData.add(new Phone("Galaxy S5","phone05.png"));
		tableViewData.add(new Phone("Galaxy S6","phone06.png"));
		tableViewData.add(new Phone("Galaxy S7","phone07.png"));
		
		
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER");
		
		TableColumn tcImage = tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER");
		
		
		tableView.setItems(tableViewData);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone phone) {
				Image image = new Image(getClass().getResource("images/"+phone.getImage()).toString());
				imageView.setImage(image);
			}
		});
		
	}//end of insertTableViewItemAndEventProcess()

	private void insertListViewItemAndEventProcess() {
		ObservableList<String> listData = FXCollections.observableArrayList();
		
		listData.add("Galaxy S1");
		listData.add("Galaxy S2");
		listData.add("Galaxy S3");
		listData.add("Galaxy S4");
		listData.add("Galaxy S5");
		listData.add("Galaxy S6");
		listData.add("Galaxy S7");
		
		
		listView.setItems(listData);
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}

		});
		
	}//end of insertListViewItemAndEventProcess()

	public void handlerButtonOKAction(ActionEvent event) {
		String data = listView.getSelectionModel().getSelectedItem();
		System.out.println("Phone : " + data);
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println("Table : " + phone.toString());
	}
	public void handlerButtonExitAction(ActionEvent event) {
		Platform.exit();
	}

}
