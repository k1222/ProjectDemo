package com.example.projectdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.projectdemo.adapter.MyAdapter;
import com.example.projectdemo.bean.MyDemoData;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = findViewById(R.id.rv_recycler_view);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //添加Android自带的分割线
        DividerItemDecoration decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        decoration.setDrawable(ContextCompat.getDrawable(this, R.drawable.item_decoration_top));
        mRecyclerView.addItemDecoration(decoration);
        ArrayList<MyDemoData> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MyDemoData data = new MyDemoData();
            data.setText(i+"");
            list.add(data);
        }
        MyAdapter adapter = new MyAdapter(list);
        mRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {

            }
        });
    }
}