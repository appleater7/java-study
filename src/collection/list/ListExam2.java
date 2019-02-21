package collection.list;

import java.util.ArrayList;

public class ListExam2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
//		for (int i = 1; i <= 10; i++) {
//			numList.add(i);
//		}
//		
//		for (int i = 0; i < numList.get(i); i++) {
//			System.out.println("numList[" + i + "] = " + numList.get(i));
//		}
		
		ArrayList<Integer> numList2 = new ArrayList<>();
		int setNum = 100;
		for (int i = 0; i < setNum; i++) {
			if (i % 10 == 0) {
				numList2.add(setNum - i);
			}
		}
		
		for (int i = 0; i < numList2.size(); i++) {
			System.out.println(numList2.get(i));
		}
	}
}
