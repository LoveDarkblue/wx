package com.wx.one;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioGroup;

import com.wx.one.base.BaseFragment;
import com.wx.one.bean.DataModel;
import com.wx.one.fragment.FindDoctorFragment;
import com.wx.one.fragment.KnowledgeFragment;
import com.wx.one.fragment.MineFragment;
import com.wx.one.fragment.VaccineTabFragment;

public class MainActivity extends FragmentActivity {

	private RadioGroup main_radio;
	private int currentIndex = R.id.rb_vaccinetable;
	public static ArrayList<BaseFragment> mFragmentList;
	private Fragment mFragment = null;
	private int currentFragmentIndex;
	private int oldFragmentIndex;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		findViewById(R.id.layout_content);
		initFragment();
		main_radio = (RadioGroup) findViewById(R.id.main_radio);
		main_radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				int index = 0;
				switch (checkedId) {
				case R.id.rb_vaccinetable:
					index = 0;
					break;
				case R.id.rb_finddoctor:
					index = 1;
					break;
				case R.id.rb_knowledge:
					index = 2;
					break;
				case R.id.rb_my:
					index = 3;
					break;
				}
				Fragment from = getFragment(oldFragmentIndex);
				Fragment to = getFragment(index);
				DataModel.mCurrentFragment = index;
				int type = (index - oldFragmentIndex) > 0 ? 1 : 0;
				switchFragment(from, to, type);
			}
		});
		oldFragmentIndex = -1;
		main_radio.check(currentIndex);
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
	private void switchFragment(Fragment from, Fragment to, int type) {
		if (mFragment == to) {
			return;
		}
		mFragment = to;
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		if (type == 0) {
			fragmentTransaction.setCustomAnimations(R.anim.left_in, R.anim.right_out);
		} else {
			fragmentTransaction.setCustomAnimations(R.anim.right_in, R.anim.left_out);
		}
		if (to.isAdded()) {
			fragmentTransaction.hide(from).show(to).commit();
		} else {
			if (null == from) {
				fragmentTransaction.add(R.id.layout_content, to).commit();
			} else {
				fragmentTransaction.hide(from).add(R.id.layout_content, to).commit();
			}
		}
		oldFragmentIndex = currentFragmentIndex;
	}

	private void initFragment() {
		VaccineTabFragment vaccineTabFragment = new VaccineTabFragment();
		FindDoctorFragment findDoctorFragment = new FindDoctorFragment();
		KnowledgeFragment knowledgeFragment = new KnowledgeFragment();
		MineFragment mineFragment = new MineFragment();
		mFragmentList = new ArrayList<BaseFragment>();
		mFragmentList.add(vaccineTabFragment);
		mFragmentList.add(findDoctorFragment);
		mFragmentList.add(knowledgeFragment);
		mFragmentList.add(mineFragment);
	}

	private Fragment getFragment(int index) {
		Fragment fragment = null;
		switch (index) {
		case 0:
			fragment = mFragmentList.get(0);
			break;
		case 1:
			fragment = mFragmentList.get(1);
			break;
		case 2:
			fragment = mFragmentList.get(2);
			break;
		case 3:
			fragment = mFragmentList.get(3);
			break;
		case 4:
			fragment = mFragmentList.get(4);
			break;

		}
		currentFragmentIndex = index;
		return fragment;
	}
	/*
	 * FragmentStatePagerAdapter fragments = new FragmentStatePagerAdapter(
	 * getSupportFragmentManager()) {
	 * 
	 * @Override public int getCount() { return mFragmentList.size(); }
	 * 
	 * @Override public Fragment getItem(int arg0) { Fragment fragment = null;
	 * switch (arg0) { case 0: fragment = mFragmentList.get(0); break; case 1:
	 * fragment = mFragmentList.get(1); break; case 2: fragment =
	 * mFragmentList.get(2); break; case 3: fragment = mFragmentList.get(3);
	 * break; } return fragment; } };
	 */

	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) {
	 * 
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 */

}
