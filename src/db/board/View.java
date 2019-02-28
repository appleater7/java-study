package db.board;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {		
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("★☆★☆★☆★☆★환영합니다☆★☆★☆★☆★☆");
			System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
			System.out.println("아래에서 아이디를 입력해주세요. \\(^_^ )/");
	
	
			// id.equals("osfu") 는 NullPointException 이발생할수있어서 
			// "osfu".equals(id) 로 순서를 바꾸어서 사용한다.!!!!!!!
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			if("osfu".equals(id)) {
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				if("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					System.out.println("반갑습니다. osfu님");
					while(!"q".equals(cmd)) {
						System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆");
						System.out.println("☆1.게시물 등록 ★");
						System.out.println("★2.게시물 삭제 ☆");
						System.out.println("☆3.게시물 조회 ★");
						System.out.println("★4.게시물 수정 ☆");
						System.out.println("☆q.종료        ★");
						System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆");
						System.out.print("번호 : ");
						cmd = scan.nextLine();
						if ("3".equals(cmd)) {
							bs.selectBoard();
						}else if("1".equals(cmd)) {
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title, content);
						}else if("2".equals(cmd)) {
							System.out.print("삭제할 글번호 : ");
							int deNum = scan.nextInt(); 
							bs.deleteBoard(deNum);
						}else if("4".equals(cmd)) {
							System.out.print("수정할 글번호 : ");
							String inNum = scan.nextLine();
							System.out.print("수정할 제목 : ");
							String inTitle = scan.nextLine(); 
							System.out.print("수정할 내용 : ");
							String inContent = scan.nextLine(); 
							bs.updateBoard(inNum, inTitle, inContent);
						}
					}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}				
			}else {
				System.out.println("없는 아이디 입니다.");
			}
		} while(!"q".equals(cmd));
		System.out.println("아듀! 유저!");
	}
}