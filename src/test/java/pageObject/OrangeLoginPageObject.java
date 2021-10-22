package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeLoginPageObject {
  WebDriver driver;

  By txtBoxUsername = By.id("txtUsername");
  By txtBoxPassword = By.id("txtPassword");
  By btnLogin = By.id("btnLogin");

  public OrangeLoginPageObject(WebDriver driver) {
    this.driver = driver;
  }

  public void userEnterCredentials(String username, String password) {
    driver.findElement(txtBoxUsername).sendKeys(username);
    driver.findElement(txtBoxPassword).sendKeys(password);
  }

  public void userLogin() {
    driver.findElement(btnLogin).click();
  }
}
