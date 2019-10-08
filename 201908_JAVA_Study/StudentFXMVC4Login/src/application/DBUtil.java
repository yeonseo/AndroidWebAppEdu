package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static final String driver = "jdbc:mysql://192.168.0.209/studentMVC";
	//한글이 안될경우  해당테이블을 Alter table student convert to character set utf8; 로 수정할 것
//static final String url = 
//"jdbc:mysql://localhost/airline?useUnicode=true&characterDncoding=utf8";
static final String url = "jdbc:mysql://localhost/airline ";

	public static Connection getConnection() throws Exception {

//1. jdbc 드라이버를 적재
	Class.forName(driver); 

//2. 데이터 베이스 연결
	Connection con = DriverManager.getConnection(url, "root", "123456");
	System.out.println("DB 연결 성공");
	return con;
	}
}
