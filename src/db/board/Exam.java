package db.board;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이를 입력해주세요");
		int bornYear = 2019 - Integer.parseInt(scan.nextLine()) + 1;
		System.out.println("당신은 " + bornYear + "생 입니다.");
		
	}
}
