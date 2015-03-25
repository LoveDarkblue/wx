package com.wx.one.fragment.pager;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.util.CommonUtils;
import com.wx.one.widget.xlistview.XListView;

public class KnowledgeListPager extends KnowledgeBasePager {

	private XListView mXlisView;
	private TextView textView;

	public KnowledgeListPager(Context mContext) {
		super(mContext);
	}

	@Override
	public View initView() {
		View view = View.inflate(mContext, R.layout.view_knowinner_listview, null);
		mXlisView = CommonUtils.getView(view, R.id.frag_know_xlist);
		textView = new TextView(mContext);
		textView.setText("hahaha");
		textView.setTextSize(25);
		textView.setTextColor(mContext.getResources().getColor(R.color.title_bar_color));
		return textView;
	}
	
	public void setTitle(String str){
		textView.setText(str);
	}

	@Override
	public void initData() {
		
	}

}
