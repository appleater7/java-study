package me.db.prac1.controller;

import java.util.HashMap;
import java.util.Map;

import me.db.prac1.service.OBService;
import me.db.prac1.service.impl.OBServiceImpl;

public class OBController {
	
	private OBService obs = new OBServiceImpl();

	public void doGet(Map<String, String> req, Map<String, Object> res) {
		String cmd = req.get("cmd");
		if ("oblist".equals(cmd)) {
			res.put("oblist", obs.selectOBList());
		}
		
	}
	
	public void doPost(Map<String, String> req, Map<String, Object> res) {
		
		
	}
}
