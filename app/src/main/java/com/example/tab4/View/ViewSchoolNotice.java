package com.example.tab4.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.example.tab4.R;

public class ViewSchoolNotice {
    private Context context;
    private LayoutInflater myLi;

    public ViewSchoolNotice(Context context) {
        this.context = context;
        this.myLi =LayoutInflater.from(context);;
    }

    public View getView(){
        return myLi.inflate(R.layout.tab_shool,null);
    }
}
