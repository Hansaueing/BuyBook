package com.example.bbook.model;

public interface IModel {
	public interface Callback{
		void onSuccess(Object obj);
		void OnError(Object obj);
	}
}
