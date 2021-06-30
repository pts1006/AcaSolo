package jjw.solo.board.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	private static Dao dao = new Dao();
	
	private Dao() {};
	
	public static Dao getInstance() {
		return dao;
	}
	
	public Connection getConnetction() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jjw", "jjw");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
