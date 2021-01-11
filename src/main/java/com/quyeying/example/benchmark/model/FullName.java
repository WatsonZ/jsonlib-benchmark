package com.quyeying.example.benchmark.model;

import java.io.Serializable;

/**
 * CopyRight (c)2019-2021 : dean.com
 * Project :  jsonlib-benchmark
 * Comments : <对此类的描述，可以引用系统设计中的描述>
 * JDK version : JDK1.8
 * Create Date : 2021/01/11 18:10
 *
 * @author : Watson W
 * @version : 1.0
 * @since : 1.0
 */
public class FullName implements Serializable {

  private static final long serialVersionUID = -6375231276068419166L;

  private String firstName;
  private String middleName;
  private String lastName;

  public FullName() {
  }

  public FullName(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public FullName setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getMiddleName() {
    return middleName;
  }

  public FullName setMiddleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public FullName setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  @Override
  public String toString() {
    return "FullName{" +
      "firstName='" + firstName + '\'' +
      ", middleName='" + middleName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }
}
