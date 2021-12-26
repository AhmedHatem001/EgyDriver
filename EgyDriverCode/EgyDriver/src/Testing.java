import java.util.*;
import java.io.*;

public class Testing {
  public static void main(String[] args) throws IOException {
    File file = new File("test.txt");
    FileWriter fileWriter = new FileWriter("test.txt");
    if (file.createNewFile()) {
      System.out.println("created File");
    } else {
      System.out.println("file already exists");
    }
    Scanner input = new Scanner(System.in);
    String words = input.nextLine();
    fileWriter.write(words);
    words = input.nextLine();
    fileWriter.write(words);
    fileWriter.close();
  }
}
