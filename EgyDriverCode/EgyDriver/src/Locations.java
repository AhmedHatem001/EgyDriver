import java.util.*;

public class Locations {
  static ArrayList<String> locations = new ArrayList<String>(
      Arrays.asList("Cairo", "Giza", "Luxor", "Alexandria", "Aswan", "Hurghada", "Ismailia", "Asyut"));

  public static void listLocations() {
    System.out.println();
    System.out.println("The available locations: ");
    for (int i = 0; i < locations.size(); i++) {
      System.out.print((i + 1) + ". " + locations.get(i) + " ");
    }
    System.out.println();
  }

  static void addLocation(String location) {
    locations.add(location);
  }

}
