package com.wx.one.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.base.CommonBaseAdapter;
import com.wx.one.util.BitmapUtils;
import com.wx.one.util.Logger;

/**
 * @author lichangpeng
 * @version 2015-3-23
 */
public class FindDoctorAdapter extends CommonBaseAdapter<String>{

	private static final String TAG = "FindDoctorAdapter";

	public FindDoctorAdapter(Context context, List<String> lists) {
		super(context, lists);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Logger.i(TAG,"getView:"+mList.get(position));
		ViewHolder mHolder;
		if (convertView==null) {
			convertView = View.inflate(mContext, R.layout.item_frag_finddoctor, null);
			mHolder = new ViewHolder();
			mHolder.item_frag_finddoctor_iv_header = getViewById(convertView, R.id.item_frag_finddoctor_iv_header);
			mHolder.item_frag_finddoctor_tv_bbys = getViewById(convertView, R.id.item_frag_finddoctor_tv_bbys);
			mHolder.item_frag_finddoctor_tv_ys = getViewById(convertView, R.id.item_frag_finddoctor_tv_ys);
			mHolder.item_frag_finddoctor_tv_hospital = getViewById(convertView, R.id.item_frag_finddoctor_tv_hospital);
			convertView.setTag(mHolder);
		}else{
			mHolder = (ViewHolder) convertView.getTag();
		}
		
		mHolder.item_frag_finddoctor_tv_bbys.setText("宝宝"+mList.get(position)+"的医生");
		Bitmap roundBitmap = BitmapUtils.toRoundBitmap(BitmapFactory.decodeResource(mContext.getResources(),R.drawable.a));
		mHolder.item_frag_finddoctor_iv_header.setImageBitmap(roundBitmap);
		return convertView;
	}
	
	class ViewHolder{
		ImageView item_frag_finddoctor_iv_header;
		TextView item_frag_finddoctor_tv_bbys;
		TextView item_frag_finddoctor_tv_ys;
		TextView item_frag_finddoctor_tv_hospital;
	}
}
