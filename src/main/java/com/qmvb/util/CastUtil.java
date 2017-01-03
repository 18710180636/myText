package com.qmvb.util;

/**
 * Created by wx on 2016/12/30.
 */
public class CastUtil {
    /**
     *转为int 默认值0
     * @param obj
     * @return
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj, 0);
    }

    /**
     *转为int 可指定默认值
     * @param obj
     * @param def
     * @return
     */
    public static int castInt(Object obj, int def) {
        int value = def;
        if(null != obj){
            String strVal = castString(obj);
            if(StringUtil.isNotEmpty(strVal)){
                try {
                    value = Integer.parseInt(strVal);
                }catch(NumberFormatException e){
                    value = def;
                }
            }
        }
        return value;
    }

    /**
     *类型转换成string 默认值为""
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return castString(obj, "");
    }

    /**
     *类型转换成string 可指定默认值
     * @param obj
     * @param def
     * @return
     */
    public static String castString(Object obj, String def) {
        return obj != null? String.valueOf(obj) : def;
    }

    /**
     * 类型转换成boolean类型 默认为false
     * @param obj
     * @return
     */
    public static boolean castBoolean(Object obj){
        return castBoolean(obj, false);
    }

    /**
     * 类型转换成boolean 默认为false
     * @param obj
     * @param def
     * @return
     */
    public  static boolean castBoolean(Object obj, boolean def) {
        boolean value = def;
        if(obj != null){
            value = Boolean.parseBoolean(castString(obj));
        }
        return value;
    }
}
