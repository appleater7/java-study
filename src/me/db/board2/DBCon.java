package me.db.board2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	public static Connection con;
	
	
	public static Connection getCon() {
		try {
			if(con != null) {
				con = DriverManager.getConnection(URL, USER, PASSWORD);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void close() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(con != null) {
			con = null;
		}
	}
}
