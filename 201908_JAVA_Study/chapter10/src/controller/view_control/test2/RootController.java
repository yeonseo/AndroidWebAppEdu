package controller.view_control.test2;

import java.net.URL;
import java.util.ResourceBundle;

import controller.view_control.Phone;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> listViewData = FXCollections.observableArrayList();
		listViewData.add("S1");
		listViewData.add("S2");
		listViewData.add("S3");
		listViewData.add("S4");
		listViewData.add("S5");
		listViewData.add("S6");
		listViewData.add("S7");
		
		listView.setItems(listViewData);
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
			}
		});
		
		
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		tableViewData.add(new Phone("Galaxy S1", "phone01.png"));
		tableViewData.add(new Phone("Galaxy S2", "phone02.png"));
		tableViewData.add(new Phone("Galaxy S3", "phone03.png"));
		tableViewData.add(new Phone("Galaxy S4", "phone04.png"));
		tableViewData.add(new Phone("Galaxy S5", "phone05.png"));
		tableViewData.add(new Phone("Galaxy S6", "phone06.png"));
		tableViewData.add(new Phone("Galaxy S7", "phone07.png"));
		
		TableColumn tcSmartPhone=tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx -aligment:CENTER");
		TableColumn tcImage=tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx -aligment:CENTER");
		
		tableView.setItems(tableViewData);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				Image image = new Image(getClass().getResource("images/"+newValue.getImage()).toString());
				imageView.setImage(image);
			}
		});
		
	}
	
	public void handlerButtonOKAction(ActionEvent e)  {
		String data = listView.getSelectionModel().getSelectedItem();
		System.out.println("list "+ data);
		Phone phone = tableView.getSelectionModel().getSelectedItem();
		System.out.println(phone);
	}
	public void handlerButtonExitAction(ActionEvent e) {
	   //1. 현재창을 닫는다. 
		Platform.exit();
	}
}
