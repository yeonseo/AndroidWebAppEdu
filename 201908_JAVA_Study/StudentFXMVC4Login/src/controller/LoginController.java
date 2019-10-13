package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
     @FXML private TextField txtId;
     @FXML private PasswordField txtPassword;
     @FXML private Button btnLogin;
     @FXML private Button btnCancel;
     
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1.��ư Ȯ�� �̺�Ʈ ó��
		btnLogin.setOnAction(e->{ handlerBtnLoginAction(e); });
		//2.��ư ��� �̺�Ʈ ó��
		btnCancel.setOnAction(e->{ handlerBtnCancelAction(e); });	
		txtId.setText("admin");
		txtPassword.setText("1234");
	}
	//1.��ư Ȯ�� �̺�Ʈ ó��	
	public void handlerBtnLoginAction(ActionEvent e) {
		//	1-1.입력칸이 비어 있는 경우
		if(txtId.getText().equals("")|| txtPassword.getText().equals("")) {
			alertDisplay(1,"값을 입력해주세요","아이디나 비번을 입력하지 않았습니다!","입력값을 확인해주세요!");
			
			//1-2.아이디와 비번이 비어있지 않는 경우
		}else if(txtId.getText().equals("admin") && txtPassword.getText().equals("1234")) {
			//아이디와 비번이 일치한 경우
			Parent mainView=null;
			Stage mainStage=null;
			try {
//				mainView=FXMLLoader.load(getClass().getResource("/View/main.fxml"));
				mainView=FXMLLoader.load(getClass().getResource("/View/view.fxml"));
				Scene scene=new Scene(mainView); 
				mainStage=new Stage();
				mainStage.setTitle("Main Window");
				mainStage.setScene(scene);
				mainStage.setResizable(true);
				//������ ���������� �ݰ� ���ο� â�� ����.				
				((Stage)btnLogin.getScene().getWindow()).close();;
				mainStage.show();
			} catch (IOException e1) {
				alertDisplay(1,"확인해주세요!!","����â �θ��� ����",e1.toString());
			}
			
		}else {
			//1-3.아이디와 비번이 일치하지 않는 경
			alertDisplay(1,"아이디와 비번 오류!","아이디와 비번이 일치하지 않습니다.","아이디와 비밀번호를 확인하세요!!");
		}      
		
	}
	//2.��ư ��� �̺�Ʈ ó��	
	public void handlerBtnCancelAction(ActionEvent e) {
	
		((Stage)btnLogin.getScene().getWindow()).close();;
	}
	//3.���â ó���ϴ� �Լ�	
	public void alertDisplay(int type, String title, String headerText, String contentText) {
		Alert alert=null;
		switch (type) {
		case 1:  alert=new Alert(AlertType.WARNING); break;
		case 2 : alert=new Alert(AlertType.CONFIRMATION); break;
		case 3:  alert=new Alert(AlertType.ERROR); break;
		case 4:  alert=new Alert(AlertType.NONE); break;
		case 5:  alert=new Alert(AlertType.INFORMATION); break;
		}
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(headerText+"\n"+contentText+"\n정신차려!");
		alert.setResizable(false);
		alert.showAndWait();
		
	}

}
