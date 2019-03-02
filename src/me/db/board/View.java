package me.db.board;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("안녕하세요!");
		System.out.println("DB 접속기 입니다.");
		String choice = "";		
		do {
			System.out.print("ID 를 입력해주세요 : ");
			String login = scan.nextLine();
			if ("osfu".equals(login)) {
				System.out.print("PW 를 입력해주세요 : ");
				String pwd = scan.nextLine();
				if ("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					System.out.println("로그인에 성공하셨습니다.");
					while (!"q".equals(choice)) {
						System.out.println("1. 게시물 생성");
						System.out.println("2. 게시물 조회");
						System.out.println("3. 게시물 수정");
						System.out.println("4. 게시물 삭제");
						System.out.println("q. 종료");
						System.out.print("원하시는 메뉴를 골라주세요 : ");
						choice = scan.nextLine();
						if ("2".equals(choice)) {
							do {
								System.out.println("-- 게시물 조회 --");
								System.out.println("1. 전체 조회");
								System.out.println("2. 개별 조회");
								System.out.print("원하시는 메뉴를 골라주세요 : ");
								choice = scan.nextLine();
								if ("1".equals(choice)) {
									bs.selectBoardAll();
								}
								if ("2".equals(choice)) {
									System.out.print("원하시는 글번호를 입력하세요 : ");
									String selectNum = scan.nextLine();
									bs.selectBoard(selectNum);
								}
							} while (!"1".equals(choice) && !"2".equals(choice));
						}else if ("1".equals(choice)) {
							System.out.println("-- 게시물 생성 --");
							System.out.print("제목을 입력해주세요 : ");
							String inputTitle = scan.nextLine();
							System.out.print("내용을 입력해주세요 : ");
							String inputContent = scan.nextLine();
							bs.insertBoard(inputTitle, inputContent);
							
						}else if ("3".equals(choice)) {
							System.out.println("-- 게시물 수정 --");
							System.out.print("수정할 글번호를 입력해주세요 : ");
							String updateNum = scan.nextLine();
							System.out.print("수정할 제목을 입력해주세요 : ");
							String updateTitle = scan.nextLine();
							System.out.print("수정할 내용을 입력해주세요 : ");
							String updateContent = scan.nextLine();
							bs.updateBoard(updateNum, updateTitle, updateContent);
							
						}else if ("4".equals(choice)) {
							System.out.println("-- 게시물 삭제 --");
							System.out.print("삭제할 글번호를 입력해주세요 : ");
							String deleteNum = scan.nextLine();
							bs.deleteBoard(deleteNum);
						}
					}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else { 
				System.out.println("없는 ID입니다.");
			}
		} while(!"q".equals(choice));
		System.out.println("이용해 주셔서 감사합니다.");		
	}
}
