import java.util.*;

public class DriverController {

  private ArrayList<ClientController> ridesList = new ArrayList<ClientController>();
  private FavoriteAreas favoriteAreas;
  private DriverEntity driverEntity;
  private ClientEntity client;

  public DriverController(DriverEntity driverEntity) {
    favoriteAreas = new FavoriteAreas();
    this.driverEntity = driverEntity;
    Ride.addDriver(this);
  }

  void listRides() {

    for (int i = 0; i < ridesList.size(); i++) {
      client = ridesList.get(i).getClientEntity();
      System.out.println("Ride " + (i + 1) + ": Client: " + client.getUsername() + ", Source: "
          + client.getSource() + ", Destination: " + client.getDestination());
    }
  }

  ClientController selectClient(int i) {
    return ridesList.get(i - 1);
  }

  public void updateDriver(ClientController clientController, String source, String destination) {
    client = clientController.getClientEntity();
    System.out.println(" ");
    System.out
        .println("Driver " + this.getDriverEntity().getUsername() +
            ", Client " + client.getUsername() + " has requested a ride from " + source + " to " + destination);
    System.out.println(" ");
    ridesList.add(clientController);
  }

  public void offer(ClientController clientController, float price, String source, String destination) {
    clientController.addOffer(this);
    clientController.updateClient(this, price, source, destination);
  }

  void offerAccepted(ClientController clientcController) {
    client = clientcController.getClientEntity();
    System.out.println("Client " + client.getUsername() + " has accpeted your offer for " + driverEntity.getOffer());
  }

  void addFavoriteArea(String source) {
    favoriteAreas.addFavoriteArea(source);
  }

  void removeFavoriteArea(String source) {
    favoriteAreas.removeFavoriteArea(source);
  }

  void listFavoriteAreas() {
    favoriteAreas.listFavoriteAreas();
  }

  ArrayList<String> getFavoriteAreas() {
    return favoriteAreas.getFavoriteAreas();
  }

  DriverEntity getDriverEntity() {
    return driverEntity;
  }
}
