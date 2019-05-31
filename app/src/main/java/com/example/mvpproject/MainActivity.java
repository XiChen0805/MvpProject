package com.example.mvpproject;

import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

import com.example.mvpproject.adapter.BookAdapter;
import com.example.mvpproject.base.BaseActivity;
import com.example.mvpproject.bean.Book;
import com.example.mvpproject.contract.MainContract;
import com.example.mvpproject.presenter.MainPresenterImpl;

import java.util.List;


public class MainActivity  extends BaseActivity<MainPresenterImpl> implements MainContract.MainView{

    ListView listView;

    Handler myHandler = new MyHandler();


    class  MyHandler extends Handler{

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:

                    break;
            }
        }
    }


    @Override
    protected void createPresenter() {
        mPresenter = new MainPresenterImpl();
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.mlist);

        new Thread(){
            @Override
            public void run() {
                Message msg = Message.obtain();
                msg.what = 1;
                msg.obj = "dididi";
                myHandler.sendMessage(msg);


            }
        };

        new Thread(){
            @Override
            public void run() {
                myHandler.post(new Runnable() {
                    @Override
                    public void run() {

                    }
                });
            }
        };

    }


    @Override
    protected void loadData() {
        mPresenter.loadData();
    }


    @Override
    public void showResult(List<Book> list) {
        BookAdapter adapter = new BookAdapter(this,list);
        listView.setAdapter(adapter);
    }
}
