package com.example.white.panda_live.net;

import com.example.white.panda_live.app.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by TMVPHelper on 2017/12/18
 */
public class NetModel implements NetContract.Model {
    private static NetModel netModel;

    private OkHttpClient okHttpClient;

    public NetModel() {
        okHttpClient = new OkHttpClient();
    }

    public static NetModel getInstance() {
        synchronized (NetModel.class) {
            netModel = new NetModel();
        }

        return netModel;
    }

    @Override
    public void getDataNetFrom(String url, final Callbacks callbacks) {
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String string = response.body().string();

                App.mBaseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callbacks.show(string);
                    }
                });
            }
        });
    }
}