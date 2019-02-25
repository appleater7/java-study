package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args)	 {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "전라도 광주");
		map.put("직업", "도적");
		
		System.out.println(map);
		System.out.println(map.get("직업"));
		
		// 패턴1. 하지만 잘 사용되지 않음
		Set<String> keys = map.keySet();
		System.out.println(keys.size());
		
		// 패턴2. Iterator 패턴
		
		for (String key:keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
