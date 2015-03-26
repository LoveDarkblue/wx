package com.wx.one.fragment.pager;

import java.util.ArrayList;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.adapter.KnowledgeAdapter;
import com.wx.one.util.CommonUtils;
import com.wx.one.widget.xlistview.XListView;
import com.wx.one.widget.xlistview.XListView.IXListViewListener;

public class KnowledgeListPager extends KnowledgeBasePager implements IXListViewListener, OnItemClickListener {

	private XListView mXLisView;
	private TextView textView;
	private KnowledgeAdapter mKnowledgeAdapter;

	public KnowledgeListPager(Context mContext) {
		super(mContext);
	}

	private Handler mHandler = new Handler() {
	};

	@Override
	public View initView() {
		View view = View.inflate(mContext, R.layout.view_knowinner_listview, null);
		mXLisView = CommonUtils.getView(view, R.id.frag_know_xlist);
		mXLisView.setPullLoadEnable(true);
		mXLisView.setPullRefreshEnable(false);
		mXLisView.setXListViewListener(this);
		mXLisView.setOnItemClickListener(this);
		initData();
		return view;
	}

	public void setTitle(String str) {
		// textView.setText(str);
	}

	@Override
	public void initData() {
		ArrayList<String> mKnowledgeList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			mKnowledgeList.add(i + "");
		}
		if (mKnowledgeAdapter == null) {
			mKnowledgeAdapter = new KnowledgeAdapter(mContext, mKnowledgeList);
			mXLisView.setAdapter(mKnowledgeAdapter);
		} else {
			mKnowledgeAdapter.notifyDataSetChanged();
		}
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		CommonUtils.showT("click:" + position);
	}

	@Override
	public void onRefresh() {

	}

	@Override
	public void onLoadMore() {
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				CommonUtils.showT("加载更多");
				hasLoad();
			}
		}, 1000);
	}
	
	private void hasLoad() {
		mXLisView.stopRefresh();
		mXLisView.stopLoadMore();
	}
}
