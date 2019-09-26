package controller.view_control;

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
	public void initialize(URL arg0, ResourceBundle arg1) {
	   //1. 리스트뷰를 항목을 삽입하고 프로퍼티 이벤트처리한다.
	   insertListViewItemAndEventProcess();
	   //2. 테이블뷰를 항목을 삽입하고 테이블컬럼 연결하고, 프로퍼티 이벤트처리한다.
	   insertTableViewItemAndEventProcess();
	   
	} //end initialize
	private void insertTableViewItemAndEventProcess() {
	   //1. ObservableList<Phone>  tableViewData 객체를 구한다.
		ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
		
	   //2. tableViewData에(테이블뷰) new Phone("S1","phone01.png") 추가한다
		tableViewData.add(new Phone("S1","phone01.png"));
		tableViewData.add(new Phone("S2","phone02.png"));
		tableViewData.add(new Phone("S3","phone03.png"));
		tableViewData.add(new Phone("S4","phone04.png"));
		tableViewData.add(new Phone("S5","phone05.png"));
		tableViewData.add(new Phone("S6","phone06.png"));
		tableViewData.add(new Phone("S7","phone07.png"));
		
	   //3. 각 테이블컬럼과 Phone클래스 멤버이름과 연결한다. 
	   // TableColumn tcSmartPhone=tableView.getColumns().get(0);
		TableColumn tcSmartPhone = tableView.getColumns().get(0);
		TableColumn tcImage = tableView.getColumns().get(1);
		
	   // tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
		tcSmartPhone.setStyle("-fx-alignment: CENTER");
		
		
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcImage.setStyle("-fx-alignment: CENTER");
		
	   //4. 테이블뷰에 tableViewData를 추가한다.
		tableView.setItems(tableViewData);
		
	   //5. 테이블뷰에 이벤트처리한다. (힌트: getSelectionModel())
		tableView.setItems(tableViewData);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
			@Override
			public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone phone) {
				Image image = new Image(getClass().getResource("images/"+phone.getImage()).toString());
				imageView.setImage(image);
			}
		});
	   //5.1  선택된 phone객체에서 getImage 이름을 가져와서 imageView에 적용
	   //시킨다. 
	}
	private void insertListViewItemAndEventProcess() {
	   //1. ObservableList<String>  listViewData 객체를 구한다.
		ObservableList<String>  listViewData = FXCollections.observableArrayList();
		
	   //2. listViewData에(리스트뷰) 갤럭시S1 ~ 갤럭시S7  추가한다
		listViewData.add("galaxy s1");
		listViewData.add("galaxy s2");
		listViewData.add("galaxy s3");
		listViewData.add("galaxy s4");
		listViewData.add("galaxy s5");
		listViewData.add("galaxy s6");
		listViewData.add("galaxy s7");
		
	   //3. 리스트뷰에 listViewData를 추가한다.
		listView.setItems(listViewData);
		
	   //4. 리스트뷰에 이벤트처리한다. (힌트: getSelectionModel())
	      //4.1 테이블뷰 위치를 부여한다. 선택한다.
	      //4.2 테이블뷰 scrollTo(위치)선택한다.
		
		listView.setItems(listViewData);
		listView.setStyle("-fx-alignment: CENTER");
		
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
		
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				tableView.getSelectionModel().select(newValue.intValue());;
				tableView.scrollTo(newValue.intValue());
			}
		});
		
		
		
	}
	public void handlerButtonOKAction(ActionEvent e) {
		String data = listView.getSelectionModel().selectedItemProperty().toString();
		System.out.println("Phone : " + data);
		Phone phone = tableView.getSelectionModel().selectedItemProperty().get();
		System.out.println("Table : "+phone);
	}
	public void handlerButtonExitAction(ActionEvent e) {
	   Platform.exit();
	}

}











//private void insertListViewItemAndEventProcess() {
//
//	ObservableList<Phone> tableViewData = FXCollections.observableArrayList();
//	tableViewData.add(new Phone("galaxy s1","phone01.png"));
//	tableViewData.add(new Phone("galaxy s2","phone02.png"));
//	tableViewData.add(new Phone("galaxy s3","phone03.png"));
//	tableViewData.add(new Phone("galaxy s4","phone04.png"));
//	tableViewData.add(new Phone("galaxy s5","phone05.png"));
//	tableViewData.add(new Phone("galaxy s6","phone06.png"));
//	tableViewData.add(new Phone("galaxy s7","phone07.png"));
//	
//	TableColumn tcSmartPhone = tableView.getColumns().get(0);
//	tcSmartPhone.setCellValueFactory(new PropertyValueFactory("smartPhone"));
//	tcSmartPhone.setStyle("-fx-alignment: CENTER");
//	
//	TableColumn tcImage = tableView.getColumns().get(1);
//	tcImage.setCellValueFactory(new PropertyValueFactory("smartPhone"));
//	tcImage.setStyle("-fx-alignment: CENTER");
//	
//	tableView.setItems(tableViewData);
//	
//	tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Phone>() {
//		@Override
//		public void changed(ObservableValue<? extends Phone> observable, Phone oldValue, Phone phone) {
//			Image image = new Image(getClass().getResource("images/"+phone.getImage()).toString());
//			imageView.setImage(image);
//		}
//	});
//	
//}
//private void insertTableViewItemAndEventProcess() {
//ObservableList<String> listViewData = FXCollections.observableArrayList();
//
//listViewData.add("galaxy s1");
//listViewData.add("galaxy s2");
//listViewData.add("galaxy s3");
//listViewData.add("galaxy s4");
//listViewData.add("galaxy s5");
//listViewData.add("galaxy s6");
//listViewData.add("galaxy s7");
//
//listView.setItems(listViewData);
//
//listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//
//	@Override
//	public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//		tableView.getSelectionModel().select(newValue.intValue());;
//		tableView.scrollTo(newValue.intValue());
//	}
//
//});
//
//}
//
//
