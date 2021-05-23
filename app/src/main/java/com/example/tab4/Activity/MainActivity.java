package com.example.tab4.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.tab4.Adapter.MyAdapter;
import com.example.tab4.Fragment.frag_Notice;
import com.example.tab4.Fragment.frag_Second;
import com.example.tab4.Fragment.frag_Wall;
import com.example.tab4.R;
import com.example.tab4.View.ViewConfessionWall;
import com.example.tab4.View.ViewSchoolNotice;
import com.example.tab4.View.ViewSecondHnadTradding;
import com.example.tab4.transfer.ZoomOutPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewPager vpContent;
    private ViewSchoolNotice viewSchoolNotice;
    private ViewSecondHnadTradding secondHnadTradding;
    private ViewConfessionWall viewConfessionWall;

    private List<Fragment> list;
    private MyAdapter myAdapter;
    private String[] titles = {"校园官方", "闲置交易", "告白墙"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化
        vpContent = (ViewPager) findViewById(R.id.view_pager);
        initView();
//        vpContent.setPageTransformer(true,);
        vpContent.setPageTransformer(true,new ZoomOutPageTransformer());
        myAdapter=new MyAdapter(getSupportFragmentManager(),list,titles);
        vpContent.setAdapter(myAdapter);

    }

    private void initView() {
       ;
        // 页面，数据源
        list = new ArrayList<>();
        list.add(new frag_Notice());//校园通告
        list.add(new frag_Second());//二手交易
        list.add(new frag_Wall());//告白墙
        //ViewPager的适配器


        //getView();
    }

    @Override
    public void onClick(View v) {

    }
}