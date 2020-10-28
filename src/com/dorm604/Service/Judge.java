package com.dorm604.Service;

import com.dorm604.Bean.UserBean;

public interface Judge {
	
	/**
	 * 	获取当前对象所在的Game对象
	 * @return Game对象
	 */
	public Game getGame();
	
	/**
	 * 	为用户任命代理
	 * @param user 用户信息
	 * @param game 用户所在的局
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean signAgency(UserBean user, Game game);
	
	/**
	 * 	通过Agency获取用户本局信息，在数据库中为用户交换欢乐豆
	 * @param agency 用户的代理
	 * @param amount 交换欢乐豆的数量
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean exchangeHappybeans(Agency agency, int amount);
	
	/**
	 * 	通过Agency获取用户本局信息，在数据库中为用户交换账户余额
	 * @param agency 用户的代理
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean exchangeMoney(Agency agency);
	
	/**
	 * 	开局前先发牌
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean discard();

	/**
	 * 	判断出牌是否合法
	 * 	lastCards[]通过getGame().getLastCards()获取
	 * @param thisCards 这次出的牌
	 * @return 合法判断和函数执行状态, 1：合法，0：不合法，-1：错误
	 */
	public int judgement(int thisCards[]);
}
