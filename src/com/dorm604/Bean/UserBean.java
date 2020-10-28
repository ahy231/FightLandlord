package com.dorm604.Bean;

public class UserBean {

	private String name; //用户名
	private int money; //钱
	
	/**
	 * 	构造方法
	 * @param name 用户名
	 * @param money 用户账户余额
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
