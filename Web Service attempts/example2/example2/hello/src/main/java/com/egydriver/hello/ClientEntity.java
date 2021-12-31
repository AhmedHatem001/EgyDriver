package com.egydriver.hello;

public class ClientEntity extends User {
  private static int clientID = 0;

  public ClientEntity(String username, String password, int phoneNum) {
    this.username = username;
    this.password = password;
    this.phoneNum = phoneNum;
    clientID++;
  }
  

  public static int getID() {
    return clientID;
  }
}
