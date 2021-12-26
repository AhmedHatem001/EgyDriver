import java.sql.Driver;
import java.util.*;

public class Admin {
  private static ArrayList<DriverController> acceptedDrivers = new ArrayList<DriverController>();

  public static void addDriver(DriverEntity driverEntity) {
    DriverController driverController = new DriverController(driverEntity);
    acceptedDrivers.add(driverController);
  }

  public static void printAccepptedDriverList() {
    for (int i = 0; i < acceptedDrivers.size(); i++) {
      DriverEntity driver = acceptedDrivers.get(i).getDriverEntity();
      System.out.println("Driver " + (i + 1) + ". Name: " + driver.getUsername()
          + ", Driver's License: " + driver.getLicenseNum());
    }
  }

  static ArrayList<DriverController> getAccpetedDrivers() {
    return acceptedDrivers;
  }

  static void addLocation(String location) {
    Locations.addLocation(location);
  }

}
