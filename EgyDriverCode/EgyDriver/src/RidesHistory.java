import java.util.*;

public class RidesHistory {
  // private ClientController clientController;
  // private DriverController driverController;
  private static float price;
  private static String source;
  private static String destination;
  private static ArrayList<DriverController> drivers = new ArrayList<DriverController>();
  private static ArrayList<ClientController> clients = new ArrayList<ClientController>();

  public static void addDriver(DriverController driver) {
    drivers.add(driver);
  }

  public static void addClient(ClientController client) {
    clients.add(client);
  }

  static float getPrice() {
    return price;
  }

  String getSource() {
    return source;
  }

  String getDestination() {
    return destination;
  }

  static void listRideHistory(ClientController client) {
    if (clients.isEmpty()) {
      System.out.println("Rides history is currently empty");
    } else {
      for (ClientController c : clients) {
        if (c == client) {
          int i = 1;
          for (DriverController driver : drivers) {
            if (c.getRide().getDriversList().contains(driver)) {
              System.out.println(
                  "Ride " + i + ": Source: " + c.getRide().getSource() + ", Destination: "
                      + c.getRide().getDestination()
                      + ", Driver: " + driver.getDriverEntity().getUsername() + ", Price: " + c.getRide().getPrice());
              if (c.getRide().isCompeleted() == false)
                System.out.println(", State: " + "Not finished");
              else {
                // System.out.println(", State: " + "Finished");
                if (c.getRide().getRate() == 0)
                  System.out.println(", Rate: " + "Not Rated yet.");
                else
                  System.out.println(c.getRide().getRate() + "/5 stars");
              }
              i++;
            }
          }
        }
      }
    }
  }

}
