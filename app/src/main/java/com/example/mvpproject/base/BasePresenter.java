package com.example.mvpproject.base;

public abstract  class BasePresenter<T extends IBaseView> implements IBasePresenter<T> {
    protected T mView;

    @Override
    public void unSubscribe() {
        detachView();

    }

    public void attachView(T view){
        mView = view;
    }

    public void detachView(){
        if(mView != null){
            mView = null;
        }
    }
}
