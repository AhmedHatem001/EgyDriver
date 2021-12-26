import java.util.*;

public class Offers {
  public ArrayList<DriverController> offers = new ArrayList<DriverController>();
  private DriverEntity driverEntity;

  void addOffer(DriverController drivercController) {
    offers.add(drivercController);
  }

  public void listOffers() {
    for (int i = 0; i < offers.size(); i++) {
      driverEntity = offers.get(i).getDriverEntity();
      System.out.println(
          "Offer " + (i + 1) + ": Driver: " + driverEntity.getUsername() + ", Source: " + driverEntity.getSource()
              + ", Destination: " + driverEntity.getDestination() + ", Offer: " + driverEntity.getOffer());
    }
  }

  DriverController getOffer(int index) {
    return offers.get(index);
  }
}
