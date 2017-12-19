package com.example.white.panda_live.net;

/**
 * Created by TMVPHelper on 2017/12/18
 */
public class NetPresenter extends NetContract.Presenter {


    @Override
    public void getDataModel(String url) {
        mModel.getDataNetFrom(url, new Callbacks() {
            @Override
            public void show(String data) {
                mView.show(data);
            }
        });
    }
}