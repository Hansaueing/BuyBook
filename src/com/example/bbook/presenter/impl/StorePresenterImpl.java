package com.example.bbook.presenter.impl;

import java.util.List;

import android.util.Log;

import com.example.bbook.entity.Data;
import com.example.bbook.model.IModel.Callback;
import com.example.bbook.model.IStoreModel;
import com.example.bbook.model.impl.StoreModelImpl;
import com.example.bbook.presenter.IStorePresenter;
import com.example.bbook.view.IBooksView;

public class StorePresenterImpl implements IStorePresenter {

	private IStoreModel model;
	private IBooksView view;

	private List<Data> listData;

	public StorePresenterImpl(IBooksView view) {
		super();
		this.model = new StoreModelImpl();
		this.view = view;
	}

	@Override
	public void loadRecommendBooks() {
		model.loadRecommendBooks(new Callback() {

			@Override
			public void onSuccess(Object obj) {
				listData = (List<Data>) obj;
				//Log.i("han", "Presenter层集合长度" + listData.size());
				view.loadRecommendBook(listData);

			}

			@Override
			public void OnError(Object obj) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void loadNewBooks() {


		model.loadNewBooks(new Callback() {

			@Override
			public void onSuccess(Object obj) {
				listData = (List<Data>) obj;
				//Log.i("han", "Presenter层热销图书集合长度" + listData.size());
				view.loadNewBook(listData);

			}

			@Override
			public void OnError(Object obj) {
				// TODO Auto-generated method stub

			}
		});

	
	
	}

	@Override
	public void loadHotBooks() {

		model.loadHotBooks(new Callback() {

			@Override
			public void onSuccess(Object obj) {
				listData = (List<Data>) obj;
				//Log.i("han", "Presenter层热销图书集合长度" + listData.size());
				view.loadHotBook(listData);

			}

			@Override
			public void OnError(Object obj) {
				// TODO Auto-generated method stub

			}
		});

	
	}

}
