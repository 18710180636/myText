package com.qmvb.util;

/**
 * Created by Administrator on 2016/12/30.
 */
public class StringUtil {
    public static boolean isNotEmpty(String val){
        return !isEmpty(val);
    }
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        if(null != str && str.length() > 0){
            return false;
        }
        return true;
    }
}
