package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;

public class LoginController implements Initializable {

	@FXML
	private TextField txtId;
	@FXML
	private PasswordField txtPassword;
	@FXML
	private Button btnCancel;
	@FXML
	private Button btnLogin;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnLogin.setOnAction(event -> handlerBtnLoginActoion(event));
		btnCancel.setOnAction(event -> handlerBtnCancelActoion(event));
	}

	public void handlerBtnCancelActoion(ActionEvent event) {
		((Stage)btnLogin.getScene().getWindow()).close();
//		Platform.exit();
	}

	public void handlerBtnLoginActoion(ActionEvent event) {		
		//1. 아이디와 비밀변호가 제대로 입력되지 않았을 때.
		if (txtId.getText().equals("") || txtPassword.getText().equals("")) {
			alertDispaly(1, "로그인 실패", "아이디와 비밀번호 미입력", "아이디와 비밀번호중 입력하지 않은 항목이 있습니다." + "\n 다시 제대로 입력하시오.");
			//return;
		}
		
		//2. 아이디와 비밀변호가 제대로 입력되었을 때.
		else if (txtId.getText().equals("admin") && txtPassword.getText().equals("1234")) {
			try {
				//로그인이 완료되었으면 다음 메인창으로 이동한다.
//				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/view.fxml"));
				Parent mainView = (Parent)loader.load();
				Scene scane = new Scene(mainView);
				Stage mainStage = new Stage();
				mainStage.setTitle("Main Window");
				mainStage.setScene(scane);
				
				Stage oldStage = (Stage) btnLogin.getScene().getWindow();
				oldStage.close();
//				((Stage)btnLogin.getScene().getWindow()).close(); //실무에서 많이 사용함.
				
				mainStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("오류" + e);
			}
		} else {
			// 아이디패스워드 확인하라는 창
			alertDispaly(1, "로그인 실패", "아이디와 비밀번호 불일치", "아이디와 비밀번호가 일치하지 않습니다." + "\n 다시 제대로 입력하시오.");
		}
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