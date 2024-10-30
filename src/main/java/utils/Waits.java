package utils;

import constants.WaitUntil;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

  public static WebElement element(By locator, Enum waitType){
    WebDriverWait wait =
      new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    if (waitType.equals(WaitUntil.VISIBLE)){
      return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    } else if (waitType.equals(WaitUntil.CLICKABLE)) {
      return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    return DriverManager.getDriver().findElement(locator);
  }
}
