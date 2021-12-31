package com.egydriver.hello;

import java.util.*;

public class LoginInterface {

  static int currentUser;
  // public static Admin admin = new Admin();
  public static Scanner in = new Scanner(System.in);
  // public static Ride ride = new Ride();

  public static void loginMenu() {
    ClientInterface clientInterface = new ClientInterface();
    DriverInterface driverInterface = new DriverInterface();
    boolean loop2 = true;
    while (loop2) {
      System.out.println("Please select which user are you going to login(int)");
      System.out.println("1- Client");
      System.out.println("2- Driver");
      System.out.println("3- Admin");
      System.out.println("4- exit");

      int cha = in.nextInt();
      in.nextLine();
      if (cha == 1) {
        clientInterface.clientLoginMenu();
      } else if (cha == 2) {
        driverInterface.driverLoginMenu();
      } else if (cha == 3) {
        AdminInterface.adminMenu();
      } else if (cha == 4) {
        // System.exit(0);
        loop2 = false;
        LogoutInterface.logoutMenu();
      } else {
        System.out.println("error");
        LogoutInterface.logoutMenu();
      }
    }
  }
}
