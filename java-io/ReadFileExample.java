import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {

  public static void main(String[] args) throws Exception {
    // try-with-resources statement
    try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
