package cn.ucai.blackfox.fangclass.application;

import android.app.Application;

import cn.ucai.blackfox.fangclass.model.domin.User;

/**
 * Created by Administrator on 2017/3/13 0013.
 */

public class FangClassApplication extends Application {
    private static FangClassApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance =this;
    }

    /**
     * 有关全局变量的创建需要注意以下几个点：
     * 1.onCreate()的覆写问题。
     * 2.单例模式的特殊应用
     * 3.在项目清单中进行相关的注册声明
     *
     * @return
     */

    public static FangClassApplication getInstance() {
//        if (instance == null) {
//            synchronized (FangClassApplication.class) {
//                if (instance == null) {
//                    instance = new FangClassApplication();
//                }
//            }
//        }
        return instance;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
