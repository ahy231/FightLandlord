package com.dorm604.Service;

import com.dorm604.Bean.UserBean;

public interface Game {

	/**
	 * 	获取所有玩家信息
	 * @return UserBean数组
	 */
	public UserBean[] getAllUsers();

	/**
	 * 	获取所有代理
	 * @return Agency数组
	 */
	public Agency[] getAllAgencies();
	
	/**
	 * 	获取当前对局的裁判来贿赂他
	 * @return Judge对象
	 */
	public Judge getJudge();

	/**
	 * 	抢地主
	 * @return 返回函数状态，true：正常，false：异常
	 */
	public Boolean seizingLandlord();

	/**
	 * 	一局游戏过程
	 * @param game
	 * @return
	 */
	public Boolean GameProcess(Game game);
}

interface CardPool {

	
	/**
	 * 	初始化卡池
	 */
	public void prepare();

	/**
	 * 	洗牌
	 */
	public void disrupt();
	
	/**
	 * 	获取地主牌
	 * @return int数组
	 */
	public int[] getLandlordCards();
	
	/**
	 * 	获取对应id玩家剩余手牌
	 * @return int数组
	 */
	public int[] getAgencyCards(int id);
	
	/**
	 * 	获取上次的出牌，如果没有出牌，返回null
	 * @return 上次的出牌数组表示
	 */
	public int[] getLastCards();
	 
}
