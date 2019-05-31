package com.example.mvpproject.contract;


import com.example.mvpproject.base.IBasePresenter;
import com.example.mvpproject.base.IBaseView;
import com.example.mvpproject.bean.Book;

import java.util.List;

public interface MainContract {

    interface MainView extends IBaseView {
        void showResult(List<Book> beans);
    }

    interface MainPresenter extends IBasePresenter<MainView> {
        void loadData();
    }
}
