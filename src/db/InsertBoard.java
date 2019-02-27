package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String title = "게시물 제목";
			String content = "게시물 내용";
			
			String sql = "insert into board_info ";
			sql += "(bi_num, bi_title, bi_content, \r\n" +
					"bi_credat, bi_cretim) ";
			sql += " values (9, '???'||?, ?, to_char(sysdate, 'yyyymmdd'), to_char(sysdate, 'hh24miss'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			System.out.println(cnt);
			if (cnt == 1) {
				System.out.println("정상적으로 1개가 입력됨");
			}else if(cnt == 0 ) {
				System.out.println("몰라 안들어갔는데??");
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
