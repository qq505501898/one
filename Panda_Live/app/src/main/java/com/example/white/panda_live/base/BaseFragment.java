package com.example.white.panda_live.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.white.panda_live.utils.Utils;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public abstract class BaseFragment<P extends BasePresenter, M extends BaseModel> extends Fragment {
    public P mPresenter;
    public M mModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mPresenter = Utils.getT(this, 0);
        mModel = Utils.getT(this, 1);
        if (this instanceof BaseView) {
            mPresenter.getMV(this, mModel);
        }
        return inflater.inflate(getLayoutId(), null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    protected abstract void initView(View view);

    protected abstract int getLayoutId();
}
