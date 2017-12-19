package com.example.white.panda_live.ui;

import android.view.View;

import com.example.white.panda_live.R;
import com.example.white.panda_live.base.BaseFragment;
import com.example.white.panda_live.net.NetContract;
import com.example.white.panda_live.net.NetModel;
import com.example.white.panda_live.net.NetPresenter;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public class LiveChinaFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    @Override
    protected void initView(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_livechina;
    }

    @Override
    public void show(String ss) {

    }
}
