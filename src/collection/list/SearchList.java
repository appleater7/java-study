package collection.list;

import java.util.ArrayList;

public class SearchList {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(10));
		// 인덱스 오브 - 찾을수 없을경우 -1 을 반환한다.
	}
}
