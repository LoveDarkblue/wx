package com.wx.one.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.wx.one.base.MyApplication;

public class SPUtils {

	public static String SP_NAME = "config";
	private static SharedPreferences sp;
	private static Context mContext = MyApplication.getContext();

	public static void saveBoolean(String key, boolean value) {
		if (sp == null)
			sp = mContext.getSharedPreferences(SP_NAME, 0);
		sp.edit().putBoolean(key, value).commit();
	}

	public static boolean getBoolean(String key,boolean defValue){
		if(sp == null) {
			sp = mContext.getSharedPreferences(SP_NAME, 0);
		}
		return sp.getBoolean(key, defValue);
	}
	
	public static void saveString(String key, String value) {
		if (sp == null)
			sp = mContext.getSharedPreferences(SP_NAME, 0);
		sp.edit().putString(key, value).commit();
	}
	
	public static String getString(String key,String defValue){
		if(sp == null) {
			sp = mContext.getSharedPreferences(SP_NAME, 0);
		}
		return sp.getString(key, defValue);
	}

	public static String getString(String key){
		if(sp == null) {
			sp = mContext.getSharedPreferences(SP_NAME, 0);
		}
		return sp.getString(key, "");
	}
	
	
}
