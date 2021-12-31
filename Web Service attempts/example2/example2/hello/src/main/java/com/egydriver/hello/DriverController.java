package com.egydriver.hello;

import java.util.*;

public class DriverController {

  private ArrayList<Ride> ridesList = new ArrayList<Ride>();
  // private ArrayList<RidesHistory> rideHistory = new ArrayList<RidesHistory>();
  private FavoriteAreas favoriteAreas;
  private DriverEntity driverEntity;
  private ClientEntity client;
  private ClientController selectedClientController;

  public DriverController(DriverEntity driverEntity) {
    favoriteAreas = new FavoriteAreas();
    this.driverEntity = driverEntity;
    Ride.addDriver(this);
  }

  void listRides() {
    if (ridesList.isEmpty()) {
      System.out.println("There are no requested Rides");
    } else {
      System.out.println();
      for (int i = 0; i < ridesList.size(); i++) {
        // client = ridesList.get(i).getClientEntity();
        System.out.println("Ride " + (i + 1) + ": Client: "
            + ridesList.get(i).getClientController().getClientEntity().getUsername() + ", Source: "
            + ridesList.get(i).getSource() + ", Destination: " + ridesList.get(i).getDestination());
        if (ridesList.get(i).isCompeleted() == false) {
          if (ridesList.get(i).isOffered() == false)
            System.out.print(". Has not been offered yet");
          else {
            System.out.print(". Has been offered");
            if (ridesList.get(i).isAccepted() == false)
              System.out.print(", but has not been accepted yet");
            else
              System.out.print(", and accepted");
          }
        } else {
          System.out.print(". Ride completed");
        }

      }
      System.out.println();
    }
  }

  ClientController selectClient(int i) {
    selectedClientController = ridesList.get(i - 1).getClientController();
    return ridesList.get(i - 1).getClientController();
  }

  ClientController getSelectedClientController() {
    return selectedClientController;
  }

  String getClientSource(int i) {
    return ridesList.get(i - 1).getSource();
  }

  String getClientDestination(int i) {
    return ridesList.get(i - 1).getDestination();
  }

  public void updateDriver(ClientController clientController, String source, String destination) {
    client = clientController.getClientEntity();
    System.out
        .println("Driver " + this.getDriverEntity().getUsername() +
            ", Client " + client.getUsername() + " has requested a ride from " + source + " to " + destination);
    // ridesList.add(clientController);
  }

  public void makeOffer(ClientController clientController, float price, String source, String destination) {
    clientController.getRide().setPrice(price);
    clientController.getRide().setIsOffered();
    clientController.updateClient(this, price, source, destination);
  }

  void offerAccepted(ClientController clientController, Offer offer) {
    client = clientController.getClientEntity();
    clientController.getRide().setIsAccepted();
    System.out.println();
    System.out.println("Client " + client.getUsername() + " has accpeted " + this.getDriverEntity().getUsername()
        + "'s offer for " + offer.getPrice() + "$");
    System.out.println();
  }

  void addFavoriteArea(String source) {
    favoriteAreas.addFavoriteArea(source);
  }

  void removeFavoriteArea(int index) {
    String source = favoriteAreas.selectFaovriteArea(index);
    favoriteAreas.removeFavoriteArea(source);
  }

  void listFavoriteAreas() {
    favoriteAreas.listFavoriteAreas();
  }

  ArrayList<String> getFavoriteAreas() {
    return favoriteAreas.getFavoriteAreas();
  }

  public DriverEntity getDriverEntity() {
    return driverEntity;
  }

  void addRide(Ride ride) {
    ridesList.add(ride);
  }

  void endRide(ClientController clientController) {

    RidesHistory.addDriver(this);
    RidesHistory.addClient(clientController);
    this.getDriverEntity().setBalance(clientController.getRide().getPrice());
    clientController.getRide().setIsCompleted();
  }

  static void addDriver(DriverController driverController) {
    DriverModel.addDriver(driverController);
  }

  static void removeDriver(int index) {
    DriverModel.removeDriver(index);
  }

  static DriverController getDriver(int index) {
    return DriverModel.getDriver(index);
  }

  static void acceptDriver(int index) {
    DriverModel.acceptDriver(index);
  }

  static void printRegisteredDriversList() {
    DriverModel.printRegisteredDriversList();
  }

  static ArrayList<DriverController> getRegisteredDriversList() {
    return DriverModel.getRegisteredDriversList();
  }

}
