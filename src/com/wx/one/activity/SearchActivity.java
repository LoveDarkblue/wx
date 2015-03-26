package com.wx.one.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.wx.one.R;

@SuppressLint("HandlerLeak")
public class SearchActivity extends Activity {
	private Handler mHandler = new Handler() {
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_search);
		mHandler.postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent intent = new Intent();
				intent.putExtra("name", "result");
				setResult(100, intent);
				finish();
			}
		}, 2000);

	}
}
