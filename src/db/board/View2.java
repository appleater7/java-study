package db.board;

import java.util.Scanner;

public class View2 {

	public static void main(String[] args) {
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★환영합니다☆★☆★☆★☆★☆");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("아래에서 아이디를 입력해주세요. \\(^_^ )/");
		Scanner scan = new Scanner(System.in);

		// id.equals("osfu") 는 NullPointException 이발생할수있어서 
		// "osfu".equals(id) 로 순서를 바꾸어서 사용한다.!!!!!!!
		boolean memoryLogin = true;
		while(memoryLogin) {	
			System.out.println("아이디 : ");
			String id = scan.nextLine();
			if("osfu".equals(id)) {
				System.out.println("비밀번호 : ");
				String pwd = scan.nextLine();
				if("12345678".equals(pwd)) {
					memoryLogin = false;
					System.out.println("반갑습니다. osfu님");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
			}else {
				System.out.println("없는 아이디 입니다.");
			}
	}	}
}
