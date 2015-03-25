package com.wx.one.fragment;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.adapter.FindDoctorAdapter;
import com.wx.one.base.BaseFragment;
import com.wx.one.util.CommonUtils;
import com.wx.one.widget.xlistview.XListView;
import com.wx.one.widget.xlistview.XListView.IXListViewListener;

/**
 * @author lichangpeng
 * @version 2015-3-25
 * 找医生
 */
@SuppressLint("HandlerLeak")
public class FindDoctorFragment extends BaseFragment implements IXListViewListener, OnItemClickListener {
	private String TAG = "FindDoctorFragment";
	private View view;
	private XListView xListView;
	private ImageView title_back;
	private TextView title_name;
	private TextView title_right_tv;
	private ImageView title_right_iv;
	private ArrayList<String> mDoctorList;
	private FindDoctorAdapter findDoctorAdapter;

	private Handler mHandler = new Handler() {
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_finddoctor, null);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, this.getClass() + "-onActivityCreated");
	}

	@Override
	protected void initView() {
		xListView = getView(view, R.id.frag_find_xlist);
		title_back = getView(view, R.id.title_back);
		title_name = getView(view, R.id.title_name);
		title_right_tv = getView(view, R.id.title_right_tv);
		title_right_iv = getView(view, R.id.title_right_iv);

		xListView.setPullLoadEnable(true);
		xListView.setPullRefreshEnable(true);
		xListView.setXListViewListener(this);
		xListView.setOnItemClickListener(this);
		xListView.setFooterDividersEnabled(false);
		initTitle();
	}

	private void initTitle() {
		title_back.setVisibility(View.GONE);
		title_name.setText(R.string.zhaoyisheng_text1);
		title_right_tv.setVisibility(View.GONE);
		title_right_iv.setImageResource(R.drawable.home2_fangdajing);
	}

	@Override
	protected void initData() {
		mDoctorList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			mDoctorList.add(i+"");
		}
		if (findDoctorAdapter == null) {
			findDoctorAdapter = new FindDoctorAdapter(mContext, mDoctorList);
			xListView.setAdapter(findDoctorAdapter);
		} else {
			findDoctorAdapter.notifyDataSetChanged();
		}
	}

	@Override
	public void onRefresh() {
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				CommonUtils.showT("刷新");
				hasLoad();
			}
		}, 2000);
	}

	@Override
	public void onLoadMore() {
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					mDoctorList.add(i+"");
				}
				findDoctorAdapter.notifyDataSetChanged();
				hasLoad();
			}
		}, 2000);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		CommonUtils.showT("click:" + position);
	}

	private void hasLoad() {
		xListView.stopRefresh();
		xListView.stopLoadMore();
	}
}
