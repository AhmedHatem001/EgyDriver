import java.util.*;

public class Ride {

  public static ArrayList<Driver> d = new ArrayList<Driver>();
  List<String> locations = new ArrayList<String>(
      Arrays.asList("Cairo", "Giza", "Luxor", "Alexandria", "Aswan", "Hurghada", "Ismailia", "Asyut"));

  public Ride() {
  }

  public static void addDriver(Driver driver) {
    d.add(driver);
  }

  public static void notifyDriver(ClientEntity clienteEntity, String source, String destination) {
    for (Driver driver : d) {
      if (driver.favoriteAreas.contains(source)) {
        driver.updateDriver(clienteEntity, source, destination);
      }
    }
    // System.out.println("No drivers available");
  }

  public void listLocations() {
    for (int i = 0; i < locations.size(); i++) {
      System.out.printf("Location %d : %s \n", i + 1, locations.get(i));
    }
  }
}
