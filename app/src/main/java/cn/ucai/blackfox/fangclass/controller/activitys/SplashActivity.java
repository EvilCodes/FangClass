package cn.ucai.blackfox.fangclass.controller.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.application.FangClassApplication;
import cn.ucai.blackfox.fangclass.model.utils.MFGT;

public class SplashActivity extends AppCompatActivity {
    Timer timer;
    MyTask myTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        timer = new Timer();
        myTask = new MyTask();

    }

    @Override
    protected void onResume() {
        super.onResume();
        timer.schedule(myTask, 10000);
    }

    class MyTask extends TimerTask {

        @Override
        public void run() {
            if (FangClassApplication.getInstance().getUser() != null) {
                MFGT.jumptoMainActivity(SplashActivity.this);
             return;
            }
            MFGT.jumptoLoginActivity(SplashActivity.this);
//            添加跳转动画
//            overridePendingTransition();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
