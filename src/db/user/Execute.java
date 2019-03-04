package db.user;

import java.util.List;
import java.util.Scanner;

import db.board2.BoardInfoVO;

public class Execute {

	public static void main(String[] args) {
		UserService us = new UserService();
		List<BoardInfoVO> biList = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 대상을 선택해주세요.!");
		System.out.println("1. 검색안함");
		System.out.println("2. 제목");
		System.out.println("3. 내용");
		System.out.println("4. 작성자");
		System.out.println("5. 제목 + 작성자");
		BoardInfoVO bivo = new BoardInfoVO();
		String cmd = scan.nextLine();
		if("1".equals(cmd)) {
			biList = us.selectBoard(bivo);
		}else {
			System.out.println("검색할 내용을 입력해주세요.");
			String searchStr = scan.nextLine();
			if("2".equals(cmd)) { // 제목에 찾을값
				bivo.setBiTitle(searchStr);
			}else if("3".equals(cmd)) { // 내용에 찾을값
				bivo.setBiContent(searchStr);
			}else if("4".equals(cmd)) { // 작성자 찾을값
				bivo.setUiName(searchStr);
			}
			biList = us.selectBoard(bivo);
		}
		for(BoardInfoVO bi:biList) {
			System.out.println(bi);
		}
	}
}
