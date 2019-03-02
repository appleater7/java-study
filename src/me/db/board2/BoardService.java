package me.db.board2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import me.db.board.BoardInfoVO;
import me.db.board.DBCon;

public class BoardService {
	
	public void selectBoardAll() {
		String sql = "select * from board_info";
		try {
			List<BoardInfoVO> biList = new ArrayList<>();
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				biList.add(bi);
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiCnt(rs.getInt("bi_cnt"));
				bi.setBiIsActive(rs.getString("bi_isactive"));				
			}
			for (BoardInfoVO bi:biList) {
				System.out.println(bi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	public void selectBoard(String selectNum) {
		String sql = "select * from board_info where bi_num = ?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, selectNum);
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> biList = new ArrayList<>();
			while (rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				biList.add(bi);
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiCnt(rs.getInt("bi_cnt"));
				bi.setBiIsActive(rs.getString("bi_isactive"));				
			}
			for (BoardInfoVO bi:biList) {
				System.out.println(bi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void insertBoard(String insertTitle, String insertContent) {
		String sql = "insert into board_info(bi_num, bi_title, bi_content, bi_credat, bi_cretim) "
				+ "values(seq_bi_num.nextval, ?, ?, to_char(sysdate,'yyyymmdd'), to_char(sysdate, 'hh24miss'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, insertTitle);
			ps.setString(2, insertContent);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("등록이 정상처리 되었습니다.");
			}else {
				System.out.println("정상처리 되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteBoard(String deleteNum) {
		String sql = "delete from board_info where bi_num = ?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, deleteNum);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("등록이 정상처리 되었습니다.");
			}else {
				System.out.println("정상처리 되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateBoard(String updateNum, String updateTitle, String updateContent) {
		String sql = "update board_info set bi_title = ?, bi_content = ? where bi_num = ?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, updateTitle);
			ps.setString(2, updateContent);
			ps.setString(3, updateNum);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("등록이 정상처리 되었습니다.");
			}else {
				System.out.println("정상처리 되지 않았습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
