package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HrmsLoginPageObject {

  WebDriver driver = null;

  By txtBoxUsername = By.xpath("//input[@id='normal_login_username']");
  By txtBoxPassword = By.xpath("//input[@id='normal_login_password']");

  public HrmsLoginPageObject(WebDriver driver) {
    this.driver = driver;
  }

  public void enterLoginCredentials(String username, String password) {
    driver.findElement(txtBoxUsername).sendKeys(username);
    driver.findElement(txtBoxPassword).sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(txtBoxPassword).sendKeys(Keys.RETURN);
  }
}
