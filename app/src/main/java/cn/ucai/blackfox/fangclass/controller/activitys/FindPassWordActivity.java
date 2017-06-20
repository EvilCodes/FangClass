package cn.ucai.blackfox.fangclass.controller.activitys;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.model.utils.MFGT;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public class FindPassWordActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_password);
        MFGT.goBackBeforeActivity(FindPassWordActivity.this);


    }

}
