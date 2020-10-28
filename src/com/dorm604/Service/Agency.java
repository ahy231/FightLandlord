package com.dorm604.Service;

import com.dorm604.Bean.UserBean;
import com.dorm604.Enum.Identity;

public interface Agency {
	
	/**
	 * 	获取当前对象所在的Game对象
	 * @return Game对象
	 */
	public Game getGame();
	
	/**
	 * 	获取玩家信息
	 * @return UserBean对象
	 */
	public UserBean getUserBean();
	
	/**
	 * 	获取欢乐豆数量
	 * @return 欢乐豆数量
	 */
	public int getHappybeans();
	
	/**
	 * 	获取代理代表身份
	 * @return Identity
	 */
	public Identity getIdentity();
	
	/**
	 * 	设置代理手中的牌
	 * @param cards 存储卡牌的数组
	 * @param length 数组的长度
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean setCards(int[] cards, int length);
	
	/**
	 * 	设置欢乐豆数量
	 * @param amount 设置欢乐豆数量
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean setHappybeans(int amount);
	
	/**
	 * 	设置代理代表身份
	 * @param identity 身份
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean setIdentity(Identity identity);

	/**
	 * 	出牌
	 * 	Game对象通过getGame()获取，Agency对象通过this获取
	 * @param cards 出的牌，存放在int数组内
	 * @param length 出牌数量，对应int数组长度
	 * @return 返回函数执行状态，true：正常，false：异常
	 */
	public Boolean discard(int cards[], int length);
}
