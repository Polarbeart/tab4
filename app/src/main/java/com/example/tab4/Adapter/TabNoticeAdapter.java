package com.example.tab4.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tab4.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TabNoticeAdapter extends BaseAdapter {
    private List<Map<String, Object>> notices =new ArrayList<>();
    private LayoutInflater myLi;
    private Context context;
    private List<Map<String, Object>> data;

//    public TabNoticeAdapter(List notices, Context context) {
//        this.notices = notices;
//        this.myLi = LayoutInflater.from(context);
//        this.context = context;
//    }

    public TabNoticeAdapter(Context context,List<Map<String, Object>> data){
        this.context=context;
        this.data=data;
        this.myLi=LayoutInflater.from(context);
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
        public ImageView ivHead;
        public TextView tvHead,tvContent,tvTime;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
//        Map<String, Notice> notice = data.get(position);
        ViewHolder holder =null;
        if(view == null){
            holder =new ViewHolder();
            view =myLi.inflate(R.layout.item_notice,null);
            holder =new ViewHolder();
            holder.ivHead = view.findViewById(R.id.iv_item_notice);
            holder.tvHead = view.findViewById(R.id.tv_item_notice_title);
            holder.tvContent = view.findViewById(R.id.tv_item_notice_content);
            holder.tvTime = view.findViewById(R.id.tv_item_notice_time);
            view.setTag(holder);

        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.tvHead.setText((String)data.get(position).get("title"));  //设置标题名称
//        holder.tvHead.setText(notices.get(position).get);
       // zujian.title.setText((String)data.get(position).get("title"));
        holder.tvContent.setText((String)data.get(position).get("content"));  //设置文章内容
       // holder.tvTime.setText((String)data.get(position).get("title"));  //设置该文章时间
        //holder.ivHead.setImageDrawable();

        //点击item的监听view
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                DialogUIUtils.showToastTie(this, "加载中...").show();
                String TAG ="NoticeAdapter";

                Log.i(TAG, "onClick: 你已点击第"+position+"个消息");


            }
        });

        return view;
    }
}
