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
 * @version 2015-3-26
 * 知识库
 */
public class KnowledgeAdapter extends CommonBaseAdapter<String>{

	private static final String TAG = "KnowledgeAdapter";

	public KnowledgeAdapter(Context context, List<String> lists) {
		super(context, lists);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Logger.i(TAG,"getView:"+mList.get(position));
		ViewHolder mHolder;
		if (convertView==null) {
			convertView = View.inflate(mContext, R.layout.item_knowledge_list, null);
			mHolder = new ViewHolder();
			mHolder.iv_header = getViewById(convertView, R.id.iv_header);
			mHolder.tv_name = getViewById(convertView, R.id.tv_name);
			mHolder.tv_content = getViewById(convertView, R.id.tv_content);
			convertView.setTag(mHolder);
		}else{
			mHolder = (ViewHolder) convertView.getTag();
		}
		return convertView;
	}
	
	class ViewHolder{
		ImageView iv_header;
		TextView tv_name;
		TextView tv_content;
	}
}
