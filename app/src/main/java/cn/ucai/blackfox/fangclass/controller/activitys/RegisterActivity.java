package cn.ucai.blackfox.fangclass.controller.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.model.utils.MFGT;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
//    ImageView ivCancle;
    TextView tvPleaseLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setListener();
    }

    private void setListener() {

//        ivCancle.setOnClickListener(this);
        tvPleaseLogin.setOnClickListener(this);
    }

    private void initView() {
        tvPleaseLogin = (TextView) findViewById(R.id.please_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.please_login:
                finish();
                break;
        }

    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        finish();
//    }
}
