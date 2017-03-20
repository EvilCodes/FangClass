package cn.ucai.blackfox.fangclass.model.utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/3/20 0020.
 */

public class MyLogCat {

    public static boolean isDebuged;

    public static boolean isDebuged() {
        return isDebuged;
    }

    public static void setIsDebuged(boolean isDebuged) {
        MyLogCat.isDebuged = isDebuged;
    }

    public static void e(String TAG,String args) {
        if (isDebuged) {
            Log.e(TAG, args);


        } else {
            return;
        }

    }

}
