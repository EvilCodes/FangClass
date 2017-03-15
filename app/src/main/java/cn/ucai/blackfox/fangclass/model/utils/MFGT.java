package cn.ucai.blackfox.fangclass.model.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.controller.activitys.FindPassWordActivity;
import cn.ucai.blackfox.fangclass.controller.activitys.LoginActivity;
import cn.ucai.blackfox.fangclass.controller.activitys.RegisterActivity;

/**
 * Created by Administrator on 2017/3/14 0014.
 */

public class MFGT {
    public static void jumptoLoginActivity(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));
    }

    public static void jumptoRegisterActivity(Activity activity) {
        activity.startActivity(new Intent(activity, RegisterActivity.class));
    }

    public static void jumptoFindPassWordActiviy(Activity activity) {
        activity.startActivity(new Intent(activity, FindPassWordActivity.class));
    }
    public static void goBackBeforeActivity(final Activity activity) {
        (activity.findViewById(R.id.iv_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.finish();
            }
        });

    }
}
