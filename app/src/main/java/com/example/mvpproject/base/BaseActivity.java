package com.example.mvpproject.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements IBaseView {

    protected T mPresenter;

    abstract protected void createPresenter();

    abstract protected void initView();

    abstract protected void loadData();

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attachView();
        initView();
        loadData();
    }
    private void attachView() {
        createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.unSubscribe();
    }


    @Override
    public void showDialog(String msg) {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void showToast(String msg) {

    }

}
