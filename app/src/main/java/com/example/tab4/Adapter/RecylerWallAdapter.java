package com.example.tab4.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tab4.Fragment.frag_Wall;
import com.example.tab4.R;

public class RecylerWallAdapter extends RecyclerView.Adapter<RecylerWallAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private String [] mTitles =null;

    public RecylerWallAdapter(Context context) {
        this.mInflater=LayoutInflater.from(context);
        this.mTitles=new String[20];
        for (int i=0;i<20;i++){
            int index=i+1;
            mTitles[i]="item"+index;
        }
    }

//    public void RecylerWallAdapter(Context context){
//        this.mInflater=LayoutInflater.from(context);
//        this.mTitles=new String[20];
//        for (int i=0;i<20;i++){
//            int index=i+1;
//            mTitles[i]="item"+index;
//        }
//    }

    @NonNull
    /**
     * item显示数据
     * param parent
     * param viewType 用hodler来绑定数据，的确比list view方便一些
     * return
     */
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = mInflater.inflate(R.layout.item_wall,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
        
    }

    /**
     * 这个是数据的绑定显示
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_name.setText(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles.length;
    }


    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_name,tv_content,tv_time;
        public ViewHolder(View view){
            super(view);
            
            tv_name = (TextView)view.findViewById(R.id.tv_wall_name);
        }
    }
}
