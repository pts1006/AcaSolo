package jjw.solo.manager.boarder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDao {

	private static SingletonDao orcl;
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "jjw";
	private String password = "jjw";
	
	private Connection connection;
	
	private SingletonDao() {}

	public static SingletonDao getInstance() {
		if(orcl == null) {
			orcl = new SingletonDao();
		}
		return orcl;
	}
	
	public Connection getConnection() {
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("연결 OK");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("연결 X");
		}
		return connection;
	}
	
	
	
}
