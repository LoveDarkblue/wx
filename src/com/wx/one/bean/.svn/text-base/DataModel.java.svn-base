package com.wx.one.bean;

/**
 * @author lichangpeng
 * @version 2015-3-21
 */
public class DataModel {
    private DataModel(){};
    private static DataModel mInstance;
    public static int mCurrentFragment;

    public static DataModel getInstance() {
        if (mInstance == null) {
            synchronized (DataModel.class) {
                if (mInstance == null) {
                    mInstance = new DataModel();
                }
            }
        }
        return mInstance;
    }
}
