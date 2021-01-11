package com.quyeying.example.benchmark.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

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
public class GsonUtil {
  private static Gson gson = new GsonBuilder().create();

  public static String bean2Json(Object obj) {
    return gson.toJson(obj);
  }

  public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
    return gson.fromJson(jsonStr, objClass);
  }

  public static String jsonFormatter(String uglyJsonStr) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    JsonParser jp = new JsonParser();
    JsonElement je = jp.parse(uglyJsonStr);
    return gson.toJson(je);
  }
}
