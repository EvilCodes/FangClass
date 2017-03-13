package cn.ucai.blackfox.fangclass.model.utils;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import cn.ucai.blackfox.fangclass.application.I;
import cn.ucai.blackfox.fangclass.model.domin.Result;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class OkHttpUtils<T> {


    private static final String TAG = OkHttpUtils.class.getSimpleName();
    URL mUrl;
    OnCompleteListener mListener;
    Context mContext;
    String requestUrl = I.rootUrl;
    Class<T> mClass;
    StringBuffer buffer;


    public OkHttpUtils(Context mContext) {

        this.mContext = mContext;
    }

    /**
     * 定义用于相应网络请求的接口
     */
    interface OnCompleteListener {
        void success(String result);

        void error(String error);
    }

    /**
     * 用于设置网络请求的请求命令
     *
     * @param request
     */
    private OkHttpUtils setRequest(String request) {
        requestUrl += request;
        return this;
    }

    /**
     * 添加网络请求的参数
     * @param params
     * @param values
     * @return
     */
    private OkHttpUtils addParams(String params, String values) {
        if (requestUrl != null) {
            if (requestUrl.contains("?")) {
                requestUrl += "&" + params + "=" + values;

            } else {
                requestUrl += "?" + params + "=" + values;
            }

        } else {
            Log.e(TAG, "没有设置数据请求类型，请先调用setRequest()方法");
        }
        return this;
    }

    private void execute(OnCompleteListener listener) {
        mListener = listener;
        setmUrlRequest();
    }

    private void setmUrlRequest() {
        try {
            Log.e(TAG, requestUrl);
            mUrl = new URL(requestUrl);
            try {
                HttpURLConnection connection = (HttpURLConnection) mUrl.openConnection();
                connection.setDoInput(true);
                connection.setDoOutput(true);

                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    InputStream inputStream = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    buffer = new StringBuffer();
                    String content;
                    if ((content = reader.readLine()) != null) {
                        buffer.append(content);
                    }
                    mListener.success(buffer.toString());
                } else {
                    mListener.error("网络请求错误");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    public T parseObject(String result,Class<T> tClass) {
        mClass = tClass;
        Gson gson = new Gson();
        return  gson.fromJson(result, mClass);
    }


}
