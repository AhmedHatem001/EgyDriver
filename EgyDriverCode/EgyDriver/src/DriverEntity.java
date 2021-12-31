public class DriverEntity extends User {
  private long nationalID;
  private String licenseNum;
  // private float offer;
  private static int driverID = 0;
  private boolean isAccepted;
  private float balance;

  public DriverEntity(String username, String password, int phoneNum, long nationalID, String licenseNum) {
    this.username = username;
    this.password = password;
    this.phoneNum = phoneNum;
    this.nationalID = nationalID;
    this.licenseNum = licenseNum;
    isAccepted = false;
    balance = 0;
    driverID++;
  }

  public long getNationalID() {
    return this.nationalID;
  }

  public String getLicenseNum() {
    return this.licenseNum;
  }

  public int getID() {
    return driverID;
  }

  void setIsAccept() {
    isAccepted = true;
  }

  public boolean isAccepted() {
    return isAccepted;
  }

  public void setBalance(float price) {
    balance += price;
  }

  public float getBalance() {
    return balance;
  }
}
