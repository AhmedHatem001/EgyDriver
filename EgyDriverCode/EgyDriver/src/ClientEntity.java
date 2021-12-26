public class ClientEntity extends User {
  private static int clientID = 0;

  public ClientEntity(String username, String password, int phoneNum) {
    this.username = username;
    this.password = password;
    this.phoneNum = phoneNum;
    clientID++;
  }

  // Ride ride = new Ride();
  void setSource(String source) {
    this.source = source;
  }

  public String getSource() {
    return source;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getDestination() {
    return destination;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String pass) {
    this.password = pass;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPhoneNum(int phone) {
    this.phoneNum = phone;
  }

  public int getPhoneNum() {
    return this.phoneNum;
  }

  public int getID() {
    return clientID;
  }
}
