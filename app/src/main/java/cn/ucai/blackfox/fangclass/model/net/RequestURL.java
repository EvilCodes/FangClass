package cn.ucai.blackfox.fangclass.model.net;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;

import cn.ucai.blackfox.fangclass.application.I;
import cn.ucai.blackfox.fangclass.model.domin.Result;
import cn.ucai.blackfox.fangclass.model.utils.OkHttpUtils;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class RequestURL {
    private static final String TAG = RequestURL.class.getSimpleName();
    private static OkHttpUtils<Result> utils;
    public static void requestLogin(Context context,String username,String password,OkHttpUtils.OnCompleteListener<Result> listener ) {
        utils = new OkHttpUtils<>(context);
        try {
            utils.setRequest(I.Request.LOGIN)
                    .addParams(I.Request.USER_NAME, URLEncoder.encode(username,"UTF-8"))
                    .addParams(I.Request.PASS_WORD,URLEncoder.encode(password,"UTF-8"))
                    .setMethod("GET")
                    .targetClass(Result.class)
                    .execute(listener);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }




}
