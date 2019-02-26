package db;
/*
 *  throws Exception 을 강제함!
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("reg_date"));
			}
			while(rs.next()) {
				System.out.println(rs.getString("content"));
			}
			System.out.println("연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
