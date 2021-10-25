package orange.hrm.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.OrangeLoginPage;
import pageObject.OrangeLoginPageObject;

import java.util.concurrent.TimeUnit;

public class LoginTest {

  public static void main(String[] args) throws InterruptedException {
    loginToMainPage();
  }

  public static void loginToMainPage() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    OrangeLoginPageObject loginPgObj = new OrangeLoginPageObject(driver);
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    driver.manage().window().maximize();

    loginPgObj.userEnterCredentials("admin", "admin123");
    loginPgObj.userLogin();

    Thread.sleep(5000);
    driver.close();
    driver.quit();
  }
}
