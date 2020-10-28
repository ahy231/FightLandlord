package com.dorm604.Controller;

import com.dorm604.Bean.UserBean;
import com.dorm604.Service.Agency;
import com.dorm604.Service.Game;

public interface Controller {

	/**
	 * 	获取当前所有正在进行的局
	 * @return Game对象数组
	 */
	public Game[] getAllGames();
	
	/**
	 * 	获取当前在线并排在等待队列中的玩家
	 * @return UserBean数组
	 */
	public UserBean[] getInlineUsers();
	
	/**
	 * 	生成一局游戏
	 * 	通过getInlineUsers()获取三个最先排队的玩家
	 * @return 函数执行状态
	 */
	public Boolean generateGame();
	
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
}
