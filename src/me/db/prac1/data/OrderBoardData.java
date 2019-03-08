package me.db.prac1.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderBoardData {

	public static List<Map<String, String>> OBDataList = new ArrayList<>();
	static {
		Map<String, String> OBData = new HashMap<>();
		OBData.put("발주번호", "0000");
		OBData.put("상품명", "거울");
		OBData.put("발주수량", "2");
		OBData.put("발주일자", "20190306");
		OBData.put("발주시간", "185506");
		OBData.put("발주자이름", "김동근");
		OBDataList.add(OBData);
		
		OBData = new HashMap<>();
		OBData.put("발주번호", "0001");
		OBData.put("상품명", "피카츄");
		OBData.put("발주수량", "5");
		OBData.put("발주일자", "20190006");
		OBData.put("발주시간", "190002");
		OBData.put("발주자이름", "강영준");
		OBDataList.add(OBData);
		
		OBData = new HashMap<>();
		OBData.put("발주번호", "0002");
		OBData.put("상품명", "노트북");
		OBData.put("발주수량", "1");
		OBData.put("발주일자", "20190306");
		OBData.put("발주시간", "190406");
		OBData.put("발주자이름", "심종인");
		OBDataList.add(OBData);
	}
}