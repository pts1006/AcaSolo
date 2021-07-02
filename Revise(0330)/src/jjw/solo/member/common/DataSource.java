package jjw.solo.member.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {

	private static DataSource dataSource = new DataSource();
	private Connection conn;
	private String driver, url, user, password;

	private DataSource() {
	}

	public static DataSource getIncetance() {
		return dataSource;
	}

	public Connection getConnection() {

		dbConfig();

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	private void dbConfig() {

		String resource = getClass().getResource("../config/db.properties").getPath();
		Properties properties = new Properties();

		try {
			properties.load(new FileReader(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("passwird");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
