package com.wx.one.util;


import android.widget.Toast;

import com.wx.one.base.MyApplication;

/**
 * Created by aisl on 2015/2/3.
 */
public class CommonUtils {

    /**
     * show Toast
     *
     * @param msg msg
     * @param tag 0:LENGTH_SHORT
     *            1:LENGTH_LONG
     */
    public static void showT(String msg, int tag) {
        if (tag == 0) {
            Toast.makeText(MyApplication.getContext(), msg, Toast.LENGTH_SHORT).show();
        } else if (tag == 1) {
            Toast.makeText(MyApplication.getContext(), msg, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * show Toast (default short)
     * @param msg msg
     */
    public static void showT(String msg) {
        Toast.makeText(MyApplication.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
