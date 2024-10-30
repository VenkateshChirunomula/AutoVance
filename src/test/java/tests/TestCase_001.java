package tests;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class TestCase_001 {
  WebDriver driver = DriverManager.getDriver();
  @Test
  public void testCase(){
    //    launchBrowser("https://ebay.com/");
    //    Screenshot.getCurrentView(driver,"signinPage");
    //    FilePaths.getFile(File.ENV);
    //    driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.id("userid"))).click();
    //    Screenshot.getCurrentView(driver,"withOutuserId");
    //
    LinkedList<String> list = new LinkedList<String>();

    // Adding elements to the LinkedList using add() method
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");

    int k = list.size();
    for (int i = 0; i < k; i++) {
      list.add(k - i, list.get(0));
      list.remove();
    }
    System.out.println(list);
}
  @AfterTest
  public void tearDown(){
    driver.quit();
  }
}
