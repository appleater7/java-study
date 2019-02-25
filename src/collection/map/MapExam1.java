package collection.map;

import java.util.HashMap;

/*
 *  List 는 Index 구조이고, Map 은 Key-Value 구조이다.
 *  Map 중에서 제일많이 사용되는건 HashMap
 *  Map 은 같은 Key 값으로 두개가 있을수 없다.
 * 
 */
public class MapExam1 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("이름", "홍길동1");
		hm.put("이름", "홍길동2");	
		// 같은 Key 로 Put 을 하게되면, Value 가 변경된다.

		System.out.println(hm);
		System.out.println(hm.get("이름"));
	}
}
