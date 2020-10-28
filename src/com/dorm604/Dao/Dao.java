package com.dorm604.Dao;

import com.dorm604.Bean.UserBean;

public interface Dao {

	/**
	 * 	获取用户信息
	 * @param name 用户名
	 * @return 用户信息
	 */
	UserBean getUserBean(String name);
}
