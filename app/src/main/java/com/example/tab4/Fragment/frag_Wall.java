package com.example.tab4.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.tab4.Adapter.RecylerWallAdapter;
import com.example.tab4.R;

public class frag_Wall extends Fragment {
    RecyclerView recyclerView_one;
    RecylerWallAdapter mAdapter;
    LinearLayoutManager mLayoutManager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        System.out.println("ExampleFragment--onCreateView");
        View view = inflater.inflate(R.layout.tab_wall, container, false);
//        RecyclerView rl = view.findViewById(R.id.rcl_wall);
        //开始设置RecyclerView
        recyclerView_one= view.findViewById(R.id.rcl_wall);
        //设置固定大小
        recyclerView_one.setHasFixedSize(true);
        //创建线性布局
        mLayoutManager = new LinearLayoutManager(view.getContext());
        //垂直方向
        mLayoutManager.setOrientation(RecyclerView.VERTICAL);
        //设置固定大小
        recyclerView_one.setHasFixedSize(true);
        //给RecyclerView设置布局管理器
        recyclerView_one.setLayoutManager(mLayoutManager);
        //创建适配器，并且设置
        mAdapter = new RecylerWallAdapter(view.getContext());
        recyclerView_one.setAdapter(mAdapter);
//        rl.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        return view;

    }



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //     initLayout();
        System.out.println("oncreate");
    }


}
