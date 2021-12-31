package com.egydriver.hello;

import java.util.*;

public class Offer {
  private DriverController driverController;
  private float price;
  private String source;
  private String destination;

  public Offer(DriverController driverController, float price, String source, String destination) {
    this.driverController = driverController;
    this.price = price;
    this.source = source;
    this.destination = destination;
  }

  DriverController getDriverController() {
    return driverController;
  }

  float getPrice() {
    return price;
  }

  String getSource() {
    return source;
  }

  String getDestination() {
    return destination;
  }
}
