package com.quyeying.example.benchmark.utils;

import com.alibaba.fastjson.JSON;

/**
 * CopyRight (c)2019-2021 : dean.com
 * Project :  jsonlib-benchmark
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2021/01/11 18:14
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public class FastJsonUtil {

  public static String bean2Json(Object obj) {
    return JSON.toJSONString(obj);
  }

  public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
    return JSON.parseObject(jsonStr, objClass);
  }

}
