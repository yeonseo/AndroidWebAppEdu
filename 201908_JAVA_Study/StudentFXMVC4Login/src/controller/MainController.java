package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainController implements Initializable {
	@FXML private TextField txtName;
	@FXML private Button btnInsert;
	@FXML private Button btnDelete;
	@FXML private Button btnEnd;
	@FXML private Button btnOk;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnInsert.setOnAction(e->{ handlerBtnInsertAction(e); });
		btnEnd.setOnAction(e->{ handlerBtnEndAction(e); });
		btnDelete.setOnAction(e->{ handlerBtnDeleteAction(e); });
		btnOk.setOnAction(e->{ handlerBtnOkAction(e); });
	}
	public void handlerBtnInsertAction(ActionEvent e) {
		alertDisplay(5,"��������","��������", txtName.getText()+"�� �ݰ����ϴ�!" );
		
	}
	public void handlerBtnEndAction(ActionEvent e) {
		alertDisplay(5,"����","����", txtName.getText()+"�� �ȳ���������!" );
		
	}
	public void handlerBtnDeleteAction(ActionEvent e) {
		alertDisplay(5,"����","����", txtName.getText()+"�� �����߽��ϴ�!" );	
	}
	public void handlerBtnOkAction(ActionEvent e) {
		alertDisplay(5,"Ȯ��","Ȯ��", txtName.getText()+"�� Ȯ���߽��ϴ�!" );	
		
	}
	//���â	
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
		alert.setContentText(headerText+"\n"+contentText);
		alert.setResizable(false);
		alert.showAndWait();
		
	}
}
