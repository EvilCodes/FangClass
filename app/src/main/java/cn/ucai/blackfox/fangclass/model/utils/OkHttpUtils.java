package cn.ucai.blackfox.fangclass.model.utils;

import android.content.Context;
import android.provider.MediaStore;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import cn.ucai.blackfox.fangclass.application.I;
import cn.ucai.blackfox.fangclass.model.domin.Result;
import cn.ucai.blackfox.fangclass.model.domin.User;

/**
 * Created by BlackFox on 2017/3/8 0008.
 *
 */

public class OkHttpUtils<T> {

    private static final String TAG = OkHttpUtils.class.getSimpleName();
    private URL mUrl;
    private OnCompleteListener mListener;
    private String requestUrl = I.rootUrl;
    private Class<T> mClass;
    private StringBuffer buffer;
    private String requestMethod;
    private Context mContext;

    public OkHttpUtils(Context context) {
        mContext = context;
    }

    /**
     * 定义用于相应网络请求的接口
     */
    public interface OnCompleteListener<T> {
        void success(T result);

        void error(String error);
    }

    /**
     * 用于设置网络请求的请求命令
     *
     * @param request
     */
    public OkHttpUtils setRequest(String request) {
        requestUrl += request;
        return this;
    }

    /**
     * 添加网络请求的参数
     *
     * @param params
     * @param values
     * @return
     */
    public OkHttpUtils addParams(String params, String values) {
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

    public OkHttpUtils setMethod(String method) {
        this.requestMethod = method;
        return this;

    }

    public void execute(OnCompleteListener listener) {
        mListener = listener;
        setUrlRequest();
    }

    /**
     * 执行网络请求
     * 要点：
     * 1.网络请求的线程问题
     * 2.HttpUrlconnection的链接前配置问题
     * 3.BufferedReader的使用即.readLine()
     */
    private void setUrlRequest() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Log.e(TAG, "requestUrl=" + requestUrl);
                    mUrl = new URL(requestUrl);
                    try {
                        Log.e(TAG, requestUrl);
                        HttpURLConnection connection = (HttpURLConnection) mUrl.openConnection();
                        connection.setConnectTimeout(5000);
                        connection.setReadTimeout(5000);
                        connection.setDoInput(true);
//                connection.setDoOutput(true);
//                if (requestMethod.equals("POST")) {
//                    connection.setUseCaches(false);
//                    connection.setRequestMethod(requestMethod);
//                    connection.connect();
//                    OutputStream outputStream = connection.getOutputStream();
//                } else {
                        connection.setUseCaches(true);
                        connection.setRequestMethod(requestMethod);
                        // 设置请求中的媒体类型信息
                        connection.setRequestProperty("Content-Type", "application/json");
                        // 设置客户端与服务连接类型
                        connection.addRequestProperty("Connection", "Keep-Alive");
                        // 开始连接
                        connection.connect();
                        int responseCode = connection.getResponseCode();
                        Log.e(TAG, "responseCode=" + responseCode);
                        if (responseCode == HttpURLConnection.HTTP_OK) {
                            InputStream inputStream = connection.getInputStream();
                            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                            buffer = new StringBuffer();
                            String content;
                            if ((content = reader.readLine()) != null) {
                                buffer.append(content);
                            }
                            Log.e(TAG, "buffer=" + buffer.toString());
                            mListener.success(parseObject(buffer.toString()));
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
        }).start();
    }

    public OkHttpUtils targetClass(Class<T> mClass) {
        this.mClass = mClass;
        return this;
    }

    public T parseObject(String result) {
        Gson gson = new Gson();
        return gson.fromJson(result, mClass);
    }

    /**
     *要点问题：
     * 1.泛型方法的优势
     * 2.有关静态方法和静态属性的关系
     * 3.有关同步锁中对象锁以及类对象锁的问题（静态方法与非静态方法）
     * 4.有关类对象的相关问题
     * @param result
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T parseTargetObject(String result, Class<T> tClass) {
        Gson gson = new Gson();
        T t = gson.fromJson(result, tClass);
        return t;
    }


}
