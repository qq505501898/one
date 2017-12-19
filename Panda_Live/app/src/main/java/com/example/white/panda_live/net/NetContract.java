package com.example.white.panda_live.net;

import com.example.white.panda_live.base.BaseModel;
import com.example.white.panda_live.base.BasePresenter;
import com.example.white.panda_live.base.BaseView;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public interface NetContract {

    interface View extends BaseView {
        void show(String ss);
    }

    interface Model extends BaseModel {
        void getDataNetFrom(String url, Callbacks callbacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        public abstract void getDataModel(String url);
    }
}