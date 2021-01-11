package com.quyeying.example.benchmark.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * CopyRight (c)2019-2021 : dean.com
 * Project :  jsonlib-benchmark
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2021/01/11 18:11
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public class Person implements Serializable {

  private static final long serialVersionUID = -5099747635843611963L;
  private String name;
  private FullName fullName;
  private int age;
  private Date birthday;
  private List<String> hobbies;
  private Map<String, String> clothes;
  private List<Person> friends;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public FullName getFullName() {
    return fullName;
  }

  public Person setFullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  public Date getBirthday() {
    return birthday;
  }

  public Person setBirthday(Date birthday) {
    this.birthday = birthday;
    return this;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public Person setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
    return this;
  }

  public Map<String, String> getClothes() {
    return clothes;
  }

  public Person setClothes(Map<String, String> clothes) {
    this.clothes = clothes;
    return this;
  }

  public List<Person> getFriends() {
    return friends;
  }

  public Person setFriends(List<Person> friends) {
    this.friends = friends;
    return this;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", fullName=" + fullName +
      ", age=" + age +
      ", birthday=" + birthday +
      ", hobbies=" + hobbies +
      ", clothes=" + clothes +
      ", friends=" + friends +
      '}';
  }
}
