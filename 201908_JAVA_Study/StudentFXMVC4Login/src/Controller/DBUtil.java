package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



//����̹��� ����,���̵� �н������ mysql ����Ÿ���̽� �����û->��ü��������(db�� �ּҸ� �˷��ִ�)
public class DBUtil {
	//1.����̹����� ���ؼ� ����
	private static String driver="com.mysql.jdbc.Driver";
	//2.����Ÿ���̽� url����
	private static String url="jdbc:mysql://localhost/studentMVC";
	
	//2.����̹��� �����ϰ� ����Ÿ���̽��� �����ϴ� �Լ�
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//1.����̹��� ����
		Class.forName(driver);
		//2.�����ͺ��̽� ����
		Connection con=DriverManager.getConnection(url, "root", "ysnam007");
		return con;
	}
	
	public static void alertDisplay(int type, String title, String headerText, String contentText) {
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


