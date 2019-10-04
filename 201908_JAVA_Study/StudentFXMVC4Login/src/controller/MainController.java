package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController implements Initializable {
	
	@FXML private Button btnInsert;
	@FXML private Button btnDelete;
	@FXML private Button btnOk;
	@FXML private Button btnEnd;
	@FXML private TextField txtName;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnOk.setOnAction(event -> handlerBtnOkActoion(event));
		btnDelete.setOnAction(event -> handlerBtnDeleteActoion(event));
		btnInsert.setOnAction(event -> handlerBtnInsertActoion(event));
		btnEnd.setOnAction(event -> handlerBtnEndActoion(event));
	}

	public void handlerBtnInsertActoion(ActionEvent event) {
		alertDispaly(5, "첫 번째 탭 버튼", "첫 번째 탭입니다.", "이름은" + txtName.getText()+ " 입니다.");
	}

	public void handlerBtnEndActoion(ActionEvent event) {
		Platform.exit();
	}

	public void handlerBtnDeleteActoion(ActionEvent event) {
		txtName.clear();
		alertDispaly(5, "첫 번째 탭 버튼", "첫 번째 탭입니다.", "원하는 내용으로 채우세요 \n 사용가능합니다..");
	}

	public void handlerBtnOkActoion(ActionEvent event) {
		alertDispaly(5, "두 번째 탭 버튼", "두 번째 탭입니다.", "원하는 내용으로 채우세요 \n 사용가능합니다..");
	}
	
	private void alertDispaly(int type, String title, String headerText, String contentTezxt) {
		Alert alert=null; // warning, information, confirmation 을 사용할 수 있다.
		switch(type) {
		case 1 : alert = new Alert(AlertType.WARNING); break;
		case 2 : alert = new Alert(AlertType.CONFIRMATION); break;
		case 3 : alert = new Alert(AlertType.ERROR); break;
		case 4 : alert = new Alert(AlertType.NONE); break;
		case 5 : alert = new Alert(AlertType.INFORMATION); break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentTezxt);
		alert.setResizable(false);
		alert.showAndWait();		
	}	
}