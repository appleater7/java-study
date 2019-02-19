package exam.ex02;

import java.util.Scanner;

public class StringArray {

	public String[] strs;

	public StringArray() {
		strs = new String[5];
	}

	public static void main(String[] args) {
		StringArray sa = new StringArray();
		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		Scanner scan = new Scanner(System.in); // 시스템의 변수, 기울기가 있으면 스태틱
		String input = scan.nextLine();
		System.out.println(input);
		sa.strs = input.split(",");
		System.out.println("검색할 단어를 입력하세요!");
		String search = scan.nextLine();
		int searchCount = 0;
		for (int i = 0; i < sa.strs.length; i++) {
			if (sa.strs[i].equals(search)) {
				System.out.println("sa.strs[" + i + "] = " + sa.strs[i]);
				searchCount++;
			}
			
		}
		if (searchCount == 0) {
			System.out.println("찾으시는 값이 없습니다.");
		}
		
//		for (int i = 0; i < sa.strs.length; i++) {
//			System.out.println("sa.strs[" + i + "] = " + sa.strs[i]);
//		}
//		for (int i = sa.strs.length - 1; i >= 0; i--) {
//			System.out.println("sa.strs[" + i + "] = " + sa.strs[i]);
//		}
		scan.close();
	}
}