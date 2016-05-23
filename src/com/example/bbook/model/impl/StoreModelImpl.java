package com.example.bbook.model.impl;

import java.util.List;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.bbook.app.MyApplication;
import com.example.bbook.entity.Data;
import com.example.bbook.entity.Root;
import com.example.bbook.httpurl.HttpUrl;
import com.example.bbook.model.IStoreModel;
import com.google.gson.Gson;

public class StoreModelImpl implements IStoreModel{

	private List<Data> lists;
	@Override
	public void loadRecommendBooks(final Callback call) {
		final StringRequest request = new StringRequest(Request.Method.GET, HttpUrl.EDITOR_RECOMMEND, new  Response.Listener<String>() {

			@Override
			public void onResponse(String response) {
				//ͨ��call�ص������������ݳ�ȥ, �õ�json����
				//Log.i("han", "json����="+response);
				Gson gson = new Gson();
				Root root = gson.fromJson(response, Root.class);
				lists = root.getData();
				//Log.i("han", "�Ƽ�ͼ���б���="+lists.size());
				call.onSuccess(lists);
				
			}
		},new  Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				Log.i("han", "volley�������ݴ���");
			}
		} );
		
		MyApplication.getQueue().add(request);
		
	}

	/**
	 * ����ͼ������
	 */
	@Override
	public void loadHotBooks(final Callback call) {
		// TODO Auto-generated method stub
		final StringRequest request = new StringRequest(Request.Method.GET, HttpUrl.HOT_BOOKS, new  Response.Listener<String>() {

			@Override
			public void onResponse(String response) {
				//ͨ��call�ص������������ݳ�ȥ, �õ�json����
				//Log.i("han", "json����="+response);
				Gson gson = new Gson();
				Root root = gson.fromJson(response, Root.class);
				lists = root.getData();
				//Log.i("han", "����ͼ���б���="+lists.size());
				call.onSuccess(lists);
				
			}
		},new  Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				Log.i("han", "volley�������ݴ���");
			}
		} );
		
		MyApplication.getQueue().add(request);
		
		
	}

	@Override
	public void loadNewBooks(final Callback call) {

		// TODO Auto-generated method stub
		final StringRequest request = new StringRequest(Request.Method.GET, HttpUrl.HOT_BOOKS, new  Response.Listener<String>() {

			@Override
			public void onResponse(String response) {
				//ͨ��call�ص������������ݳ�ȥ, �õ�json����
				Log.i("han", "json����="+response);
				Gson gson = new Gson();
				Root root = gson.fromJson(response, Root.class);
				lists = root.getData();
				Log.i("han", "����ͼ���б���="+lists.size());
				call.onSuccess(lists);
				
			}
		},new  Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				Log.i("han", "volley�������ݴ���");
			}
		} );
		
		MyApplication.getQueue().add(request);
		
		
	
		
	}

	
}
