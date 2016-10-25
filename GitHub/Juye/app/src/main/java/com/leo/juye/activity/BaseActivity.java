package com.leo.juye.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo on 2016/10/25.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getLayoutId() != null) setContentView(getLayoutId());
        initView();
        initData();

    }

    protected Integer getLayoutId(){
        return null;
    };

    protected void initView(){

    }

    protected void initData(){

    }

}
