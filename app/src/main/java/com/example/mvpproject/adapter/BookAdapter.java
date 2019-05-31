package com.example.mvpproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.mvpproject.R;
import com.example.mvpproject.bean.Book;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    List<Book> books;
    Context context;
    LayoutInflater inflater;

    public BookAdapter(Context context, List<Book> books) {
        this.books = books;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //加载布局为一个视图
        View view=inflater.inflate(R.layout.layout_book_item,null);
        Book book=books.get(position);
        //在view视图中查找id为image_photo的控件
        ImageView image_photo= view.findViewById(R.id.image_photo);
        TextView tv_name= view.findViewById(R.id.name);
        TextView tv_age= view.findViewById(R.id.money);
//        image_photo.setImageResource(student.getPhoto());
        tv_name.setText(book.getName());
        tv_age.setText(String.valueOf(book.getMoney()));
        return view;
    }
}
