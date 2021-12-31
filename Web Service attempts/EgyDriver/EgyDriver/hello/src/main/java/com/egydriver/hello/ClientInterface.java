package com.egydriver.hello;

import java.util.*;

import javax.xml.transform.Source;

public class ClientInterface {

  // RegistrationForm registrationForm = new RegistrationForm();
  protected ClientController clientController;
  protected String username;
  protected String password;
  protected int phoneNum;
  protected int ID;
  protected long nationalID;
  protected String licenseNum;
  protected String source;
  protected String destination;
  protected CalcDistTime strategy;
  protected static int count = 0;
  protected Scanner in = new Scanner(System.in);

  // Client registration menu
  public void clientRegistrationMenu() {
    System.out.println("Please enter your Username(String), Password(String), Phone number(Int)");
    username = in.nextLine();
    password = in.nextLine();
    phoneNum = in.nextInt();
    in.nextLine();
    ClientEntity client = new ClientEntity(username, password, phoneNum);
    clientController = new ClientController(client);
    ClientController.addRegisteredClients(clientController);
  }

  // Client login menu
  public void clientLoginMenu() {
    System.out.println("Please enter your username and password");
    // RegistrationForm registrationForm = new RegistrationForm();
    String Username = in.nextLine();
    String Password = in.nextLine();
    int i;
    ArrayList<ClientController> registeredClients = ClientController.getRegisteredClientsList();
    for (i = 0; i <= registeredClients.size(); i++) {
      try {
        if (registeredClients.get(i).getClientEntity().getUsername().equals(Username)
            && registeredClients.get(i).getClientEntity().getPassword().equals(Password)) {
          System.out.println("Login Successful");
          System.out.println(" ");
          clientController = registeredClients.get(i);
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
        System.out.println("1- Request ride");
        System.out.println("2- List offers");
        System.out.println("3- Select offer");
        System.out.println("4- List rides history");
        System.out.println("5- Rate ride");
        System.out.println("6- logout");
        int decision = in.nextInt();
        in.nextLine();
        if (decision == 1) {
          Locations.listLocations();
          System.out.println("Please enter source and destination(string)");
          boolean flap = true;
          while (flap) {
            System.out.print("source: ");
            source = in.nextLine();
            System.out.print("destination: ");
            destination = in.nextLine();
            if (source != destination)
              flap = false;
            else
              System.out.println("Source can not be the same as destination!");
          }
          count++;
          System.out.println("");
          if (count < 2) {
            strategy = new DistanceMatrixAPI();
            System.out.println(strategy.getData(source, destination));
          } else {
            strategy = new HarvesineCalc();
            System.out.println("Distance: " + strategy.getData(source, destination) + " K.M");
            System.out.println("time for arrival: " + strategy.getETA() + " minutes");
          }
          clientController.requestRide(source, destination);
        }

        else if (decision == 2) {
          if (clientController.getOffersList().isEmpty()) {
            System.out.println("you have not recieved any offers yet");
          } else {
            clientController.listOffers();
          }
        }

        else if (decision == 3) {
          System.out.println("Select 0 if you don't want to select any offer");
          System.out.println("Insert Offer number: ");
          int num = in.nextInt();
          in.nextLine();
          if (num == 0)
            continue;
          else
            clientController.acceptOffer(num);
        }

        else if (decision == 4) {
          clientController.listRidesHistory();
        }

        else if (decision == 5) {
          System.out.println();
          System.out.println("Please select which Ride you would like to rate(int)");
          int num = in.nextInt();
          in.nextLine();
          clientController.getRide(num);
          System.out.println("insert Rating: ");
          int rate = in.nextInt();
          in.nextLine();
          clientController.rateRide(rate);
        }

        else if (decision == 6) {
          LogoutInterface.logoutMenu();
        }

        else {
          System.out.println("error");
          LogoutInterface.logoutMenu();
        }
      }
    } catch (Exception e) {
      System.out.println();
      System.out.println("Wrong input, please try again");
      clientLoginMenu();
    }

  }
}
