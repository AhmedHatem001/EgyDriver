package com.egydriver.hello;

import java.util.*;

public class Admin {

  public static void acceptDriver(int index) {
    DriverController.acceptDriver(index);
  }

  public static void removeDriver(int index) {
    DriverController.removeDriver(index);
  }

  public static void printRegisteredDriversList() {
    DriverController.printRegisteredDriversList();
  }

  public static ArrayList<DriverController> getRegisteredDriversList() {
    return DriverController.getRegisteredDriversList();
  }
}
