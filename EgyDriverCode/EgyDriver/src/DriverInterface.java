
import java.util.*;

public class DriverInterface {

  // RegistrationForm registrationForm = new RegistrationForm();
  DriverController driverController;
  int number;
  String username;
  String password;
  int phoneNum;
  int ID;
  long nationalID;
  String licenseNum;
  Scanner in = new Scanner(System.in);

  void drivertRegistrationMenu() {
    System.out.println(
        "Please enter your Username(String), Password(String), Phone number(Int), National ID(int), and License Number(String)");
    username = in.nextLine();
    password = in.nextLine();
    phoneNum = in.nextInt();
    in.nextLine();
    nationalID = in.nextInt();
    in.nextLine();
    licenseNum = in.nextLine();
    DriverEntity driver = new DriverEntity(username, password, phoneNum, nationalID, licenseNum);
    RegistrationForm.addRegisteredDrivers(driver);
  }

  void driverLoginMenu() {
    ArrayList<DriverController> drivers = Admin.getAccpetedDrivers();
    if (drivers.isEmpty()) {
      System.out.println("The Admin has not accepted any Driver Registrations");
      LoginInterface.loginMenu();
    } else {
      System.out.println("Please enter your username and password");
      // in.nextLine();
      String Username = in.nextLine();
      String Password = in.nextLine();
      for (int i = 0; i <= drivers.size(); i++) {
        try {
          if (drivers.get(i).getDriverEntity().getUsername().equals(Username)
              && drivers.get(i).getDriverEntity().getPassword().equals(Password)) {
            System.out.println("Login Successful");
            System.out.println();
            driverController = drivers.get(i);
            break;
          }
        } catch (Exception e) {
          System.out.println("Wrong Login info, please try again");
          LoginInterface.loginMenu();
        }

      }
      boolean flag = true;
      while (flag) {
        System.out.println("Please select an option");
        System.out.println("1- List favorite areas");
        System.out.println("2- Add an area to favorite areas list");
        System.out.println("3- Remove an area from the favorite area list");
        System.out.println("4- List requests");
        System.out.println("5- Offer");
        System.out.println("6- Logout");
        int decision = in.nextInt();
        in.nextLine();
        if (decision == 1) {
          if (driverController.getFavoriteAreas().isEmpty()) {
            System.out.println("You don't have any favorite areas");
            System.out.println("Please add an area to your list!");
            System.out.println(" ");
          } else {
            System.out.println("Favorite Areas:");
            driverController.listFavoriteAreas();
          }
        }

        else if (decision == 2) {
          System.out.println("These are the available areas: ");
          Locations.listLocations();
          System.out.println("Please select an area ");
          String loc;
          loc = in.nextLine();
          if (driverController.getFavoriteAreas().equals(loc)) {
            System.out.println("You already have this area in you list!");
            break;
          } else {
            driverController.addFavoriteArea(loc);
          }
        }

        else if (decision == 3) {
          System.out.println("Favorite Areas:");
          driverController.listFavoriteAreas();
          System.out.println("Please select an area to remove ");
          String loc;
          loc = in.nextLine();
          driverController.removeFavoriteArea(loc);
        }

        else if (decision == 4) {
          driverController.listRides();
        }

        else if (decision == 5) {
          System.out.println("Select which client do you want to offer ride");
          int user = in.nextInt();
          in.nextLine();
          System.out.println("Offer a price please:");
          float price = in.nextFloat();
          in.nextLine();
          ClientController client = driverController.selectClient(user);
          driverController.offer(client, price,
              client.getClientEntity().getSource(),
              client.getClientEntity().getDestination());
        } else if (decision == 6) {
          LogoutInterface.logoutMenu();
          ;
        } else {
          System.out.println("error");
          LogoutInterface.logoutMenu();
          ;
        }
      }
    }
  }
}
