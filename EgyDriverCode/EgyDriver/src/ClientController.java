import java.util.ArrayList;

public class ClientController {

  private Offers offer;
  private ClientEntity clientEntity;
  private DriverController driver;
  DriverEntity driverEntity;

  public ClientController(ClientEntity clientEntity) {
    this.clientEntity = clientEntity;
    this.offer = new Offers();
  }

  public void requestRide(String source, String destination) {
    clientEntity.setSource(source);
    clientEntity.setDestination(destination);
    Ride.notifyDriver(this, source, destination);
  }

  public void updateClient(DriverController driverController, float price, String source, String destination) {
    driverEntity = driverController.getDriverEntity();
    driverEntity.setOffer(price);
    driverEntity.setSource(source);
    driverEntity.setDestination(destination);
    System.out.println();
    System.out.println("Driver " + driverEntity.getUsername() + " has offered: " + driverEntity.getOffer() + "$"
        + " for " + this.getClientEntity().getUsername());
    System.out.println();
    this.addOffer(driverController);
    // offers.add(driver);
  }

  void addOffer(DriverController driverController) {
    offer.addOffer(driverController);
  }

  void listOffers() {
    offer.listOffers();
  }

  ArrayList<DriverController> getOffersList() {
    return offer.getOffersList();
  }

  void selectOffer(int index) {
    driver = offer.getOffer(index);
    driver.offerAccepted(this);
  }

  ClientEntity getClientEntity() {
    return clientEntity;
  }
}
