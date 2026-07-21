package com.gapcoder.weico.Utils;

import android.app.Activity;
import android.support.v4.app.ActivityCompat;

import java.util.LinkedList;

public class ActivityList {
    private static LinkedList<Activity> list=new LinkedList<>();

    public static void add(Activity ins){
        list.add(ins);
    }
    public static void remove(Activity ins){
        list.remove(ins);
    }
    public static void exit(){
        for(Activity ins:list)
            if(!ins.isFinishing())
                ins.finish();
    }
}
