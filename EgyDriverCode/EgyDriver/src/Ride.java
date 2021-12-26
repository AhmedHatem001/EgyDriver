import java.util.*;

public class Ride {

  public static ArrayList<DriverController> drivers = new ArrayList<DriverController>();
  // static ArrayList<String> locations = new ArrayList<String>(
  // Arrays.asList("Cairo", "Giza", "Luxor", "Alexandria", "Aswan", "Hurghada",
  // "Ismailia", "Asyut"));

  public static void addDriver(DriverController driver) {
    drivers.add(driver);
  }

  public static void notifyDriver(ClientController clientController, String source, String destination) {
    for (DriverController driver : drivers) {
      if (driver.getFavoriteAreas().contains(source)) {
        driver.updateDriver(clientController, source, destination);
      }
    }
    // System.out.println("No drivers available");
  }

  // public static void listLocations() {
  // System.out.println("The available locations: ");
  // for (int i = 0; i < locations.size(); i++) {
  // System.out.print((i + 1) + ". " + locations.get(i) + " ");
  // }
}
