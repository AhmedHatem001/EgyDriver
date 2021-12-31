package com.egydriver.hello;

import java.sql.Driver;
import java.util.*;

public class Ride {

  private ClientController clientcController;
  private DriverController driverController;
  private float price;
  private String source;
  private String destination;
  private int rate;
  private boolean isAccepted;
  private boolean isOffered;
  private boolean isCompeleted;
  // private ArrayList<Ride> ridesHistory = new ArrayList<Ride>();
  // private ArrayList<Offer> offers = new ArrayList<Offer>();
  private static ArrayList<DriverController> drivers = new ArrayList<DriverController>();

  // static ArrayList<String> locations = new ArrayList<String>(
  // Arrays.asList("Cairo", "Giza", "Luxor", "Alexandria", "Aswan", "Hurghada",
  // "Ismailia", "Asyut"));

  // public Ride(DriverController driverController, float price, String source,
  // String destination) {
  // this.driverController = driverController;
  // this.price = price;
  // this.source = source;
  // this.destination = destination;
  // }

  public Ride(ClientController clientController, String source, String destination) {
    this.clientcController = clientController;
    this.source = source;
    this.destination = destination;
    rate = 0;
    isAccepted = false;
    isCompeleted = false;
    isOffered = false;
    this.notifyDriver(clientController, source, destination);
  }

  public static void addDriver(DriverController driver) {
    drivers.add(driver);
  }

  // check this part again, wheather we're going to make a ride history withen the
  // Ride Class, or make a new class called RideHistory (which is better IMO),
  // stupid
  public void notifyDriver(ClientController clientController, String source, String destination) {
    System.out.println();
    for (DriverController driver : drivers) {
      if (driver.getFavoriteAreas().contains(source)) {
        driver.addRide(this);
        driver.updateDriver(clientController, source, destination);
      }
    }
    System.out.println();
    // System.out.println("No drivers available");
  }

  // public static void listLocations() {
  // System.out.println("The available locations: ");
  // for (int i = 0; i < locations.size(); i++) {
  // System.out.print((i + 1) + ". " + locations.get(i) + " ");
  // }

  void setPrice(float price) {
    this.price = price;
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

  void setIsOffered() {
    isOffered = true;
  }

  boolean isOffered() {
    return isOffered;
  }

  void setIsAccepted() {
    isAccepted = true;
  }

  boolean isAccepted() {
    return isAccepted;
  }

  void setRate(int rate) {
    if (rate < 1)
      System.out.println("You can't place rating lower than 1");
    else if (rate > 5)
      System.out.println("You can't place rating higher than 5!");
    else
      this.rate = rate;
  }

  int getRate() {
    return rate;
  }

  void setIsCompleted() {
    isCompeleted = true;
  }

  public boolean isCompeleted() {
    return isCompeleted;
  }

  ClientController getClientController() {
    return clientcController;
  }

  ArrayList<DriverController> getDriversList() {
    return drivers;
  }

  DriverController getDriverController(int index) {
    return drivers.get(index);
  }
}
