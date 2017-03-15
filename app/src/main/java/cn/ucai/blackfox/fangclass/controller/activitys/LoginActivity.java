package cn.ucai.blackfox.fangclass.controller.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.model.utils.MFGT;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etTel, etPassWord;
    Button btnLogin;
    TextView tvRegister, findPassword;
    ImageView ivWxLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setListener();
    }
    private void setListener() {
        tvRegister.setOnClickListener(this);
        findPassword.setOnClickListener(this);
    }

    private void initView() {
        tvRegister = (TextView) findViewById(R.id.tv_register);
        findPassword = (TextView) findViewById(R.id.tv_find_password);
        etTel = (EditText) findViewById(R.id.et_tel);
        etPassWord = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        ivWxLogin = (ImageView) findViewById(R.id.iv_wxlogin);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_register:
                MFGT.jumptoRegisterActivity(this);
                break;
            case R.id.btn_login:

                break;
            case R.id.tv_find_password:
                MFGT.jumptoFindPassWordActiviy(this);
                break;
            case R.id.iv_wxlogin:

                break;
        }
    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        finish();
//    }
}