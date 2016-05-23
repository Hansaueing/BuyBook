package com.example.bbook.utils;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.example.bbook.R;
import com.example.bbook.app.MyApplication;

public class DisplayImg {
	public static void imageLoader(ImageView iv,final String url){
		RequestQueue queue = MyApplication.getQueue();
		ImageCache imageCache = new ImageCache() {
			//创建缓存
			LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(20);
			@Override
			public void putBitmap(String arg0, Bitmap arg1) {
				// 存入缓存
				lruCache.put(url, arg1);
			}
			
			@Override
			public Bitmap getBitmap(String arg0) {
				// 从缓存中获取
				return lruCache.get(url);
			}
		};
		ImageLoader imageLoader = new ImageLoader(queue, imageCache);
		//loader加载对象
		String requestUrl = url;		//图片地址
		ImageListener imageListener = imageLoader.getImageListener(iv, R.drawable.ic_launcher, R.drawable.ic_launcher);	//处理默认图片
		int maxWidth = 120;	//需求的最大宽度
		int maxHeight = 170;	//需求的最大高度
		imageLoader.get(requestUrl, imageListener, maxWidth, maxHeight);
	}
}
