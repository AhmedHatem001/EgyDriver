import java.util.*;

public class RegistrationInterface {

  private static List<Driver> accepptedDrivers = new ArrayList<Driver>();
  private static List<Driver> registeredDrivers = new ArrayList<Driver>();
  private static List<Client> registeredClients = new ArrayList<Client>();

  void registrationMenu() {
    int number;
    String username;
    String password;
    int phoneNum;
    int ID;
    long nationalID;
    String licenseNum;
    Scanner in = new Scanner(System.in);

    System.out.println("Please select which select which type of registration do you want");

    boolean loop = true;

    do {
      System.out.println("1. Client");
      System.out.println("2. Driver");
      number = in.nextInt();
      in.nextLine();
      if (number == 1) {
        System.out.println("Please enter your Username(String), Password(String), Phone number(Int), and ID(Int)");
        // in.nextLine();
        username = in.nextLine();
        password = in.nextLine();
        phoneNum = in.nextInt();
        // in.nextLine();
        ID = in.nextInt();
        in.nextLine();
        // nationalID = 0;
        // licenseNum = "0";
        Client client = new Client(username, password, phoneNum, ID);
        registeredClients.add(client);
        // user.registerUser(username, password, ID, phoneNum, nationalID, licenseNum);
      } else if (number == 2) {

        System.out.println(
            "Please enter your Username(String), Password(String), Phone number(Int), ID(Int), National ID(int), and License Number(String)");
        // in.nextLine();
        username = in.nextLine();
        password = in.nextLine();
        phoneNum = in.nextInt();
        in.nextLine();
        ID = in.nextInt();
        in.nextLine();
        nationalID = in.nextInt();
        in.nextLine();
        licenseNum = in.nextLine();
        Driver driver = new Driver(username, password, phoneNum, ID, nationalID, licenseNum);

        admin.addDriver(driver);
        // registeredDrivers.add(driver);
        // user.registerUser(username, password, ID, phoneNum, nationalID, licenseNum);
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
      EgyDriver.main(null);
    } while (loop);

    login();
  }

  void setAccepptedDrivers(DriverEntity driverEntity) {
    accepptedDrivers.add(driverEntity);
  }

  DriverEntity getAccepptedDrivers() {
    return accepptedDrivers;
  }

}
