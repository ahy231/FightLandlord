package com.dorm604.Bean;

public class UserBean {

	private String name; //�û���
	private int money; //Ǯ
	
	/**
	 * 	���췽��
	 * @param name �û���
	 * @param money �û��˻����
	 */
	public UserBean(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
}
