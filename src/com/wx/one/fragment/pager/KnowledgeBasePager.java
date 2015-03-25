package com.wx.one.fragment.pager;

import android.content.Context;
import android.view.View;

public abstract class KnowledgeBasePager {
	private View view;
	protected Context mContext;

	public KnowledgeBasePager(Context mContext) {
		super();
		this.mContext = mContext;
		view = initView();
	}

	public abstract View initView();

	public abstract void initData();

	public View getRootView() {
		return view;
	}
}
