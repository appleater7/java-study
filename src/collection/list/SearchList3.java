package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 20) + 1;
			numList.add(num);
		}
		
		System.out.println(", 를 기준으로 6개의 숫자를 입력해주세용♡");
		String inputStr = scan.nextLine();
		String[] str = inputStr.split(",");
		
		int count = 0;
		for (String i:str) {
			if (numList.indexOf(Integer.parseInt(i)) != -1) {
				count++;
			}
		}
		System.out.println(numList);
		System.out.println("맞춘개수 : " + count);
	}
}
