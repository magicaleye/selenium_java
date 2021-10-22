package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLoginPage {
  public static WebElement element = null;

  public static WebElement txtUsername(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@name='txtUsername']"));
    return element;
  }

  public static WebElement txtPassword(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@name='txtPassword']"));
    return element;
  }

  public static WebElement btnLogin(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@type='submit']"));
    return element;
  }
}
