import java.util.*;

public class OfferModel {
  public ArrayList<Driver> offers = new ArrayList<Driver>();

  void addOffer(Driver driver) {
    offers.add(driver);
  }

  public void listOffers() {
    for (int i = 0; i < offers.size(); i++) {
      System.out.println(
          "Offer " + (i + 1) + ": Driver: " + offers.get(i).getUsername() + ", Source: " + offers.get(i).getSource()
              + ", Destination: " + offers.get(i).getDestination() + ", Offer: " + offers.get(i).getOffer());
    }
  }
}
