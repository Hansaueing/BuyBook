package com.example.bbook.activity;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import com.example.bbook.R;
import com.example.bbook.entity.Data;
import com.example.bbook.httpurl.HttpUrl;
import com.example.bbook.utils.DisplayImg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class BookInfoActivity extends Activity {
	@ViewInject(value = R.id.tv_bookinfo_name)
	private TextView tvName;
	@ViewInject(value = R.id.tv_bookinfo_price)
	private TextView tvPrice;
	@ViewInject(value = R.id.iv_bookinfo_pic)
	private ImageView ivPic;
	@ViewInject(value = R.id.tv_bookinfo_who)
	private TextView tvWriter;
	@ViewInject(value = R.id.tv_bookinfo_whichtype)
	private TextView tvType;
	@ViewInject(value = R.id.tv_bookinfo_whattime)
	private TextView tvPublishTime;
	@ViewInject(value = R.id.tv_bookinfo_which_house)
	private TextView tvPublishHouse;
	@ViewInject(value = R.id.tv_jianjieneirong)
	private TextView tvIntroduceContext;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bookinfo);
		
		x.view().inject(this);
		Intent mintent = getIntent();
		Data data  = (Data) mintent.getSerializableExtra("book");
		Log.i("han", "intent传递的数据="+data);
		
		tvName.setText(data.getProductName());//设置书名
		tvPrice.setText(String.valueOf(data.getDangPrice()));//设置价格
		DisplayImg.imageLoader(ivPic, HttpUrl.BOOKS_PIC+"productImages/"+data.getProduct_pic());//设置图片
		tvWriter.setText(data.getAuthor());//设置作者
		tvType.setText(data.getAuthor_summary());//设置类别
		tvPublishTime.setText(data.getPublishedTime());
		tvPublishHouse.setText(data.getPublishing());
		tvIntroduceContext.setText(data.getCatalogue());
		
	}

}
