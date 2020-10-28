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
	 * 	获取所有当前在线并排在等待队列中的玩家
	 * @return UserBean数组
	 */
	public UserBean[] getInlineUsers();
	
	/**
	 * 	为用户排队
	 * @param user 用户信息
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean inlineUsers(UserBean user);
	
	/**
	 * 	生成一局游戏
	 * 	通过getInlineUsers()获取三个最先排队的玩家
	 * @return 函数执行状态，true：正常，false：异常
	 */
	public Boolean generateGame();
}
