package com.gapcoder.weico.Utils;

public class Time {
    public static String format(int t){
        Long cur=System.currentTimeMillis()/1000L-t;
        if(cur<60)
            return "刚刚";
        else if(cur<3600)
            return cur/60+"分钟前";
        else if(cur<86400)
            return cur/3600+"小时前";
        else if(cur<86400*365)
            return cur/86400+"天前";
        else
            return cur/86400*365+"年前";
    }
}
