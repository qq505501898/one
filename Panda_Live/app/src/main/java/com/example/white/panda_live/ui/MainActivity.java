package com.example.white.panda_live.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioGroup;

import com.example.white.panda_live.R;
import com.example.white.panda_live.adapter.MyAdapter;
import com.example.white.panda_live.base.BaseActivity;
import com.example.white.panda_live.net.NetContract;
import com.example.white.panda_live.net.NetModel;
import com.example.white.panda_live.net.NetPresenter;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {

    private RadioGroup mRadioGroup;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private MyAdapter myAdapter;
    private View view;
    private HomeFragment homeFragment;
    private GunGunLiveFragment gunGunLiveFragment;
    private LiveChinaFragment liveChinaFragment;
    private PandaBoBaoFragment pandaBoBaoFragment;
    private PandaLiveFragment pandaLiveFragment;
    private FragmentManager manager;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initViews() {
        view = View.inflate(this, R.layout.activity_main, null);
        setContentView(view);
        manager = getSupportFragmentManager();
        mRadioGroup = (RadioGroup) findViewById(R.id.RadioGroup);

        homeFragment = new HomeFragment();
        gunGunLiveFragment = new GunGunLiveFragment();
        liveChinaFragment = new LiveChinaFragment();
        pandaBoBaoFragment = new PandaBoBaoFragment();
        pandaLiveFragment = new PandaLiveFragment();

        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                   switch (checkedId){
                       case R.id.BtnA:
                           FragmentTransaction t1 = manager.beginTransaction();
                           t1.replace(R.id.FrameLayoutA,homeFragment);
                           t1.commit();
                           break;
                       case R.id.BtnB:
                           FragmentTransaction t2 = manager.beginTransaction();
                           t2.replace(R.id.FrameLayoutA,pandaLiveFragment);
                           t2.commit();
                           break;
                       case R.id.BtnC:
                           FragmentTransaction t3 = manager.beginTransaction();
                           t3.replace(R.id.FrameLayoutA,gunGunLiveFragment);
                           t3.commit();
                           break;
                       case R.id.BtnD:
                           FragmentTransaction t4 = manager.beginTransaction();
                           t4.replace(R.id.FrameLayoutA,pandaBoBaoFragment);
                           t4.commit();
                           break;
                       case R.id.BtnE:
                           FragmentTransaction t5 = manager.beginTransaction();
                           t5.replace(R.id.FrameLayoutA,liveChinaFragment);
                           t5.commit();
                           break;

                   }
            }
        });


    }

    @Override
    public void show(String ss) {

    }
}
