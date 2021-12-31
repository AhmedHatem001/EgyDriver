import java.util.*;

public class RegistrationForm {

  static ClientInterface clientInterface = new ClientInterface();
  static DriverInterface driverInterface = new DriverInterface();

  static void registrationMenu() {
    int number;
    Scanner in = new Scanner(System.in);

    System.out.println("Please select which select which type of registration do you want(int)");

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
    } while (loop);

    LoginInterface.loginMenu();
  }

}
