public class DriverEntity extends User {
  private long nationalID;
  private String licenseNum;
  private float offer;

  public DriverEntity(String username, String password, int phoneNum, int ID, long nationalID, String licenseNum) {
    this.username = username;
    this.password = password;
    this.phoneNum = phoneNum;
    this.ID = ID;
    this.nationalID = nationalID;
    this.licenseNum = licenseNum;
    Ride.addDriver(this);
  }

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

  public void setOffer(float offer) {
    this.offer = offer;
  }

  public float getOffer() {
    return offer;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String pass) {
    this.password = pass;
  }

  public void setPhoneNum(int phone) {
    this.phoneNum = phone;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public void setNationalID(Long nationalID) {
    this.nationalID = nationalID;
  }

  public void setLicenseNum(String licenseNum) {
    this.licenseNum = licenseNum;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return this.password;
  }

  public int getPhoneNum() {
    return this.phoneNum;
  }

  public int getID() {
    return this.ID;
  }

  public long getNationalID() {
    return this.nationalID;
  }

  public String getLicenseNum() {
    return this.licenseNum;
  }
}
