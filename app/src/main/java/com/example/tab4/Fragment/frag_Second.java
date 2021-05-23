package com.example.tab4.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.tab4.Adapter.TabNoticeAdapter;
import com.example.tab4.Adapter.TabSecondAdapter;
import com.example.tab4.R;
import com.example.tab4.bean.Product;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frag_Second extends Fragment  {

    private static final String TAG = "";
    List<Product> productList;
    private ListView listSecond;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.tab_secondhand, null);
        listSecond = view.findViewById(R.id.list_second);
        List<Map<String, Object>> list1=getData();
        Log.i(TAG, "onCreateView: "+list1);
//        listSecond.setAdapter(new TabSecondAdapter(getActivity(),list1));

        listSecond.setAdapter(new TabSecondAdapter(getActivity(), list1));
        return view;

    }
//    Time t=new Time("GMT+8"); //加上Time Zone资料。
    Calendar calendar = Calendar.getInstance();
    //获取系统的日期
//年
    int year = calendar.get(Calendar.YEAR);
    //月
    int month = calendar.get(Calendar.MONTH)+1;
    //日
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    String strtime = year+"-"+month+"-"+day;
    //获取系统时间
//小时
//    int hour = calendar.get(Calendar.HOUR_OF_DAY);
//    //分钟
//    int minute = calendar.get(Calendar.MINUTE);
//    //秒
//    int second = calendar.get(Calendar.SECOND);

//time2.setText("Calendar获取当前日期"+year+"年"+month+"月"+day+"日"+hour+":"+minute+":"+second);
//time3.setText("time获取当前日期"+year+"年"+month+"月"+day+"日"+hour+":"+minute+":"+second);
//————————————————
//    版权声明：本文为CSDN博主「指尖流动吧」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/huangshenshen_/article/details/57161724

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("image", R.drawable.fengye);
            map.put("content", "这是一个标题"+i);
            map.put("source", "资源来自" + i);
            map.put("time",strtime);
            list.add(map);
        }
        return  list;
    }


    //构造数据
    private void initData() {
//        productList.get(1).setImg(R.drawable.fengye);
//        productList.get(1).setTitle("这是测试文字");
        productList.add(new Product(1,"测试文字"));
        productList.add(new Product(R.drawable.fengye,"测试文字"));
        productList.add(new Product(R.drawable.fengye,"测试文字"));
        productList.add(new Product(R.drawable.fengye,"测试文字"));
        productList.add(new Product(R.drawable.fengye,"测试文字"));


    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //     initLayout();
        System.out.println("oncreate");
    }


}
