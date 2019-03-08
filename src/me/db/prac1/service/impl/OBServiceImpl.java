package me.db.prac1.service.impl;

import java.util.List;
import java.util.Map;

import me.db.prac1.dao.OBDAO;
import me.db.prac1.dao.impl.OBDAOImpl;
import me.db.prac1.service.OBService;

public class OBServiceImpl implements OBService {

	private OBDAO obd = new OBDAOImpl();
	@Override
	public List<Map<String, String>> selectOBList() {
		return obd.selectOBList();
	}

}
