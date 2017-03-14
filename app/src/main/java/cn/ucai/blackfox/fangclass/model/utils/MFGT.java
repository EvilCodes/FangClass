package cn.ucai.blackfox.fangclass.model.utils;

import android.app.Activity;
import android.content.Intent;

import cn.ucai.blackfox.fangclass.controller.activitys.LoginActivity;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public class MFGT {
    public static void jumptoLoginActivity(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));
    }

}
