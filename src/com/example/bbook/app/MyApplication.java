package com.example.bbook.app;

import org.xutils.x;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.app.Application;

public class MyApplication extends Application{
	
	private static RequestQueue queue;
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		x.Ext.init(this);
		queue = Volley.newRequestQueue(getApplicationContext());
	}


	public static RequestQueue getQueue() {
		return queue;
	}

	
}
