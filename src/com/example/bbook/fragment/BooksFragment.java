package com.example.bbook.fragment;

import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.content.Intent;
import android.hardware.camera2.params.RggbChannelVector;
import android.net.VpnService;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.bbook.R;
import com.example.bbook.activity.BookInfoActivity;
import com.example.bbook.adapter.HotAdapter;
import com.example.bbook.adapter.RecommendAdapter;
import com.example.bbook.entity.Data;
import com.example.bbook.presenter.IStorePresenter;
import com.example.bbook.presenter.impl.StorePresenterImpl;
import com.example.bbook.view.IBooksView;

public class BooksFragment extends Fragment implements IBooksView{

	@ViewInject(value= R.id.gv_books_recommend)
	private GridView gvRecommend;
	@ViewInject(value = R.id.gv_books_hot)
	private GridView gvHot;
	@ViewInject(value = R.id.gv_books_new)
	private GridView gvNew;
	
	private IStorePresenter presenter;
	private List<Data> listData;
	
	private RecommendAdapter recommendAdapter;
	private HotAdapter hotAdapter;
	
	public BooksFragment() {
		super();
		this.presenter = new StorePresenterImpl(this);
	}

	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.books_fragment, null);
		
		x.view().inject(this,view);
		
		presenter.loadRecommendBooks();
		presenter.loadHotBooks();
		presenter.loadNewBooks();
		
		setListener();
		
		return view;
	}

	@Override
	public void loadRecommendBook(List<Data> list) {
		this.listData = list;
		//Log.i("han", "Fragment层的集合"+listData.size());
		recommendAdapter = new RecommendAdapter(getActivity(), listData);
		gvRecommend.setAdapter(recommendAdapter);
	}

	@Override
	public void loadHotBook(List<Data> list) {
		this.listData = list;
		//Log.i("han", "Fragment层热销数据的集合"+listData.size());
		hotAdapter = new HotAdapter(getActivity(), listData);
		gvNew.setAdapter(hotAdapter);
		
	}

	@Override
	public void loadNewBook(List<Data> list) {
		this.listData = list;
		//Log.i("han", "Fragment层热销数据的集合"+listData.size());
		hotAdapter = new HotAdapter(getActivity(), listData);
		gvHot.setAdapter(hotAdapter);
		
	}
	
	
	private void setListener(){
		gvRecommend.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent1 = new Intent(getActivity(),BookInfoActivity.class);
				intent1.putExtra("book", listData.get(position));
				startActivity(intent1);
			}
		});
	}
	
}
