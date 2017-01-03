package com.qmvb.util;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/30.
 */
public class CollectionUtil {
    /**
     *判断collection 为空
     * @param collection
     * @return
     */
    public static boolean  isEmpty(Collection<?> collection){
        return collection.isEmpty();
    }
    /**
     * collection 不为空
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }
    /**
     * 判断map为空
     */
    public static boolean isEmpty(Map<?, ?> map){
        return map.isEmpty();
    }
    /**
     *判断map不为空
     */
    public static  boolean isNotEmpty(Map<?, ?> map){
        return !isEmpty(map);
    }

}
