package controller.view_control.test;

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
		ObservableList<String> listViewData =FXCollections.observableArrayList();
		listViewData.add("Galaxy S1");
		listViewData.add("Galaxy S2");
		listViewData.add("Galaxy S3");
		listViewData.add("Galaxy S4");
		listViewData.add("Galaxy S5");
		listViewData.add("Galaxy S6");
		listViewData.add("Galaxy S7");
		
		listView.setItems(listViewData);
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				 tableView.getSelectionModel().select(newValue.intValue());
				 tableView.scrollTo(newValue.intValue());
				
			}

		});
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		
	   //2. tableViewData에(테이블뷰) new Phone("S1","phone01.png") 추가한다
		tableViewData.add(new Phone("s1", "phone01.png"));
		tableViewData.add(new Phone("s2", "phone02.png"));
		tableViewData.add(new Phone("s3", "phone03.png"));
		tableViewData.add(new Phone("s4", "phone04.png"));
		tableViewData.add(new Phone("s5", "phone05.png"));
		tableViewData.add(new Phone("s6", "phone06.png"));
		tableViewData.add(new Phone("s7", "phone07.png"));
		
	   //3. 각 테이블컬럼과 Phone클래스 멤버이름과 연결한다. 
	   // TableColumn tcSmartPhone=tableView.getColumns().get(0);
	   // tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		TableColumn tcSmartPhone=tableView.getColumns().get(0);
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx -aligment:CENTER");
		TableColumn tcImage=tableView.getColumns().get(1);
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx -aligment:CENTER");
		
	   //4. 테이블뷰에 tableViewData를 추가한다.
		tableView.setItems(tableViewData);
	   //5. 테이블뷰에 이벤트처리한다. (힌트: getSelectionModel())
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {

			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone newValue) {
				Image image = new Image(getClass().getResource("images/"+newValue.getImage()).toString());
				imageView.setImage(image);
				
			}
		});
	}
	
	public void handlerButtonOKAction(ActionEvent e)  {
		String data = listView.getSelectionModel().selectedIndexProperty().toString();
		System.out.println(data);
		Phone phone = tableView.getSelectionModel().selectedItemProperty().get();
		System.out.println(phone);
	}
	
	public void handlerButtonExitAction(ActionEvent e) {
		Platform.exit();
	}
}
