package com.dorm604.Service;

import com.dorm604.Bean.UserBean;
import com.dorm604.Enum.Identity;

public interface Agency {
	
	/**
	 * 	��ȡ��ǰ�������ڵ�Game����
	 * @return Game����
	 */
	public Game getGame();
	
	/**
	 * 	��ȡ�����Ϣ
	 * @return UserBean����
	 */
	public UserBean getUserBean();
	
	/**
	 * 	��ȡ���ֶ�����
	 * @return ���ֶ�����
	 */
	public int getHappybeans();
	
	/**
	 * 	��ȡ����������
	 * @return Identity
	 */
	public Identity getIdentity();
	
	/**
	 * 	���ô������е���
	 * @param cards �洢���Ƶ�����
	 * @param length ����ĳ���
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean setCards(int[] cards, int length);
	
	/**
	 * 	���û��ֶ�����
	 * @param amount ���û��ֶ�����
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean setHappybeans(int amount);
	
	/**
	 * 	���ô���������
	 * @param identity ���
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean setIdentity(Identity identity);

	/**
	 * 	����
	 * 	Game����ͨ��getGame()��ȡ��Agency����ͨ��this��ȡ
	 * @param cards �����ƣ������int������
	 * @param length ������������Ӧint���鳤��
	 * @return ���غ���ִ��״̬��true��������false���쳣
	 */
	public Boolean discard(int cards[], int length);
}
