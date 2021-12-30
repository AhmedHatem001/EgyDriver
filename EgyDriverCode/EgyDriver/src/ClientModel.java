import java.util.*;

public class ClientModel {
  private static ArrayList<ClientController> registeredClients = new ArrayList<ClientController>();

  static void addRegisteredClients(ClientController clientController) {
    registeredClients.add(clientController);
  }

  static ArrayList<ClientController> getRegisteredClientsList() {
    return registeredClients;
  }

  static ClientController getRegisteredClient(int index) {
    return registeredClients.get(index);
  }
}
