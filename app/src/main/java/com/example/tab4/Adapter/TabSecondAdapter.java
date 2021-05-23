package com.example.tab4.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tab4.R;
import com.example.tab4.bean.Product;

import java.util.List;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class TabSecondAdapter extends BaseAdapter {
    private List<Product> products;
    private List<Map<String, Object>> data;
    private LayoutInflater myLi;
    private Context context;

    public TabSecondAdapter(Context context,List<Map<String, Object>> data){
        this.context = context;
        this.data =data;
        this.myLi = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public static class ViewHolder{
        private  ImageView ivHead;
        private TextView source,content,time;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
//        Map<String, Notice> notice = data.get(position);
        TabSecondAdapter.ViewHolder holder =null;
        if(view == null){
            holder =new TabSecondAdapter.ViewHolder();
            view =myLi.inflate(R.layout.item_second,null);
            holder =new TabSecondAdapter.ViewHolder();
            holder.ivHead = view.findViewById(R.id.second_image);
            holder.source = view.findViewById(R.id.second_text_source);
            holder.time = view .findViewById(R.id.second_text_time);
            holder.content = view.findViewById(R.id.sencond_text_title);
//            holder.tvHead = view.findViewById(R.id.tv_item_notice_title);
//            holder.tvContent = view.findViewById(R.id.tv_item_notice_content);
//            holder.tvTime = view.findViewById(R.id.tv_item_notice_time);
            view.setTag(holder);

        }else{
            holder = (TabSecondAdapter.ViewHolder) view.getTag();
        }
        holder.content.setText((String)data.get(position).get("content"));  //设置标题名称
        holder.source.setText((String)data.get(position).get("source"));  //设置文章内容
        holder.time.setText((String)data.get(position).get("time"));      //设置该文章时间

        //点击item的监听view
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                DialogUIUtils.showToastTie(this, "加载中...").show();
                String TAG ="NoticeAdapter";

                Log.i(TAG, "onClick: 你已点击二手交易第"+position+"个消息");


            }
        });

        return view;
    }


}
