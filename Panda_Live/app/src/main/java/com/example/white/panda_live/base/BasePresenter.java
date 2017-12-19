package com.example.white.panda_live.base;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public class BasePresenter<M, V> {

    public M mModel;
    public V mView;

    public void getMV(M m, V v) {
        mModel = m;
        mView = v;

    }
}
