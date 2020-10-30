package com.dorm604.Service;

import com.dorm604.Bean.UserBean;

public interface Judge {
	
	/**
	 * 	��ȡ��ǰ�������ڵ�Game����
	 * @return Game����
	 */
	public Game getGame();
	
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
	
	/**
	 * 	����ǰ�ȷ���
	 * @return ����ִ��״̬��true��������false���쳣
	 */
	public Boolean discard();

	/**
	 * 	�жϳ����Ƿ�Ϸ�
	 * 	lastCards[]ͨ��getGame().getLastCards()��ȡ
	 * @param thisCards ��γ�����
	 * @return �Ϸ��жϺͺ���ִ��״̬, 1���Ϸ���0�����Ϸ���-1������
	 */
	public int judgement(int thisCards[]);
}
