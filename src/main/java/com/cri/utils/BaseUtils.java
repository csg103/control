package com.cri.utils;

import org.dozer.DozerBeanMapper;

/**
 * 基础工具类
 *
 * @author csg
 * @create 2017-06-1:30
 */

public class BaseUtils {
    private static DozerBeanMapper dozer = new DozerBeanMapper();
    public static DozerBeanMapper getVOMap(){
        return dozer;
    }
}
