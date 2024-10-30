package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Reader;

import java.util.Objects;

public class DriverManager {
  static WebDriver driver;
  public static WebDriver getDriver(){

    switch (Reader.getBrowser().toLowerCase()){
      case "firefox":
        if(Objects.isNull(driver)) {
          driver = new FirefoxDriver();
        }
        break;
      case "edge":
        if(Objects.isNull(driver)) {
          driver = new EdgeDriver();
        }
        break;
      case "chrome":
      default:
        if(Objects.isNull(driver)) {
          driver = new ChromeDriver();
        }
        break;
    }
    return driver;
  }

}

