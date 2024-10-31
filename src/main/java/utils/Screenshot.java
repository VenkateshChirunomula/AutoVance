package utils;

import com.google.common.io.Files;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Screenshot {
  public static void getCurrentView(WebDriver driver, String scrName) {
    TakesScreenshot scr = (TakesScreenshot) driver;
    File file = scr.getScreenshotAs(OutputType.FILE);

    try {
      Files.copy(file, new File(scrName + ".jpg"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void getElementScreenshot(WebElement element, String scrName) {

    File file = element.getScreenshotAs(OutputType.FILE);
    try {
      Files.copy(file, new File(scrName + ".jpg"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
