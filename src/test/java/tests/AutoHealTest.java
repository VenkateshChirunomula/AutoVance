package tests;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.Screenshot;
import utils.SelfHealer;

import java.sql.Driver;

public class AutoHealTest {

  WebDriver driver = DriverManager.getDriver();


  @Test
  public void autohealer(){

    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
//    String locator = "//input[@type='txt']";
    String locator = "//input[@type='text']'or'//input[@name='user-name']'or'//input[@placeholder='Username']";
    WebElement element = SelfHealer.selfHealElement(driver,locator);
    element.sendKeys("venkatesh");
    Screenshot.getElementScreenshot(element,"userNameFiled");
  }
  @AfterTest
  public void tearDown(){
    try{Thread.sleep(5000);}catch (Exception e){}
    driver.quit();
  }
}
