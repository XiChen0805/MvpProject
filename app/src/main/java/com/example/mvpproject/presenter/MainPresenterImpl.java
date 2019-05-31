package com.example.mvpproject.presenter;



import com.example.mvpproject.base.BasePresenter;
import com.example.mvpproject.bean.Book;
import com.example.mvpproject.contract.MainContract;

import java.util.ArrayList;
import java.util.List;

public class MainPresenterImpl   extends BasePresenter<MainContract.MainView> implements MainContract.MainPresenter{
    @Override
    public void loadData() {
        List<Book> listdata = new ArrayList<>();
        Book book;
        book= new Book("111","222");
        listdata.add(book);
        book= new Book("333","444");
        listdata.add(book);
        mView.showResult(listdata);
    }
}
