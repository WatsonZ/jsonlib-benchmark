package com.quyeying.example.benchmark.utils;

import net.sf.json.JSONObject;

/**
 * CopyRight (c)2019-2021 : dean.com
 * Project :  jsonlib-benchmark
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2021/01/11 18:15
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public class JsonLibUtil {
  public static String bean2Json(Object obj) {
    JSONObject jsonObject = JSONObject.fromObject(obj);
    return jsonObject.toString();
  }

  @SuppressWarnings("unchecked")
  public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
    return (T) JSONObject.toBean(JSONObject.fromObject(jsonStr), objClass);
  }
}
