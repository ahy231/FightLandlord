package com.dorm604.Dao;

import com.dorm604.Bean.UserBean;

public interface Dao {

	/**
	 * 	��ȡ�û���Ϣ
	 * @param name �û���
	 * @return �û���Ϣ
	 */
	public UserBean getUserBean(String name);
	
	/**
	 * 	Ϊ�û��������ֶ�
	 * @param user �û���Ϣ
	 * @param amount ��������
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean exchangeHappybeans(UserBean user, int amount);
	
	/**
	 * 	Ϊ�û������˻����
	 * @param user �û���Ϣ
	 * @param amount ��������
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean exchangeMoney(UserBean user, int amount);
}
