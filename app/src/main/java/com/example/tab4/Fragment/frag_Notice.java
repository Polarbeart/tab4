package com.example.tab4.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.tab4.Adapter.TabNoticeAdapter;
import com.example.tab4.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class frag_Notice extends Fragment{
    private static final String TAG = "";
    private ListView listNotice;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        System.out.println("ExampleFragment--onCreateView");
        View view = inflater.inflate(R.layout.tab_shool, null);
        listNotice = view.findViewById(R.id.list_notice);
        List<Map<String, Object>> list1=getData();
        listNotice.setAdapter(new TabNoticeAdapter(getActivity(), list1));
        return view;

    }
//利用map存储数据和调用数据
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
//            map.put("image", R.drawable.ic_launcher);
            map.put("title", "这是一个标题"+i);
            map.put("content", "这是一个详细信息" + i);
            list.add(map);
        }
        return  list;
    }


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println("oncreate");
    }
}
