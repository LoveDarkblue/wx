package com.wx.one.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wx.one.R;
import com.wx.one.base.CommonBaseAdapter;
import com.wx.one.util.Logger;

/**
 * @author lichangpeng
 * @version 2015-3-23
 */
public class VaccineTableAdapter extends CommonBaseAdapter<String>{

	private static final String TAG = "VaccineTableAdapter";

	public VaccineTableAdapter(Context context, List<String> lists) {
		super(context, lists);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Logger.i(TAG,"getView:"+mList.get(position));
		ViewHolder mHolder;
		if (convertView==null) {
			convertView = View.inflate(mContext, R.layout.item_frag_vaccinetable_list, null);
			mHolder = new ViewHolder();
			mHolder.frag_item_vaccine_name = getViewById(convertView, R.id.frag_item_vaccine_name);
			mHolder.frag_item_vaccine_jiliang = getViewById(convertView, R.id.frag_item_vaccine_jiliang);
			mHolder.frag_item_vaccine_bbnum = getViewById(convertView, R.id.frag_item_vaccine_bbnum);
			mHolder.frag_item_vaccine_arrow = getViewById(convertView, R.id.frag_item_vaccine_arrow);
			convertView.setTag(mHolder);
		}else{
			mHolder = (ViewHolder) convertView.getTag();
		}
		
		mHolder.frag_item_vaccine_name.setText("A+C群流脑多糖疫苗"+mList.get(position));
		return convertView;
	}
	
	class ViewHolder{
		TextView frag_item_vaccine_name;
		TextView frag_item_vaccine_jiliang;
		ImageView frag_item_vaccine_arrow;
		TextView frag_item_vaccine_bbnum;
	}
}
