import java.util.*;

public class DriverModel {
  private static ArrayList<DriverController> registeredDrivers = new ArrayList<DriverController>();

  static void addDriver(DriverController driverController) {
    registeredDrivers.add(driverController);
  }

  static void removeDriver(int index) {
    registeredDrivers.remove(index - 1);
  }

  static DriverController getDriver(int index) {
    return registeredDrivers.get(index);
  }

  // come back here again when you check the admin view, to see whether you're
  // going to call the adminLoginMenu here again, or in the admin view!!
  static void acceptDriver(int index) {
    System.out.println();
    if (registeredDrivers.get(index - 1).getDriverEntity().isAccepted() == true) {
      System.out.println("You already accepted this driver's registration");
    } else {
      registeredDrivers.get(index - 1).getDriverEntity().setIsAccept();
      System.out.println("Driver " + registeredDrivers.get(index - 1).getDriverEntity().getUsername() + " is accepted");
    }
    System.out.println();
  }

  static void printRegisteredDriversList() {
    System.out.println();
    for (int i = 0; i < registeredDrivers.size(); i++) {
      DriverEntity driver = registeredDrivers.get(i).getDriverEntity();
      System.out.print("Driver " + (i + 1) + ". Name: " + driver.getUsername()
          + ", Driver's License: " + driver.getLicenseNum() + ", Registration Form: ");
      if (driver.isAccepted() == true)
        System.out.print("accepted");
      else
        System.out.print("not accepted");
      System.out.println();
    }
    System.out.println();
    System.out.println();
  }

  static ArrayList<DriverController> getRegisteredDriversList() {
    return registeredDrivers;
  }

}
