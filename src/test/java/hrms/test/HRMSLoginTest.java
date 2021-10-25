package hrms.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.HrmsLoginPageObject;

public class HRMSLoginTest {

  public static void main(String[] args) throws InterruptedException {
    userLogin();
  }

  public static void userLogin() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    HrmsLoginPageObject loginPageObject = new HrmsLoginPageObject(driver);

    driver.get("http://192.168.67.35/");
    loginPageObject.enterLoginCredentials("ptqanh", "123456a@");
    loginPageObject.clickLoginButton();
    Thread.sleep(6000);
    driver.close();
  }
}
