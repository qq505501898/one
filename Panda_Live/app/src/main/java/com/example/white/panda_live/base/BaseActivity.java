package com.example.white.panda_live.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.white.panda_live.R;
import com.example.white.panda_live.utils.Utils;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends AppCompatActivity {
    public P mPresenter;
    public M mModel;
    private TextView Title;
    private FrameLayout mFrameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(getLayoutId());
        super.setContentView(R.layout.titlebar);
        initView();
        mPresenter = Utils.getT(this, 0);
        mModel = Utils.getT(this, 1);
        if (this instanceof BaseView) {
            mPresenter.getMV(mModel, this);
        }
        initViews();
    }

    protected abstract void initViews();

    protected abstract int getLayoutId();

    private void initView() {
        mFrameLayout = (FrameLayout) findViewById(R.id.FrameLayout);
    }

    public void initBar(String text) {
        Title.setText(text);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {

    }

    @Override
    public void setContentView(View view) {
        mFrameLayout.removeAllViews();
        mFrameLayout.addView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }
}
