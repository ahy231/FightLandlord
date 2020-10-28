package com.dorm604.Controller;

import com.dorm604.Bean.UserBean;
import com.dorm604.Service.Agency;
import com.dorm604.Service.Game;

public interface Controller {

	/**
	 * 	��ȡ��ǰ�������ڽ��еľ�
	 * @return Game��������
	 */
	public Game[] getAllGames();
	
	/**
	 * 	��ȡ���е�ǰ���߲����ڵȴ������е����
	 * @return UserBean����
	 */
	public UserBean[] getInlineUsers();
	
	/**
	 * 	Ϊ�û��Ŷ�
	 * @param user �û���Ϣ
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean inlineUsers(UserBean user);
	
	/**
	 * 	����һ����Ϸ
	 * 	ͨ��getInlineUsers()��ȡ���������Ŷӵ����
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean generateGame();
}
