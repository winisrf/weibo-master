package com.gapcoder.weico.Utils;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gapcoder.weico.R;

public class T {
    public static void show(Context context, Object obj){
        Toast t=new Toast(context);
        t.setDuration(Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        View v= LayoutInflater.from(context).inflate(R.layout.toast,null);
        TextView tv=(TextView)v.findViewById(R.id.tv);
        tv.setText(obj.toString());
        t.setView(v);
        t.show();
    }
    public static void show2(Context context, Object obj){
        Toast t=new Toast(context);
        t.setDuration(Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        View v= LayoutInflater.from(context).inflate(R.layout.toast,null);
        TextView tv=(TextView)v.findViewById(R.id.tv);
        tv.setText(obj.toString());
        t.setView(v);
        t.show();
    }
}