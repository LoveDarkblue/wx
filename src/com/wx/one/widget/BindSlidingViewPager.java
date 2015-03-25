package com.wx.one.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author lichangpeng
 * @version 2015-3-25
 * bin sliding ViewPager
 */
public class BindSlidingViewPager extends LazyViewPager {

	public BindSlidingViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public BindSlidingViewPager(Context context) {
		super(context);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		return false;
	}
	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		return false;
	}
}
