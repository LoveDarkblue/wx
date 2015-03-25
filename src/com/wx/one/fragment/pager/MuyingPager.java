package com.wx.one.fragment.pager;

import java.util.ArrayList;

import com.viewpagerindicator.TabPageIndicator;
import com.wx.one.R;
import com.wx.one.fragment.pager.VaccinePager.VaccinePagerAdapter;
import com.wx.one.util.CommonUtils;
import com.wx.one.widget.xlistview.XListView;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * @author lichangpeng
 * @version 2015-3-25
 * 母婴
 */
public class MuyingPager extends KnowledgeBasePager {

	private XListView mKnowList;
	private TabPageIndicator mTabPageIndicator;
	private ViewPager mVaccinePager;
	private ArrayList<KnowledgeBasePager> mKnowledgeBasePagerList;
	private MuyingPagerAdapter vaccinePagerAdapter;

	public MuyingPager(Context mContext) {
		super(mContext);
	}

	@Override
	public View initView() {
		View view = View.inflate(mContext, R.layout.view_knowledge_pager, null);
		mTabPageIndicator = CommonUtils.getView(view, R.id.frag_knowledge_Indicator);
		mVaccinePager = CommonUtils.getView(view, R.id.frag_knowledge_vpinner);
		initData();
		return view;
	}

	@Override
	public void initData() {
		String[] titles = new String[] { "新生儿", "0-1岁", "1-3岁", "3-6岁" };
		mKnowledgeBasePagerList = new ArrayList<KnowledgeBasePager>();
		for (int i = 0; i < titles.length; i++) {
			mKnowledgeBasePagerList.add(new KnowledgeListPager(mContext));
		}
		vaccinePagerAdapter = new MuyingPagerAdapter(titles, mKnowledgeBasePagerList);
		mVaccinePager.setAdapter(vaccinePagerAdapter);
		mTabPageIndicator.setViewPager(mVaccinePager);
		mTabPageIndicator.setCurrentItem(0);
	}
	
	class MuyingPagerAdapter extends PagerAdapter {
		private ArrayList<KnowledgeBasePager> mList;
		private String[] mTitles;

		public MuyingPagerAdapter(String[] titles, ArrayList<KnowledgeBasePager> mKnowledgeBasePagerList) {
			this.mList = mKnowledgeBasePagerList;
			this.mTitles = titles;
		}

		@Override
		public int getCount() {
			return mTitles.length;
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
			return mTitles[position];
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(mList.get(position).getRootView(), 0);
			((KnowledgeListPager)mList.get(position)).setTitle("母婴"+mTitles[position]);
			return mList.get(position).getRootView();
		}

	}
}