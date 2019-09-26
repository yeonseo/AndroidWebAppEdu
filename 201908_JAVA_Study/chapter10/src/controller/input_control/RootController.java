package controller.input_control;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField textFieldTitle;
	@FXML private PasswordField password;
	@FXML private ComboBox<String> comboBox;
	@FXML private DatePicker datePicker;
	@FXML private TextArea textArea;
	@FXML private Button buttonSave;
	@FXML private Button buttonCancle;
	
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		//comboBox data list
		ObservableList<String> list = FXCollections.observableArrayList();
		list.add("공개");
		list.add("비공개");
		comboBox.setItems(list);
		
		comboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				String Data = textArea.getText();
				textArea.setText(Data);
				
			}
		});
		
		buttonSave.setOnAction((event) ->{
			String title = textFieldTitle.getText();
			String passwordData = password.getText();
			String comboBoxData = comboBox.getValue();
			
			LocalDate localDate = datePicker.getValue();
			String localDateData = localDate.toString();
			
			textArea.setText(title+"\n"+passwordData+"\n"+comboBoxData+"\n"+localDateData);
		});
		
	}

	public void handlerButtonExitAction(ActionEvent event) {
		textArea.setText("");
	}

}
