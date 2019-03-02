package me.db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "osfu";
	private static final String PASSWARD = "12345678";
	public static Connection con;
	
	public static Connection getCon() {
		try {
			con = DriverManager.getConnection(URL, USER, PASSWARD);
			
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
		con = null;
	}
}
