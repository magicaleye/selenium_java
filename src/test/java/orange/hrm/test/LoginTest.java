package orange.hrm.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.OrangeLoginPage;
import pageObject.OrangeLoginPageObject;

public class LoginTest {

  private static WebDriver driver = null;

  public static void main(String[] args) throws InterruptedException {
    loginToMainPage();
  }

  public static void loginToMainPage() throws InterruptedException {
    driver = new ChromeDriver();
    OrangeLoginPageObject loginPgObj = new OrangeLoginPageObject(driver);
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    loginPgObj.userEnterCredentials("dqhieu", "Hieu_263@@");
    loginPgObj.userLogin();

    Thread.sleep(5000);
    driver.close();
    driver.quit();
  }
}
