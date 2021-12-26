import java.util.*;

import javax.xml.transform.Source;

public class ClientInterface {

  // RegistrationForm registrationForm = new RegistrationForm();
  ClientController clientController;
  String username;
  String password;
  int phoneNum;
  int ID;
  long nationalID;
  String licenseNum;
  String source;
  String destination;
  Scanner in = new Scanner(System.in);

  // Client registration menu
  void clientRegistrationMenu() {
    System.out.println("Please enter your Username(String), Password(String), Phone number(Int)");
    username = in.nextLine();
    password = in.nextLine();
    phoneNum = in.nextInt();
    ID = in.nextInt();
    in.nextLine();
    ClientEntity client = new ClientEntity(username, password, phoneNum);
    RegistrationForm.addRegisteredClients(client);
  }

  // Client login menu
  void clientLoginMenu() {
    System.out.println("Please enter your username and password");
    // RegistrationForm registrationForm = new RegistrationForm();
    String Username = in.nextLine();
    String Password = in.nextLine();
    int i;
    ArrayList<ClientEntity> registeredClients = RegistrationForm.getRegisteredClientsList();
    for (i = 0; i <= registeredClients.size(); i++) {
      if (registeredClients.get(i).getUsername().equals(Username)
          && registeredClients.get(i).getPassword().equals(Password)) {
        System.out.println("Login Successful");
        System.out.println(" ");
        clientController = new ClientController(registeredClients.get(i));
        break;
      }
      if (i == registeredClients.size()) {
        System.out.println("Wrong Login");
        LoginInterface.loginMenu();
      }
    }
    boolean flag = true;
    while (flag) {
      System.out.println("Please select an option");
      System.out.println("1- Request Ride");
      System.out.println("2- List Offers");
      System.out.println("3- Select Offer");
      System.out.println("4- logout");
      int decision = in.nextInt();
      in.nextLine();
      if (decision == 1) {
        Locations.listLocations();
        System.out.println("Please enter source and destination");
        boolean flap = true;
        while (flap) {
          System.out.print("source: ");
          source = in.nextLine();
          System.out.print("destination: ");
          destination = in.nextLine();
          if (source != destination)
            flap = false;
        }
        clientController.requestRide(source, destination);
      }

      else if (decision == 2) {
        clientController.listOffers();
      }

      else if (decision == 3) {
        System.out.println("Select 0 if you don't want to select any offer");
        System.out.println("Insert Offer number: ");
        decision = in.nextInt();
        in.nextLine();
        if (decision == 0)
          continue;
        else
          clientController.selectOffer(decision);
      }

      else if (decision == 4) {
        LogoutInterface.logoutMenu();
      }

      else {
        System.out.println("error");
        LogoutInterface.logoutMenu();
      }
    }
  }
}
