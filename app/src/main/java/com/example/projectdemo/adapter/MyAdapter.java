package com.example.projectdemo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.DraggableModule;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.module.UpFetchModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.projectdemo.R;
import com.example.projectdemo.bean.MyDemoData;

import java.util.List;

/**
 * @author K
 * @Package: com.example.projectdemo.adapter
 * @ClassName:
 * @description:
 * @date :2021/8/8 9:59 下午
 */
public class MyAdapter extends BaseQuickAdapter<MyDemoData, BaseViewHolder> implements UpFetchModule, LoadMoreModule, DraggableModule {
    public MyAdapter(List<MyDemoData> data) {
        super(R.layout.item_recyler_view, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, MyDemoData data) {
        baseViewHolder.setText(R.id.tv_item_text,data.getText());
    }
}
