package db.user2;

import java.util.List;

import db.user.UserInfoVO;

public class Execute {

	public static void main(String[] args) {
		UserService us = new UserService();
		UserInfoVO uivo = new UserInfoVO();
		uivo.setUiId("fire2");
		uivo.setUiName("파이리");
		List<UserInfoVO> uiList = us.selectUser(uivo);
		System.out.println(uiList);
	}
}
