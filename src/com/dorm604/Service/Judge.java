package com.dorm604.Service;

public interface Judge {
	
	/**
	 * 	��ȡ��ǰ�������ڵ�Game����
	 * @return Game����
	 */
	public Game getGame();
	
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
