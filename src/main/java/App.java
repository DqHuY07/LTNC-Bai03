import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    LOGGER.info("Start....");
    LOGGER.info("End....");
  }

  public static int add(int a , int b) {
    return a + b;
  }
}
