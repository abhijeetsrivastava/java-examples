import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpExample {
  public static void main(String[] args) throws Exception {
    HttpURLConnection con = null;
    BufferedReader in = null;

    try {
      URL url = new URL("https://jsonplaceholder.typicode.com/users");
      con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");

      in = new BufferedReader(
        new InputStreamReader(con.getInputStream())
      );

      String line;
      StringBuffer content = new StringBuffer();
      while((line = in.readLine()) != null) {
        content.append(line);
      }

      System.out.println(content.toString());
    } catch (Exception e) {
      System.out.println(e.getMessage());
      throw e;
    } finally {
      if (in != null)
        in.close();
      if (con != null)
        con.disconnect();
    }
  }
}
