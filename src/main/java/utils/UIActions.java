package utils;

import constants.WaitUntil;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIActions {

  static WebDriver driver = DriverManager.getDriver();
  public static void launchBrowser(String url){
    driver.get(url);

  }
  public static void enterText(By locator, String inputText){
    Waits.element(locator, WaitUntil.VISIBLE).clear();
    Waits.element(locator, WaitUntil.VISIBLE).sendKeys(inputText);
  }
  public static void click(By locator){
    Waits.element(locator, WaitUntil.CLICKABLE).click();
  }
  public static void close(){
    driver.quit();
  }

}
