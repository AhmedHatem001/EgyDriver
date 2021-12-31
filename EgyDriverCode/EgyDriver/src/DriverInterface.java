
import java.sql.Driver;
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
    driverController = new DriverController(driver);
    DriverController.addDriver(driverController);
  }

  void driverLoginMenu() {
    System.out.println("Please enter your username and password");
    String Username = in.nextLine();
    String Password = in.nextLine();
    ArrayList<DriverController> drivers = DriverController.getRegisteredDriversList();
    for (int i = 0; i <= drivers.size(); i++) {
      try {
        if (drivers.get(i).getDriverEntity().getUsername().equals(Username)
            && drivers.get(i).getDriverEntity().getPassword().equals(Password)) {
          System.out.println("Login Successful");
          System.out.println(" ");
          driverController = drivers.get(i);
          break;
        }
      } catch (Exception e) {
        System.out.println();
        System.out.println("Wrong Login info, please try again");
        LoginInterface.loginMenu();
      }

    }
    boolean flag = true;
    try {
      while (flag) {
        System.out.println("Please select an option");
        System.out.println("1- List favorite areas");
        System.out.println("2- Add an area to favorite areas list");
        System.out.println("3- Remove an area from the favorite area list");
        System.out.println("4- List Rides");
        System.out.println("5- Offer");
        System.out.println("6- End ride");
        System.out.println("7- Logout");
        int decision = in.nextInt();
        in.nextLine();
        if (decision == 1) {
          if (driverController.getFavoriteAreas().isEmpty()) {
            System.out.println();
            System.out.println("You don't have any favorite areas");
            System.out.println("Please add an area to your list!");
            System.out.println(" ");
          } else {
            System.out.println();
            System.out.println("Favorite Areas:");
            driverController.listFavoriteAreas();
          }
        }

        else if (decision == 2) {
          System.out.println();
          System.out.println("These are the available areas: ");
          Locations.listLocations();
          System.out.println();
          System.out.println("Please select an area(string)");
          String loc;
          loc = in.nextLine();
          driverController.addFavoriteArea(loc);
        }

        else if (decision == 3) {
          System.out.println("Favorite Areas:");
          driverController.listFavoriteAreas();
          // System.out.println();
          System.out.println("Please select an area to remove(int)");
          int loc;
          loc = in.nextInt();
          in.nextLine();
          driverController.removeFavoriteArea(loc);
        }

        else if (decision == 4) {
          driverController.listRides();
        }

        else if (decision == 5) {
          System.out.println();
          System.out.println("Select which client do you want to offer ride(int)");
          int user = in.nextInt();
          in.nextLine();
          if (driverController.selectClient(user).getRide().isOffered() == true)
            System.out.println("You already made an offer of this ");
          else {
            System.out.println("Offer a price please:");
            float price = in.nextFloat();
            in.nextLine();
            ClientController client = driverController.selectClient(user);
            String source = driverController.getClientSource(user);
            String destination = driverController.getClientDestination(user);
            driverController.makeOffer(client, price, source, destination);
          }
        }

        else if (decision == 6) {
          System.out.println();
          System.out.println("Select which client do you want to end ride(int)");
          int user = in.nextInt();
          in.nextLine();
          if (driverController.selectClient(user).getRide().isCompeleted() == true)
            System.out.println("This Ride is already completed");
          else {
            ClientController client = driverController.selectClient(user);
            driverController.endRide(client);
          }
        }

        else if (decision == 7) {
          LogoutInterface.logoutMenu();
        } else {
          System.out.println("error");
          LogoutInterface.logoutMenu();
        }
      }
    } catch (Exception e) {
      System.out.println();
      System.out.println("Wrong input, please try again");
      driverLoginMenu();
    }

  }
}
