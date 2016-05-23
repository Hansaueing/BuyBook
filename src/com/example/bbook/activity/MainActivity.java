package com.example.bbook.activity;

import java.util.ArrayList;
import java.util.List;

import org.xutils.x;
import org.xutils.view.annotation.ViewInject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.bbook.R;
import com.example.bbook.fragment.BooksFragment;
import com.example.bbook.fragment.CartFragment;
import com.example.bbook.fragment.PresenalInfoFragment;

public class MainActivity extends FragmentActivity {

	@ViewInject(value = R.id.vp)
	private ViewPager vp;
	@ViewInject(value = R.id.rg_pager_select)
	private RadioGroup rgPagerSelect;
	@ViewInject(value = R.id.rb_shucheng)
	private RadioButton rbBooks;
	@ViewInject(value = R.id.rb_cart)
	private RadioButton rbCart;
	@ViewInject(value = R.id.rb_wode)
	private RadioButton rbWode;

	private List<Fragment> listFragments;
	private BooksFragment booksFragment;
	private CartFragment cartFragment;
	private PresenalInfoFragment presenalInfoFragment;

	private MyViewPagerAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		x.view().inject(this);

		init();

		setAdapter();

		setListener();

	}

	private void init() {
		listFragments = new ArrayList<Fragment>();
		booksFragment = new BooksFragment();
		cartFragment = new CartFragment();
		presenalInfoFragment = new PresenalInfoFragment();
		listFragments.add(booksFragment);
		listFragments.add(cartFragment);
		listFragments.add(presenalInfoFragment);

	}

	private void setAdapter() {
		adapter = new MyViewPagerAdapter(getSupportFragmentManager());
		vp.setAdapter(adapter);

	}

	private class MyViewPagerAdapter extends FragmentPagerAdapter {

		public MyViewPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int arg0) {
			return listFragments.get(arg0);
		}

		@Override
		public int getCount() {
			return listFragments.size();
		}

	}

	private void setListener() {
		rgPagerSelect.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.rb_shucheng:
					vp.setCurrentItem(0);
					break;

				case R.id.rb_cart:
					vp.setCurrentItem(1);
					break;
					
				case R.id.rb_wode:
					vp.setCurrentItem(2);
					break;
				}
			}
		});
		
		vp.addOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				switch (arg0) {
				case 0:
					rbBooks.setChecked(true);
					break;
				case 1:
					rbCart.setChecked(true);
					break;
				case 2:
					rbWode.setChecked(true);
					break;
				}
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
			}
		});
	}

}
