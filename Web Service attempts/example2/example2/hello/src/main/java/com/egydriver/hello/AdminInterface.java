package com.egydriver.hello;

import java.util.*;

public class AdminInterface {

  static void adminMenu() {
    Scanner in = new Scanner(System.in);
    ArrayList<DriverController> drivers = Admin.getRegisteredDriversList();
    int num;
    boolean loop2 = true;
    while (loop2) {
      System.out.println("Please select which user are you going to login");
      System.out.println("1- List registered drivers");
      System.out.println("2- Accept drivers");
      System.out.println("3- Remove Drivers");
      System.out.println("4- Logout");
      int cha = in.nextInt();
      in.nextLine();

      if (cha == 1) {
        System.out.println("there are " + drivers.size() + " registered Drivers");
        DriverController.printRegisteredDriversList();
      } else if (cha == 2) {
        System.out.println("Enter the number of the Driver you wish to accept(int): ");
        num = in.nextInt();
        in.nextLine();
        Admin.acceptDriver(num);
      } else if (cha == 3) {
        System.out.println("Enter the number of the Driver you wish to remove(int): ");
        num = in.nextInt();
        in.nextLine();
        Admin.removeDriver(num);
      } else if (cha == 4) {
        LogoutInterface.logoutMenu();
      } else {
        System.out.println("Error has occured in the Admin Interface");
        adminMenu();
      }
    }
  }

}
