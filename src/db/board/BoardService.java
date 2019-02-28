package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement	ps = DBCon.getCon().prepareStatement(sql);
			ResultSet		 	rs = ps.executeQuery();
			System.out.println("글번호 / 제목");
			while(rs.next()) {
				System.out.print(rs.getString("bi_num") + "      ");
				System.out.println(rs.getString("bi_title"));
			}
			System.out.println("조회가 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
	
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title, bi_content,"
				+ " bi_credat, bi_cretim) ";
		sql += "values(seq_bi_num.nextval, ?, ?, to_char(sysdate, 'yyyymmdd'), "
				+ "to_char(sysdate, 'hh24miss'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상적으로 게시물이 등록 완료!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
	
	public void updateBoard(String inNum, String inTitle, String inConnent) {
		String sql = "update board_info set bi_title = ?, bi_content = ? "
				+ "where bi_num = ?";
		
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, inTitle);
			ps.setString(2, inConnent);
			ps.setString(3, inNum);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("게시물등록 완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		
	}

	public void deleteBoard(int num) {
		String sql = "delete from board_info where bi_num = ?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setInt(1, num);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상적으로 게시물이 삭제 됨!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
}
