package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/studentMVC";
//	private static String url = "jdbc:mysql://192.168.0.210/studentDB";

	public static Connection getConnection() throws Exception {

		Class.forName(driver);
//		Connection connection = DriverManager.getConnection(url, "root", "123456");
		Connection connection = DriverManager.getConnection(url, "root", "ysnam007");

		return connection;

	}
}
