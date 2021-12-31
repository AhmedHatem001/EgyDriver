import java.util.*;
import java.lang.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class getDistanceMatrixAPI {
  private static final String API_KEY = "AIzaSyArF3LBoaPp-oRLzlCvgy-QbEDe7EsZzQY";
  public static float[][] distance;
  public static float[][] times;
  public static String[] cities = { "", "Cairo", "Giza", "Luxor", "Alexandria", "Aswan", "Hurghada", "Ismailia",
      "Asyut" };
  public static final int n = cities.length;

  public static String getData(String source, String destination) throws IOException, InterruptedException {
    var url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations="
        + destination + "&key=" + API_KEY;
    var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
    var client = HttpClient.newBuilder().build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
    // check connection conditions;
    System.out.println("Response : " + response); // just for test connection, we delete it for MVC
    return response;
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    String source = "Cairo";
    String destination = "Luxor";
    getData(source, destination);
    System.out.println("Because of the previous error, can't use Google Maps API");
  }

}
