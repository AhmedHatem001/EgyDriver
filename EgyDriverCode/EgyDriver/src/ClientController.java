public class ClientController {

  private Offers offer;
  private ClientEntity clientEntity;
  private DriverController driver;

  public ClientController(ClientEntity clientEntity) {
    this.clientEntity = clientEntity;
    this.offer = new Offers();
  }

  public void requestRide(String source, String destination) {
    clientEntity.setSource(source);
    clientEntity.setDestination(destination);
    Ride.notifyDriver(this, source, destination);
  }

  public void updateClient(DriverController drivercController, float price, String source, String destination) {
    DriverEntity driverEntity = drivercController.getDriverEntity();
    driverEntity.setOffer(price);
    driverEntity.setSource(source);
    driverEntity.setDestination(destination);
    System.out.println("Driver " + driverEntity.getUsername() + " has offered: " + driverEntity.getOffer() + "$");
    System.out.println();
    offer.addOffer(drivercController);
    // offers.add(driver);
  }

  void listOffers() {
    offer.listOffers();
  }

  void selectOffer(int index) {
    driver = offer.getOffer(index);
    driver.offerAccepted(this);
  }

  ClientEntity getClientEntity() {
    return clientEntity;
  }
}
