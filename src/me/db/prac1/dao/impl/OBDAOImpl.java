package me.db.prac1.dao.impl;

import java.util.List;
import java.util.Map;

import me.db.prac1.dao.OBDAO;
import me.db.prac1.data.OrderBoardData;

public class OBDAOImpl implements OBDAO {

	
	@Override
	public List<Map<String, String>> selectOBList() {

		return OrderBoardData.OBDataList;
	}

}
