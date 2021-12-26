import java.util.*;

public abstract class User {

  protected String username;
  protected String password;
  protected int phoneNum;
  protected int ID;
  protected String source;
  protected String destination;
}

// class Client extends User {

// offer model
// public ArrayList<Driver> offers = new ArrayList<Driver>();
// OfferModel offerModel = new OfferModel();
// ClientEntity clientEntity = new ClientEntity(username, password, phoneNum,
// ID)

// client entity
// public Client(String username, String password, int phoneNum, int ID) {
// this.username = username;
// this.password = password;
// this.phoneNum = phoneNum;
// this.ID = ID;
// }

// // Ride ride = new Ride();
// void setSource(String source) {
// this.source = source;
// }

// public String getSource() {
// return source;
// }

// public void setDestination(String destination) {
// this.destination = destination;
// }

// public String getDestination() {
// return destination;
// }

// public void setUsername(String username) {
// this.username = username;
// }

// public String getUsername() {
// return username;
// }

// public void setPassword(String pass) {
// this.password = pass;
// }

// public String getPassword() {
// return this.password;
// }

// public void setPhoneNum(int phone) {
// this.phoneNum = phone;
// }

// public int getPhoneNum() {
// return this.phoneNum;
// }

// public void setID(int ID) {
// this.ID = ID;
// }

// public int getID() {
// return this.ID;
// }

// client controller
// public void requestRide(String source, String destination) {
// this.setSource(source);
// this.setDestination(destination);
// Ride.notifyDriver(this, source, destination);
// }

// void notifyClient(Driver driver) {
// System.out.println("Driver " + driver.getUsername() + " has offered: " +
// driver.getOffer() + "$");
// System.out.println();
// }

// public void updateClient(Driver driver, float price, String source, String
// destination) {
// driver.setOffer(price);
// driver.setSource(source);
// driver.setDestination(destination);
// this.notifyClient(driver);
// // System.out.println();
// // System.out.println("Driver " + driver.getUsername() + " has offered: " +
// // driver.getOffer() + "$");
// // System.out.println();
// offerModel.addOffer(driver);
// // offers.add(driver);
// }

// void listOffers() {
// offerModel.listOffers();
// }

// offer model
// public void listOffers() {
// for (int i = 0; i < offers.size(); i++) {
// System.out.println(
// "Offer " + (i + 1) + ": Driver: " + offers.get(i).getUsername() + ", Source:
// " + offers.get(i).getSource()
// + ", Destination: " + offers.get(i).getDestination() + ", Offer: " +
// offers.get(i).getOffer());
// }
// }
// }

class Driver extends User {

  // private long nationalID;
  // private String licenseNum;
  // private float offer;
  // public ArrayList<String> favoriteAreas = new ArrayList<String>();
  // public ArrayList<ClientEntity> ridesList = new ArrayList<ClientEntity>();
  // Ride ride = new Ride();

  // public Driver() {
  // }

  // public Driver(String username, String password, int phoneNum, int ID, long
  // nationalID, String licenseNum) {
  // this.username = username;
  // this.password = password;
  // this.phoneNum = phoneNum;
  // this.ID = ID;
  // this.nationalID = nationalID;
  // this.licenseNum = licenseNum;
  // Ride.addDriver(this);
  // }

  // void setSource(String source) {
  // this.source = source;
  // }

  // public String getSource() {
  // return source;
  // }

  // public void setDestination(String destination) {
  // this.destination = destination;
  // }

  // public String getDestination() {
  // return destination;
  // }

  // public void setOffer(float offer) {
  // this.offer = offer;
  // }

  // public float getOffer() {
  // return offer;
  // }

  // public void setUsername(String username) {
  // this.username = username;
  // }

  // public void setPassword(String pass) {
  // this.password = pass;
  // }

  // public void setPhoneNum(int phone) {
  // this.phoneNum = phone;
  // }

  // public void setID(int ID) {
  // this.ID = ID;
  // }

  // public void setNationalID(Long nationalID) {
  // this.nationalID = nationalID;
  // }

  // public void setLicenseNum(String licenseNum) {
  // this.licenseNum = licenseNum;
  // }

  // public String getUsername() {
  // return username;
  // }

  // public String getPassword() {
  // return this.password;
  // }

  // public int getPhoneNum() {
  // return this.phoneNum;
  // }

  // public int getID() {
  // return this.ID;
  // }

  // public long getNationalID() {
  // return this.nationalID;
  // }

  // public String getLicenseNum() {
  // return this.licenseNum;
  // }

  public void addFavoriteArea(String source) {
    favoriteAreas.add(source);
  }

  public void listFavoriteAreas() {
    for (int i = 0; i < favoriteAreas.size(); i++) {
      System.out.printf("Favorite area %d : %s \n", i + 1, favoriteAreas.get(i));
    }
  }

  public void updateDriver(ClientEntity clientEntity, String source, String destination) {
    System.out.println(" ");
    System.out
        .println(
            "Client " + clientEntity.getUsername() + " has requested a ride from " + source + " to " + destination);
    System.out.println(" ");
    ridesList.add(clientEntity);
  }

  public void listRides() {
    for (int i = 0; i < ridesList.size(); i++) {
      System.out.println("Ride " + (i + 1) + ": Client: " + ridesList.get(i).getUsername() + ", Source: "
          + ridesList.get(i).getSource() + ", Destination: " + ridesList.get(i).getDestination());
    }
  }

  public ClientEntity selectClient(int i) {
    return ridesList.get(i - 1);
  }

  public void offer(ClientController clientController, float price, String source, String destination) {
    clientController.updateClient(this, price, source, destination);
  }

}
