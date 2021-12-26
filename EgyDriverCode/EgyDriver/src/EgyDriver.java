import java.util.*;

public class EgyDriver {

  // public static List<Driver> accepptedDrivers = new ArrayList<Driver>();
  // public static List<Driver> registeredDrivers = new ArrayList<Driver>();
  // public static List<Client> registeredClients = new ArrayList<Client>();

  // static int currentUser;
  // public static Admin admin = new Admin();
  // public static Scanner in = new Scanner(System.in);
  // public static Ride ride = new Ride();

  // public static void login() throws Exception {
  // boolean loop2 = true;
  // while (loop2) {
  // System.out.println("Please select which user are you going to login");
  // System.out.println("1- Client");
  // System.out.println("2- Driver");
  // System.out.println("3- Admin");
  // System.out.println("4- exit");

  // int cha = in.nextInt();
  // in.nextLine();
  // if (cha == 1) {
  // System.out.println("Please enter your username and password");

  // String Username = in.nextLine();
  // String Password = in.nextLine();
  // int i;
  // for (i = 0; i <= registeredClients.size(); i++) {
  // if (registeredClients.get(i).getUsername().equals(Username)
  // && registeredClients.get(i).getPassword().equals(Password)) {
  // System.out.println("Login Successful");
  // System.out.println(" ");
  // currentUser = i;
  // break;
  // }
  // if (i == registeredClients.size()) {
  // System.out.println("Wrong Login");
  // login();
  // }
  // }
  // boolean flag = true;
  // while (flag) {
  // System.out.println("Please select an option");
  // ride.listLocations();
  // System.out.println("1- Request Ride");
  // System.out.println("2- check offers");
  // System.out.println("3- logout");
  // int decision = in.nextInt();
  // in.nextLine();
  // if (decision == 1) {
  // System.out.println("Please enter source and destination");
  // System.out.print("source: ");
  // // in.nextLine();
  // String source = in.nextLine();
  // System.out.print("destination: ");
  // String destination = in.nextLine();
  // registeredClients.get(currentUser).requestRide(source, destination);
  // } else if (decision == 2) {
  // registeredClients.get(currentUser).listOffers();
  // } else if (decision == 3) {
  // logout();
  // } else {
  // System.out.println("error");
  // logout();
  // }
  // }
  // } else if (cha == 2) {
  // if (accepptedDrivers.isEmpty()) {
  // System.out.println("The Admin has not accepted any Driver Registrations");
  // login();
  // break;
  // } else {
  // System.out.println("Please enter your username and password");
  // // in.nextLine();
  // String Username = in.nextLine();
  // String Password = in.nextLine();
  // for (int i = 0; i < accepptedDrivers.size(); i++) {
  // if (accepptedDrivers.get(i).getUsername().equals(Username)
  // && accepptedDrivers.get(i).getPassword().equals(Password)) {
  // System.out.println("Login Successful");
  // currentUser = i;
  // break;
  // }
  // }
  // boolean flag = true;
  // while (flag) {
  // System.out.println("Please select an option");
  // System.out.println("1- list favorite areas");
  // System.out.println("2- list requests");
  // System.out.println("3- offer");
  // System.out.println("4- logout");
  // int decision = in.nextInt();
  // in.nextLine();
  // if (decision == 1) {
  // if (accepptedDrivers.get(currentUser).favoriteAreas.isEmpty()) {
  // System.out.println("You don't have any favorite areas");
  // System.out.println(" ");
  // ride.listLocations();
  // System.out.println(
  // "Please select your favorite area(select the numbers of the favorite area
  // you'd like to add, and then select which areas you'd like to be your
  // favorite):");
  // int number = in.nextInt();
  // in.nextLine();
  // if (number > ride.locations.size()) {
  // System.out.println("you've entered a size bigger than the number of
  // locations");
  // login();
  // } else {
  // String loc = new String();
  // for (int i = 0; i < number; i++) {
  // System.out.print("Select a location: ");
  // loc = in.nextLine();
  // System.out.println("accepted");
  // accepptedDrivers.get(currentUser).addFavoriteArea(loc);
  // }
  // }
  // } else {
  // System.out.println("Favorite Areas:");
  // accepptedDrivers.get(currentUser).listFavoriteAreas();
  // }
  // } else if (decision == 2) {
  // accepptedDrivers.get(currentUser).listRides();
  // } else if (decision == 3) {
  // System.out.println("Select which client do you want to offer ride");
  // int user = in.nextInt();
  // in.nextLine();
  // System.out.println("Offer a price please:");
  // int price = in.nextInt();
  // in.nextLine();
  // accepptedDrivers.get(currentUser).offer(accepptedDrivers.get(currentUser).selectClient(user),
  // price,
  // accepptedDrivers.get(currentUser).selectClient(user).getSource(),
  // accepptedDrivers.get(currentUser).selectClient(user).getDestination());
  // } else if (decision == 4) {
  // logout();
  // } else {
  // System.out.println("error");
  // logout();
  // }

  // }

  // // login();

  // }
  // break;
  // } else if (cha == 3) {
  // // System.out.println("in");
  // admin.listRegisteredDriver();
  // // Boolean exit = true;
  // int num;

  // for (int i = 0; i < admin.registeredDrivers.size(); i++) {
  // System.out.println("please select the Registrations you're going to accept");
  // num = in.nextInt();
  // in.nextLine();
  // accepptedDrivers.add(admin.accept(num - 1));
  // System.out.println("Do you want to accept another driver? y/n");

  // String decision = in.nextLine();
  // if (decision.equalsIgnoreCase("y")) {
  // continue;
  // } else if (decision.equalsIgnoreCase("n")) {
  // break;
  // } else
  // System.out.println("error");
  // }
  // for (int i = 0; i < accepptedDrivers.size(); i++) {
  // System.out.printf("Driver %d username: %s, License: %s \n", i + 1,
  // accepptedDrivers.get(i).getUsername(),
  // accepptedDrivers.get(i).getLicenseNum());
  // }
  // } else if (cha == 4) {
  // // System.exit(0);
  // loop2 = false;
  // logout();
  // } else {
  // System.out.println("error");
  // login();
  // }

  // }
  }

  public static void logout() throws Exception {
    System.out.println("Do you want to enter the login screen? Or register a new user?");
    System.out.println("1- Login.");
    System.out.println("2- Register a new user.");
    System.out.println("3- Exit.");
    // in.nextLine();
    int decision = in.nextInt();
    in.nextLine();
    if (decision == 1) {
      login();
    } else if (decision == 2) {
      EgyDriver.main(null);
    } else if (decision == 3) {
      System.exit(0);
    } else {
      System.out.println("Please select one of the options");
      logout();
    }
  }

  private static void exit() {
    System.exit(0);
  }

  public static void main(String[] args) throws Exception {
  //   System.out.println("Please select which select which type of registration do you want");

  //   int number;
  //   String username;
  //   String password;
  //   int phoneNum;
  //   int ID;
  //   long nationalID;
  //   String licenseNum;

  //   boolean loop = true;

  //   do {
  //     System.out.println("1. Client");
  //     System.out.println("2. Driver");
  //     number = in.nextInt();
  //     in.nextLine();
  //     if (number == 1) {
  //       System.out.println("Please enter your Username(String), Password(String), Phone number(Int), and ID(Int)");
  //       // in.nextLine();
  //       username = in.nextLine();
  //       password = in.nextLine();
  //       phoneNum = in.nextInt();
  //       // in.nextLine();
  //       ID = in.nextInt();
  //       in.nextLine();
  //       // nationalID = 0;
  //       // licenseNum = "0";
  //       Client client = new Client(username, password, phoneNum, ID);
  //       registeredClients.add(client);
  //       // user.registerUser(username, password, ID, phoneNum, nationalID, licenseNum);
  //     } else if (number == 2) {

  //       System.out.println(
  //           "Please enter your Username(String), Password(String), Phone number(Int), ID(Int), National ID(int), and License Number(String)");
  //       // in.nextLine();
  //       username = in.nextLine();
  //       password = in.nextLine();
  //       phoneNum = in.nextInt();
  //       in.nextLine();
  //       ID = in.nextInt();
  //       in.nextLine();
  //       nationalID = in.nextInt();
  //       in.nextLine();
  //       licenseNum = in.nextLine();
  //       Driver driver = new Driver(username, password, phoneNum, ID, nationalID, licenseNum);

  //       admin.addDriver(driver);
  //       // registeredDrivers.add(driver);
  //       // user.registerUser(username, password, ID, phoneNum, nationalID, licenseNum);
  //     }
  //     System.out.println("Do you wish to register another user? Y/N");
  //     String letter = in.nextLine();
  //     if (letter.equalsIgnoreCase("y")) {
  //       loop = true;
  //     } else if (letter.equalsIgnoreCase("n")) {
  //       loop = false;
  //       break;
  //     } else
  //       System.out.println("Please enter one of the choices");
  //     EgyDriver.main(null);
  //   } while (loop);
  //   login();
  // }

}
