import java.io.IOException;

public interface CalcDistTime {
  public double getData(String source, String destination) throws IOException, InterruptedException;

  public double getETA();
}
