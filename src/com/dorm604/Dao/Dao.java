package com.dorm604.Dao;

import com.dorm604.Bean.UserBean;

public interface Dao {

	/**
	 * 	获取用户信息
	 * @param name 用户名
	 * @return 用户信息
	 */
	public UserBean getUserBean(String name);
	
	/**
	 * 	为用户交换欢乐豆
	 * @param user 用户信息
	 * @param amount 豆子数量
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean exchangeHappybeans(UserBean user, int amount);
	
	/**
	 * 	为用户交换账户余额
	 * @param user 用户信息
	 * @param amount 豆子数量
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean exchangeMoney(UserBean user, int amount);
}
