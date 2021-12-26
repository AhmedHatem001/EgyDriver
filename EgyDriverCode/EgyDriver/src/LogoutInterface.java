import java.util.*;

public class LogoutInterface {

  static Scanner in = new Scanner(System.in);

  public static void logoutMenu() {
    System.out.println("Do you want to enter the login screen? Or register a new user?");
    System.out.println("1- Login.");
    System.out.println("2- Register a new user.");
    System.out.println("3- Exit.");
    // in.nextLine();
    int decision = in.nextInt();
    in.nextLine();
    if (decision == 1) {
      LoginInterface.loginMenu();
    } else if (decision == 2) {
      RegistrationForm.registrationMenu();
    } else if (decision == 3) {
      System.exit(0);
    } else {
      System.out.println("Please select one of the options");
      logoutMenu();
    }
  }
}
