package me.db.prac1;

import java.util.HashMap;
import java.util.Map;

import me.db.prac1.controller.OBController;

public class Execute {

	public static void main(String[] args) {
		OBController obc = new OBController();
		Map<String, String> req = new HashMap();
		Map<String, Object> res = new HashMap();
		
		req.put("cmd", "oblist");
		obc.doGet(req, res);
		System.out.println(res);

	}
}
