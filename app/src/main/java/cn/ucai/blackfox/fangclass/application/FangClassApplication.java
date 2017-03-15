package cn.ucai.blackfox.fangclass.application;

import android.app.Application;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class FangClassApplication extends Application {
    private static FangClassApplication instance;
    private FangClassApplication() {

    }
    public static FangClassApplication getInstance() {
        if (instance == null) {
            synchronized (FangClassApplication.class) {
                if (instance == null) {

                    instance = new FangClassApplication();
                }

            }
        }
        return instance;

    }





}
