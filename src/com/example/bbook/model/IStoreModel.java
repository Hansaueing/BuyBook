package com.example.bbook.model;

public interface IStoreModel extends IModel{
	/**
	 *���ر༭�Ƽ�������
	 */
	void loadRecommendBooks(Callback call);
	/**
	 * ��������ͼ�������
	 * @param call
	 */
	void loadHotBooks(Callback call);
	void loadNewBooks(Callback call);
}
