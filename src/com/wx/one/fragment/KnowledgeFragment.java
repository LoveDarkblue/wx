package com.wx.one.fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.viewpagerindicator.TabPageIndicator;
import com.wx.one.R;
import com.wx.one.base.BaseFragment;
import com.wx.one.bean.DataModel;
import com.wx.one.fragment.pager.KnowledgeBasePager;
import com.wx.one.fragment.pager.MuyingPager;
import com.wx.one.fragment.pager.VaccinePager;
import com.wx.one.widget.BindSlidingViewPager;

/**
 * @author lichangpeng
 * @version 2015-3-25
 * 知识库
 */
public class KnowledgeFragment extends BaseFragment {
	private String TAG = "KnowledgeFragment";
	private View view;

	private BindSlidingViewPager mBindSlidingViewPager;
	private ArrayList<KnowledgeBasePager> mKnowledgePagerList;
	private RadioGroup mRadioGroup;
	private KnowLedgePager mKnowLedgePager;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_knowledge, null);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

	@Override
	protected void initView() {
		mBindSlidingViewPager = getView(view, R.id.frag_knowledge_vp);
		mRadioGroup = getView(view, R.id.frag_knowledge_radio);
		mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				int index = 0;
				switch (checkedId) {
				case R.id.rb_vaccine:
					index = 0;
					break;
				case R.id.rb_muying:
					index = 1;
					break;
				}
				mBindSlidingViewPager.setCurrentItem(index);
			}
		});
	}

	@Override
	protected void initData() {
		mKnowledgePagerList = new ArrayList<KnowledgeBasePager>();
		mKnowledgePagerList.add(new VaccinePager(mContext));
		mKnowledgePagerList.add(new MuyingPager(mContext));
		mKnowLedgePager = new KnowLedgePager(mKnowledgePagerList);
		mBindSlidingViewPager.setAdapter(mKnowLedgePager);
		mBindSlidingViewPager.setCurrentItem(0);
	}

	class KnowLedgePager extends PagerAdapter {
		String[] titles = new String[] { "1", "2" };
		private ArrayList<KnowledgeBasePager> mList;

		public KnowLedgePager(ArrayList<KnowledgeBasePager> mKnowledgePagerList) {
			this.mList = mKnowledgePagerList;
		}

		@Override
		public int getCount() {
			return titles.length;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView(mList.get(position).getRootView());
		}

		@Override
		public CharSequence getPageTitle(int position) {
			return titles[position];
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(mList.get(position).getRootView(), 0);
			return mList.get(position).getRootView();
		}

	}
}
