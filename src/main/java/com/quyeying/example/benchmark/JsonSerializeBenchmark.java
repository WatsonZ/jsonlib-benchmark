package com.quyeying.example.benchmark;

import com.quyeying.example.benchmark.model.FullName;
import com.quyeying.example.benchmark.model.Person;
import com.quyeying.example.benchmark.utils.FastJsonUtil;
import com.quyeying.example.benchmark.utils.GsonUtil;
import com.quyeying.example.benchmark.utils.JacksonUtil;
import com.quyeying.example.benchmark.utils.JsonLibUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * CopyRight (c)2019-2021 : dean.com
 * Project :  jsonlib-benchmark
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2021/01/11 18:33
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class JsonSerializeBenchmark {
  /**
   * 序列化次数参数
   */
  @Param({"1000", "10000", "100000"})
  private int count;

  private Person p;

  public static void main(String[] args) throws Exception {
    Options opt = new OptionsBuilder()
      .include(JsonSerializeBenchmark.class.getSimpleName())
      .forks(1)
      .warmupIterations(0)
      .build();
    Collection<RunResult> results = new Runner(opt).run();
//    ResultExporter.exportResult("JSON序列化性能", results, "count", "秒");
  }

  @Benchmark
  public void JsonLib() {
    for (int i = 0; i < count; i++) {
      JsonLibUtil.bean2Json(p);
    }
  }

  @Benchmark
  public void Gson() {
    for (int i = 0; i < count; i++) {
      GsonUtil.bean2Json(p);
    }
  }

  @Benchmark
  public void FastJson() {
    for (int i = 0; i < count; i++) {
      FastJsonUtil.bean2Json(p);
    }
  }

  @Benchmark
  public void Jackson() {
    for (int i = 0; i < count; i++) {
      JacksonUtil.bean2Json(p);
    }
  }

  @Setup
  public void prepare() {
    List<Person> friends = new ArrayList<Person>();
    friends.add(createAPerson("小明", null));
    friends.add(createAPerson("Tony", null));
    friends.add(createAPerson("陈小二", null));
    p = createAPerson("邵同学", friends);
  }

  @TearDown
  public void shutdown() {
  }

  private Person createAPerson(String name, List<Person> friends) {
    Person newPerson = new Person();
    newPerson.setName(name);
    newPerson.setFullName(new FullName("zjj_first", "zjj_middle", "zjj_last"));
    newPerson.setAge(24);
    List<String> hobbies = new ArrayList<String>();
    hobbies.add("篮球");
    hobbies.add("游泳");
    hobbies.add("coding");
    newPerson.setHobbies(hobbies);
    Map<String, String> clothes = new HashMap<String, String>();
    clothes.put("coat", "Nike");
    clothes.put("trousers", "adidas");
    clothes.put("shoes", "安踏");
    newPerson.setClothes(clothes);
    newPerson.setFriends(friends);
    return newPerson;
  }
}
