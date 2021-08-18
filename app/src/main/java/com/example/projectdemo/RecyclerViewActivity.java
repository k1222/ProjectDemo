package com.example.projectdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.listener.OnUpFetchListener;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.chad.library.adapter.base.module.BaseUpFetchModule;
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
        adapter.addHeaderView(View.inflate(this,R.layout.item_header,null));
        adapter.addFooterView(View.inflate(this,R.layout.item_footder,null));
        adapter.setAnimationEnable(true);
        BaseDraggableModule draggableModule = adapter.getDraggableModule();
        draggableModule.setDragEnabled(true);
        BaseLoadMoreModule loadMoreModule = adapter.getLoadMoreModule();
        loadMoreModule.setEnableLoadMore(true);
        BaseUpFetchModule upFetchModule = adapter.getUpFetchModule();
        upFetchModule.setUpFetchEnable(true);
//        BaseUpFetchModule upFetchModule = adapter.addUpFetchModule(adapter);
//        upFetchModule.setUpFetchEnable(true);
//        upFetchModule.setUpFetching(true);
//        upFetchModule.setOnUpFetchListener(new OnUpFetchListener() {
//            @Override
//            public void onUpFetch() {
//                Log.e("onUpFetch","onUpFetch");
//            }
//        });
//        BaseLoadMoreModule loadMoreModule = adapter.addLoadMoreModule(adapter);
//        loadMoreModule.setEnableLoadMore(true);
//        loadMoreModule.setAutoLoadMore(true);
//        loadMoreModule.setEnableLoadMoreEndClick(true);
//        loadMoreModule.setOnLoadMoreListener(new OnLoadMoreListener() {
//            @Override
//            public void onLoadMore() {
//                Log.e("onLoadMore","onLoadMore");
//            }
//        });
//        BaseDraggableModule draggableModule = adapter.addDraggableModule(adapter);
//        draggableModule.setDragEnabled(true);
//        draggableModule.setOnItemDragListener(new OnItemDragListener() {
//            @Override
//            public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos) {
//                Log.e("onItemDragStart","onItemDragStart "+pos);
//            }
//
//            @Override
//            public void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to) {
//                Log.e("onItemDragMoving","onItemDragMoving "+to);
//            }
//
//            @Override
//            public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos) {
//                Log.e("onItemDragEnd","onItemDragEnd "+pos);
//            }
//        });
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {

            }
        });
        mRecyclerView.setAdapter(adapter);
    }
}