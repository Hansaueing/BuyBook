package com.example.bbook.model;

public interface IStoreModel extends IModel{
	/**
	 *加载编辑推荐的数据
	 */
	void loadRecommendBooks(Callback call);
	/**
	 * 记载热销图书的数据
	 * @param call
	 */
	void loadHotBooks(Callback call);
	void loadNewBooks(Callback call);
}
