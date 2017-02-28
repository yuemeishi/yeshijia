package com.xl.yueshijia.yueshijia.Zhuanti.util;


import android.app.Activity;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyUtil  {

    public interface  OnLoadJson{
        public  void  getjsondata(String getdata);
    }
    static  OnLoadJson loadJson;

    public static void  downloaddata(final Activity activity, final OnLoadJson onLoadJson){
        loadJson=onLoadJson;
        OkHttpClient okHttpClient= new OkHttpClient();
        Request request=new Request.Builder().url(MyContent.http_json).build();
        Call call=okHttpClient.newCall(request);
        call.enqueue(new Callback() {

            public void onFailure(Call call, IOException e) {

            }

            public void onResponse(Call call, Response response) throws IOException {
                final  String json= response.body().string();
                activity.runOnUiThread(new Runnable() {

                    public void run() {
                        onLoadJson.getjsondata(json);
                    }
                });
            }
        });
    }
}
