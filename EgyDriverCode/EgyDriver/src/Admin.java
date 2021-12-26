import java.util.*;

public class Admin {
  List<Driver> registeredDrivers = new ArrayList<Driver>();

  public Admin() {

  }

  public void addDriver(Driver driver) {
    registeredDrivers.add(driver);

  }

  public void listRegisteredDriver() {
    for (int i = 0; i < registeredDrivers.size(); i++) {
      // System.out.println("Driver " + i + ": UserName: " +
      // registeredDrivers.get(i).getUsername() + ", Drivers License: "
      // + registeredDrivers.get(i).getLicenseNum());
      System.out.printf("Driver %d username: %s, License: %s \n", i + 1, registeredDrivers.get(i).getUsername(),
          registeredDrivers.get(i).getLicenseNum());
    }
  }

  public Driver accept(int i) {
    return registeredDrivers.get(i);
  }

}
