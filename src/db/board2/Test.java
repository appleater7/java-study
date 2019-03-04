package db.board2;

import java.util.List;

/*
 *  오라클의 컬럼명과, 자바와 변수명을 매핑하는방법
 *  1. 각각의 명명규칙을 무시하고 물리적으로 일치화 시킨다.
 *  2. i-batis의 매핑을 이용한다.
 *  3. 데이터베이스의 별칭을 이용한다.
 *  
 */
public class Test {

	public static void main(String[] args)	 {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selectBoard();
		for (BoardInfoVO bi:biList) {
			System.out.println(bi);
		}
	}
}
