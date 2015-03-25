package com.wx.one.fragment;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.wx.one.R;
import com.wx.one.adapter.VaccineTableAdapter;
import com.wx.one.base.BaseFragment;

/**
 * @author lichangpeng
 * @version 2015-3-21
 */
@SuppressLint("HandlerLeak")
public class VaccineTabFragment extends BaseFragment {
	private String TAG = "VaccineTabFragment";
	private View view;
	private ProgressBar hori_progressBar;

	private Handler mHandler = new Handler() {
		int i = 1;

		public void handleMessage(android.os.Message msg) {
			hori_progressBar.setProgress(i++);
		};
	};
	private ListView mListView;
	private ArrayList<String> mVoccineList;
	private VaccineTableAdapter mVaccineTableAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.frag_vaccinetable, null);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, this.getClass()+"-onActivityCreated");
	}

	@Override
	protected void initView() {
		hori_progressBar = getView(view, R.id.frag_vaccine_pb);
		mListView = getView(view, R.id.frag_vaccinetable_lv);
	}

	@Override
	protected void initData() {
		mVoccineList = new ArrayList<String>();
		mVoccineList.add("1");
		mVoccineList.add("2");
		mVoccineList.add("3");
		mVoccineList.add("4");
		mVoccineList.add("5");
		if (mVaccineTableAdapter == null) {
			mVaccineTableAdapter = new VaccineTableAdapter(mContext, mVoccineList);
			mListView.setAdapter(mVaccineTableAdapter);
		}else{
			mVaccineTableAdapter.notifyDataSetChanged();
		}

		hori_progressBar = getView(view, R.id.frag_vaccine_pb);
		hori_progressBar.setMax(100);
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					mHandler.sendEmptyMessage(0);
					SystemClock.sleep(200);
				}
			};
		}.start();
	}

}
