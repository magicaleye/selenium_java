package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HrmsLoginPage {
  public static WebElement element = null;

  public static WebElement txtUsername(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@id='normal_login_username']"));
    return element;
  }

  public static WebElement txtPassword(WebDriver driver) {
    element = driver.findElement(By.xpath("//input[@id='normal_login_password']"));
    return element;
  }

  public static WebElement btnLogin(WebDriver driver) {
    element = driver.findElement(By.xpath("//button[@type='submit']"));
    return element;
  }
}
