package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String title = rs.getString("title");
				System.out.println("title : " + title);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
