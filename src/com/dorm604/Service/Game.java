package com.dorm604.Service;

import com.dorm604.Bean.UserBean;

public interface Game {

	/**
	 * ��ȡ���������Ϣ
	 * 
	 * @return UserBean����
	 */
	public UserBean[] getAllUsers();

	/**
	 * ��ȡ���д���
	 * 
	 * @return Agency����
	 */
	public Agency[] getAllAgencies();
	
	/**
	 * 	��ȡ��ǰ�ԾֵĲ�������¸��
	 * @return Judge����
	 */
	public Judge getJudge();

	/**
	 * ��ȡ�ϴεĳ��ƣ����û�г��ƣ�����null
	 * 
	 * @return �ϴεĳ��������ʾ
	 */
	public int[] getLastCards();

	/**
	 * 	������
	 * @return ���غ���״̬��true��������false���쳣
	 */
	public Boolean seizingLandlord();

	/**
	 * һ����Ϸ����
	 * 
	 * @param game
	 * @return
	 */
	public Boolean GameProcess(Game game);
}

interface CardPool {

	
	/**
	 * 	��ʼ������
	 */
	public void prepare();

	/**
	 * 	ϴ��
	 */
	public void disrupt();
	 
}
