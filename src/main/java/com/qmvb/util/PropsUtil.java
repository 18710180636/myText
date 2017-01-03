package com.qmvb.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 * Created by wx on 2016/12/30.
 */
public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);
    /**
     *  加载属性文件
     */
    public static Properties loadProps(String fileName){
        Properties pro = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(null == inputStream){
                throw new FileNotFoundException(fileName + "the resource could not be found");
            }
            pro = new Properties();
            pro.load(inputStream);
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        }finally {
            if(null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return pro;
    }

    /**
     *获取字符串类型属性（默认值为空字符串）
     * @param pro
     * @param key
     * @return
     */
    public static String getString(Properties pro, String key){
        return getString(pro, key, "");
    }

    /**
     *获取字符串属性（可指定默认值）
     * @param pro
     * @param key
     * @param s
     * @return
     */
    private static String getString(Properties pro, String key, String def) {
        String value = def;
        if(pro.contains(key)){
            value = pro.getProperty(key);
        }
        return value;
    }

    /**
     *获取数值型类型  （默认是0）
     * @param pro
     * @param key
     * @return
     */
    public static int getInt(Properties pro, String key){
        return getInt(pro, key, 0);
    }

    /**
     * 获取数值型类型 （可指定默认值）
     * @param pro
     * @param key
     * @param def
     * @return
     */
    private static int getInt(Properties pro, String key, int def) {
        int value = def;
        if(pro.contains(key)){
            value =CastUtil.castInt(pro.getProperty(key));
        }
        return value;
    }

    /**
     * 获取boolean类型 （默认值false）
     * @param pro
     * @param key
     * @return
     */
    public static boolean getBoolean(Properties pro, String key){
        return getBoolean(pro, key, false);
    }
    private static boolean getBoolean(Properties pro, String key, boolean def) {
        boolean value = def;
        if(pro.contains(key)){
            value = CastUtil.castBoolean(pro.getProperty(key));
        }
        return value;
    }
}
