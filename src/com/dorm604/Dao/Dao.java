package com.dorm604.Dao;

import com.dorm604.Bean.UserBean;

public interface Dao {

	/**
	 * 	��ȡ�û���Ϣ
	 * @param name �û���
	 * @return �û���Ϣ
	 */
	UserBean getUserBean(String name);
}
