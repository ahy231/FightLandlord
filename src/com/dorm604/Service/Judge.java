package com.dorm604.Service;

public interface Judge {
	
	/**
	 * 	获取当前对象所在的Game对象
	 * @return Game对象
	 */
	public Game getGame();
	
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
