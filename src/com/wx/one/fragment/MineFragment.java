package com.wx.one.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.base.BaseFragment;

/**
 * @author lichangpeng
 * @version 2015-3-25
 * 更多
 */
public class MineFragment extends BaseFragment {
	private String TAG = "MineFragment";
	private View view;
	private ImageView title_back;
	private TextView title_name;
	private TextView title_right_tv;
	private ImageView title_right_iv;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_mine, null);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	protected void initView() {
		title_back = getView(view, R.id.title_back);
		title_name = getView(view, R.id.title_name);
		title_right_tv = getView(view, R.id.title_right_tv);
		title_right_iv = getView(view, R.id.title_right_iv);

		initTitle();
	}

	private void initTitle() {
		title_back.setVisibility(View.GONE);
		title_name.setText(R.string.mine_text10);
		title_right_tv.setVisibility(View.GONE);
		title_right_iv.setVisibility(View.GONE);
	}
}
