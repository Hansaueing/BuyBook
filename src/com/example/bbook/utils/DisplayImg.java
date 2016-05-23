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
			//��������
			LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(20);
			@Override
			public void putBitmap(String arg0, Bitmap arg1) {
				// ���뻺��
				lruCache.put(url, arg1);
			}
			
			@Override
			public Bitmap getBitmap(String arg0) {
				// �ӻ����л�ȡ
				return lruCache.get(url);
			}
		};
		ImageLoader imageLoader = new ImageLoader(queue, imageCache);
		//loader���ض���
		String requestUrl = url;		//ͼƬ��ַ
		ImageListener imageListener = imageLoader.getImageListener(iv, R.drawable.ic_launcher, R.drawable.ic_launcher);	//����Ĭ��ͼƬ
		int maxWidth = 120;	//����������
		int maxHeight = 170;	//��������߶�
		imageLoader.get(requestUrl, imageListener, maxWidth, maxHeight);
	}
}
