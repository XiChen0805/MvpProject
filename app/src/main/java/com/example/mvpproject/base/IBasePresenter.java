package com.example.mvpproject.base;

public interface IBasePresenter<T extends IBaseView> {

    void attachView(T view);
    void detachView();
    void unSubscribe();
}
