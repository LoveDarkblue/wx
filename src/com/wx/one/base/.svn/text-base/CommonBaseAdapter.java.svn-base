package com.wx.one.base;

import java.util.List;

import com.wx.one.util.Logger;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;

public abstract class CommonBaseAdapter<T> extends BaseAdapter {

    protected Context mContext;

    protected List<T> mList;

    public CommonBaseAdapter(Context context, List<T> lists) {
        super();
        this.mContext = context;
        this.mList = lists;
    }

    public CommonBaseAdapter() {
        super();
    }

    @Override
    public int getCount() {
    	if (mList==null) {
			return 0;
		}
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    
    @SuppressWarnings("unchecked")
    protected final <E extends View> E getViewById(View parent, int id) {
        try {
            return (E) parent.findViewById(id);
        } catch (ClassCastException ex) {
            Logger.e("Could not cast View to concrete class \n"
                    + ex.getMessage());
            throw ex;
        }
    }

}

