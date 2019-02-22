package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 5; i++) {
			int ranNum = (int)(Math.random() * 20 ) + 1;
			numList.add(ranNum);
		}

		System.out.println("맞출 번호를 , 구분으로 입력하세요!");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for (int i = 0; i < strNums.length; i++) {
			int num = Integer.parseInt(strNums[i]);
			anList.add(num);
		}

//		for (int i = 0; i < anList.size(); i++) {
//			for(int j = 0; j < numList.size(); j++) {
//				if (numList.get(i) == anList.get(j)) {
//					count++;
//				}
//			}
//		}
		
		for (int i = 0; i < anList.size(); i++) {
			int anNum = anList.get(i);
			if (numList.indexOf(anNum) != -1) {
				count++;
			}
		}
		
		System.out.println("numList : " + numList);
		System.out.println("anList : " + anList);
		System.out.println("맞은갯수 : " + count);
		
		
//		for (int i = 0; i < 5; i++) {
//			int ranNum = (int)(Math.random() * 20) + 1;
//			System.out.println(numList.indexOf(ranNum));
//			if (numList.indexOf(ranNum) != -1) {
//				count++;
//			}
//		}
//		System.out.println("맞은개수 : " + count);
	}
}
