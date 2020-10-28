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
	 * 	��ȡ��ǰ���߲����ڵȴ������е����
	 * @return UserBean����
	 */
	public UserBean[] getInlineUsers();
	
	/**
	 * 	����һ����Ϸ
	 * 	ͨ��getInlineUsers()��ȡ���������Ŷӵ����
	 * @return ����ִ��״̬
	 */
	public Boolean generateGame();
	
	/**
	 * 	Ϊ�û���������
	 * @param user �û���Ϣ
	 * @param game �û����ڵľ�
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean signAgency(UserBean user, Game game);
	
	/**
	 * 	ͨ��Agency��ȡ�û�������Ϣ�������ݿ���Ϊ�û��������ֶ�
	 * @param agency �û��Ĵ���
	 * @param amount �������ֶ�������
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean exchangeHappybeans(Agency agency, int amount);
	
	/**
	 * 	ͨ��Agency��ȡ�û�������Ϣ�������ݿ���Ϊ�û������˻����
	 * @param agency �û��Ĵ���
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean exchangeMoney(Agency agency);
}
