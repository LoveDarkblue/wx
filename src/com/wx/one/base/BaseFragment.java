package com.wx.one.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.wx.one.MainActivity;
import com.wx.one.util.Logger;

public class BaseFragment extends Fragment {
    protected MainActivity mContext;

    public BaseFragment() {

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = (MainActivity) getActivity();
        initView();
        initData();
    }

    protected void initView(){};
    protected void initData(){};
    
    @SuppressWarnings("unchecked")
    protected final <E extends View> E getView(View parent, int id) {
        try {
            return (E) parent.findViewById(id);
        } catch (ClassCastException ex) {
            Logger.e("Could not cast View to concrete class \n"
                    + ex.getMessage());
            throw ex;
        }
    }
}
