import java.util.*;

public class RegistrationForm {

  private static ArrayList<DriverEntity> registeredDrivers = new ArrayList<DriverEntity>();
  private static ArrayList<ClientEntity> registeredClients = new ArrayList<ClientEntity>();
  static ClientInterface clientInterface = new ClientInterface();
  static DriverInterface driverInterface = new DriverInterface();

  static void registrationMenu() {
    int number;
    Scanner in = new Scanner(System.in);

    System.out.println("Please select which select which type of registration do you want");

    boolean loop = true;

    do {
      System.out.println("1. Client");
      System.out.println("2. Driver");
      number = in.nextInt();
      in.nextLine();
      if (number == 1) {
        clientInterface.clientRegistrationMenu();
      } else if (number == 2) {
        driverInterface.drivertRegistrationMenu();
      } else {
        System.out.println("Please enter one of the two choices");
        registrationMenu();
      }
      System.out.println("Do you wish to register another user? Y/N");
      String letter = in.nextLine();
      if (letter.equalsIgnoreCase("y")) {
        loop = true;
      } else if (letter.equalsIgnoreCase("n")) {
        loop = false;
        break;
      } else
        System.out.println("Please enter one of the choices");
      // registrationMenu();
    } while (loop);

    LoginInterface.loginMenu();
  }

  static void addRegisteredDrivers(DriverEntity driverEntity) {
    registeredDrivers.add(driverEntity);
  }

  static DriverEntity getRegisteredDrivers(int index) {
    return registeredDrivers.get(index);
  }

  static void printRegisteredDriversList() {
    for (int i = 0; i < registeredDrivers.size(); i++) {
      System.out.println("Driver " + (i + 1) + ". Name: " + registeredDrivers.get(i).getUsername()
          + ", Driver's License: " + registeredDrivers.get(i).getLicenseNum());
    }
  }

  static ArrayList<DriverEntity> getRegisteredDriverList() {
    return registeredDrivers;
  }

  static void addRegisteredClients(ClientEntity clientEntity) {
    registeredClients.add(clientEntity);
  }

  static ArrayList<ClientEntity> getRegisteredClientsList() {
    return registeredClients;
  }

  static ClientEntity getRegisteredClient(int index) {
    return registeredClients.get(index);
  }
}
