package com.quyeying.example.benchmark.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

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
public class JacksonUtil {
  private static ObjectMapper mapper = new ObjectMapper();

  public static String bean2Json(Object obj) {
    try {
      return mapper.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
    try {
      return mapper.readValue(jsonStr, objClass);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
}
