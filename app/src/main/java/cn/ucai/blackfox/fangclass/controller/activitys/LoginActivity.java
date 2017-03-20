package cn.ucai.blackfox.fangclass.controller.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import cn.ucai.blackfox.fangclass.R;
import cn.ucai.blackfox.fangclass.application.FangClassApplication;
import cn.ucai.blackfox.fangclass.application.I;
import cn.ucai.blackfox.fangclass.model.dao.UserDao;
import cn.ucai.blackfox.fangclass.model.domin.Result;
import cn.ucai.blackfox.fangclass.model.domin.User;
import cn.ucai.blackfox.fangclass.model.net.RequestURL;
import cn.ucai.blackfox.fangclass.model.utils.MFGT;
import cn.ucai.blackfox.fangclass.model.utils.OkHttpUtils;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = LoginActivity.class.getSimpleName();
    EditText etUsername, etPassWord;
    Button btnLogin;
    TextView tvRegister, findPassword;
    ImageView ivWxLogin;
    String password, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setListener();
    }

    private void initData() {
        password = etPassWord.getText().toString();
        username = etUsername.getText().toString();
        Log.e(TAG, "initData.password=" + password);
        Log.e(TAG, "initData.username=" + username);
    }

    private void setListener() {
        tvRegister.setOnClickListener(this);
        findPassword.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    private void initView() {
        tvRegister = (TextView) findViewById(R.id.tv_register);
        findPassword = (TextView) findViewById(R.id.tv_find_password);
        etUsername = (EditText) findViewById(R.id.et_username);
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
                Log.e(TAG, "onClick=" + "btn_login");
                initData();
                if (username != null && password != null) {
                    RequestURL.requestLogin(this, username, password, new OkHttpUtils.OnCompleteListener<Result>() {
                        @Override
                        public void success(Result result) {
                            Log.e(TAG, "result=" + result);
                            if (result != null && result.isRetMsg()) {
                                User user = OkHttpUtils.parseTargetObject(result.getRetData().toString(), User.class);
                                Log.e(TAG, "user=" + user);
                                UserDao userDao = UserDao.getInstance();
                                userDao.saveUser(user);
                                FangClassApplication.getInstance().setUser(user);
                                MFGT.jumptoMainActivity(LoginActivity.this);
                                finish();
                            }
                        }
                        @Override
                        public void error(String error) {
                            Log.e(TAG, "error=" + error);
                        }
                    });
                }
                break;
            case R.id.tv_find_password:
                MFGT.jumptoFindPassWordActiviy(this);
                break;
            case R.id.iv_wxlogin:

                break;
        }
    }



}