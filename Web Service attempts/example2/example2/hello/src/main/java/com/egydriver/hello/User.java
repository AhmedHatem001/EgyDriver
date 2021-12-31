package com.egydriver.hello;

import java.util.*;

public abstract class User {

  protected String username;
  protected String password;
  protected int phoneNum;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String pass) {
    this.password = pass;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPhoneNum(int phone) {
    this.phoneNum = phone;
  }

  public int getPhoneNum() {
    return this.phoneNum;
  }
}
