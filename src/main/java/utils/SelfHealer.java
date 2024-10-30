package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class SelfHealer {

  public static WebElement selfHealElement(WebDriver driver, String locators) {
    WebElement element = null;
    String[] sarr = locators.split("'or'");
    String primaryLocator = sarr[0];
    String[] alternateLocators = Arrays.copyOfRange(sarr, 1, sarr.length);
    try {
      element = driver.findElement(By.xpath(primaryLocator));
    } catch (NoSuchElementException e) {
      System.out.println("primary locator not found : " + e.getMessage());
      if(alternateLocators.length>=1) {
        for (String locator : alternateLocators) {
          try {
            element = driver.findElement(By.xpath(locator));
            break;
          } catch (Exception e1) {
            System.out.println("alternate locators are not working please update : " + locator);
          }
        }
      }else{
        System.err.println("no alternate locators found");
      }
    }
    return element;
  }
}
