public class ClientController {

  private OfferModel offerModel;
  private ClientEntity clientEntity;

  public ClientController(ClientEntity clientEntity, OfferModel offerModel) {
    this.clientEntity = clientEntity;
    this.offerModel = offerModel;
  }

  public void requestRide(String source, String destination) {
    clientEntity.setSource(source);
    clientEntity.setDestination(destination);
    Ride.notifyDriver(clientEntity, source, destination);
  }

  void notifyClient(Driver driver) {
    System.out.println("Driver " + driver.getUsername() + " has offered: " + driver.getOffer() + "$");
    System.out.println();
  }

  public void updateClient(Driver driver, float price, String source, String destination) {
    driver.setOffer(price);
    driver.setSource(source);
    driver.setDestination(destination);
    this.notifyClient(driver);
    // System.out.println();
    // System.out.println("Driver " + driver.getUsername() + " has offered: " +
    // driver.getOffer() + "$");
    // System.out.println();
    offerModel.addOffer(driver);
    // offers.add(driver);
  }

  void listOffers() {
    offerModel.listOffers();
  }
}
