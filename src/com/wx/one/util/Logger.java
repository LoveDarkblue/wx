package com.wx.one.util;


import android.util.Log;

/**
 * Log工具类
 */
public class Logger {
    private static final String LOG_TAG = "WX";
    /**
     * 测试时开启
     */
    private static final boolean IS_LOG = true;

    /**
     * LOG ERROR
     *
     * @param msg error content
     */
    public static void e(String msg) {
        if (IS_LOG) {
            Log.e(LOG_TAG, msg + "");
        }
    }

    /**
     * LOG EXCEPTION ERROR
     *
     * @param e error content
     */
    public static void e(Throwable e) {
        if (IS_LOG) {
            Log.e(LOG_TAG, Log.getStackTraceString(e));
        }
    }

    /**
     * LOG INFO
     *
     * @param msg info content
     */
    public static void i(String msg) {
        if (IS_LOG) {
            Log.i(LOG_TAG, msg + "");
        }
    }

    /**
     * LOG DEBUG
     *
     * @param msg debug content
     */
    public static void d(String msg) {
        if (IS_LOG) {
            Log.d(LOG_TAG, msg + "");
        }
    }

    /**
     * LOG I with TAG
     *
     * @param tag TAG
     * @param msg MSG
     */
    public static void i(String tag, String msg) {
        if (IS_LOG) {
            Log.i(tag, msg + "");
        }
    }

    /**
     * log e with TAG
     *
     * @param tag TAG
     * @param msg MSG
     */
    public static void e(String tag, String msg) {
        if (IS_LOG) {
            Log.e(tag, msg + "");
        }
    }
}