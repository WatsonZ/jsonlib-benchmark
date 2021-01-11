# 介绍

本项目通过 JMH 来测试Java中几种常见的JSON解析库的性能。
JSON 类库分别为：`Gson`，`FastJson`，`Jackson`，`Json-lib`。

## 选型思考

1. 字符串解析成 JSON 性能
2. 字符串解析成 JavaBean 性能
3. JavaBean 构造 JSON 性能
4. 集合构造 JSON 性能
5. 易用性

## 四个类库的身份背景

### Gson

项目地址：[https://github.com/google/gson](https://github.com/google/gson)

Gson 是目前功能最全的 JSON 解析神器，Gson 当初是为因应 Google 公司内部需求而由 Google 自行研发而来，但自从在2008年五月公开发布第一版后已被许多公司或用户应用。Gson 的应用主要为 toJson 与fromJson 两个转换函数，无依赖，不需要例外额外的 jar，能够直接跑在 JDK 上。 在使用这种对象转换之前，需先创建好对象的类型以及其成员才能成功的将 JSON 字符串成功转换成相对应的对象。 类里面只要有 get 和 set 方法，Gson 完全可以实现复杂类型的 JSON 到 bean 或 bean 到 JSON 的转换，是 JSON 解析的神器。

### FastJson

项目地址：[https://github.com/alibaba/fastjson](https://github.com/alibaba/fastjson)

Fastjson 是一个 Java 语言编写的高性能的 JSON 处理器，由阿里巴巴公司开发。无依赖，不需要例外额外的 jar，能够直接跑在 JDK 上。 FastJson 在复杂类型的 Bean 转换 JSON 上会出现一些问题，可能会出现引用的类型，导致 JSON 转换出错，需要制定引用。FastJson 采用独创的算法，将 parse 的速度提升到极致，超过所有 JSON 库。

### Jackson

项目地址：[https://github.com/FasterXML/jackson](https://github.com/FasterXML/jackson)

Jackson 是当前用的比较广泛的，用来序列化和反序列化 JSON 的 Java 开源框架。Jackson 社区相对比较活跃，更新速度也比较快，从 Github 中的统计来看，Jackson 是最流行的 JSON 解析器之一，Spring MVC 的默认 JSON 解析器便是 Jackson。

### Json-lib

项目地址：[http://json-lib.sourceforge.net/index.html](http://json-lib.sourceforge.net/index.html)

json-lib 最开始的也是应用最广泛的 JSON 解析工具，json-lib 不好的地方确实是依赖于很多第三方包，对于复杂类型的转换，json-lib 对于 json 转换成 bean 还有缺陷， 比如一个类里面会出现另一个类的 list 或者 map 集合，json-lib 从 json 到 bean 的转换就会出现问题。json-lib 在功能和性能上面都不能满足现在互联网化的需求。

## 基准测试结果

### JsonSerializeBenchmark

三次测试结果为：

![](image\JsonSerializeBenchmark1.png)

![](image\JsonSerializeBenchmark2.png)

![](image\JsonSerializeBenchmark3.png)

### JsonDeserializeBenchmark

三次测试结果为：

![](image\JsonDeserializeBenchmark1.png)

![](image\JsonDeserializeBenchmark2.png)

![](image\JsonDeserializeBenchmark3.png)
