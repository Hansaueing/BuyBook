package com.example.bbook.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bbook.R;
import com.example.bbook.entity.Data;
import com.example.bbook.httpurl.HttpUrl;
import com.example.bbook.utils.DisplayImg;


public class HotAdapter extends MyBaseAdapter<Data>{

	public HotAdapter(Context context, List<Data> data) {
		super(context, data);
		
	}

	private class ViewHolder{
		ImageView ivPic;
		TextView tvName;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Data data = getData().get(position);
		ViewHolder holder;
		if(convertView==null){
			convertView = getInflater().inflate(R.layout.item_book, null);
			holder = new ViewHolder();
			holder.ivPic = (ImageView) convertView.findViewById(R.id.iv_item_bookpic);
			holder.tvName = (TextView) convertView.findViewById(R.id.tv_item_bookname);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		DisplayImg.imageLoader(holder.ivPic, HttpUrl.BOOKS_PIC+"productImages/"+data.getProduct_pic());
		//x.image().bind(holder.ivPic, HttpUrl.BOOKS_PIC + "productImages/" + data.getProduct_pic());
		
		holder.tvName.setText(data.getProductName());
		return convertView;
	}
	
}
