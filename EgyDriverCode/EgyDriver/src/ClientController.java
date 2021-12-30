import java.util.ArrayList;

public class ClientController {

  private ArrayList<Offer> offers = new ArrayList<Offer>();
  private ArrayList<Ride> ridesList = new ArrayList<Ride>();
  private Offer offer;
  private Ride ride;
  private Ride selectedRide;
  private ClientEntity clientEntity;
  private DriverController driverController;
  private DriverEntity driverEntity;

  public ClientController(ClientEntity clientEntity) {
    this.clientEntity = clientEntity;
    // offer = new Offers();
  }

  public void requestRide(String source, String destination) {
    // clientEntity.setSource(source);
    // clientEntity.setDestination(destination);
    ride = new Ride(this, source, destination);
    this.addRide(ride);
    // ride.notifyDriver(this, source, destination);
  }

  public void updateClient(DriverController driverController, float price, String source, String destination) {
    offer = new Offer(driverController, price, source, destination);
    driverEntity = driverController.getDriverEntity();
    System.out.println();
    System.out.println("Driver " + driverEntity.getUsername() + " has offered: " + price + "$"
        + " for " + this.getClientEntity().getUsername());
    System.out.println();
    offers.add(offer);
  }

  // void addOffer(DriverController driverController) {
  // offer.addOffer(driverController);
  // }

  public void listOffers() {
    System.out.println();
    for (int i = 0; i < offers.size(); i++) {
      driverEntity = offers.get(i).getDriverController().getDriverEntity();
      System.out.println(
          "Offer " + (i + 1) + ": Driver: " + driverEntity.getUsername() + ", Source: " + offers.get(i).getSource()
              + ", Destination: " + offers.get(i).getDestination() + ", Price: " + offers.get(i).getPrice() + "$");
    }
    System.out.println();
  }

  ArrayList<Offer> getOffersList() {
    return offers;
  }

  void acceptOffer(int index) {
    driverController = offers.get(index - 1).getDriverController();
    driverController.offerAccepted(this, offers.get(index - 1));
  }

  void addRide(Ride ride) {
    ridesList.add(ride);
  }

  Ride getRide(int index) {
    selectedRide = ridesList.get(index - 1);
    return ridesList.get(index - 1);
  }

  void rateRide(int rate) {
    if (selectedRide.isCompeleted() == false)
      System.out.println("The current Ride is not finished yet");
    else
      selectedRide.setRate(rate);
  }

  void listRidesHistory() {
    RidesHistory.listRideHistory(this);
  }

  ClientEntity getClientEntity() {
    return clientEntity;
  }

  public Ride getRide() {
    return ride;
  }

  static void addRegisteredClients(ClientController clientController) {
    ClientModel.addRegisteredClients(clientController);
  }

  static ArrayList<ClientController> getRegisteredClientsList() {
    return ClientModel.getRegisteredClientsList();
  }

}
