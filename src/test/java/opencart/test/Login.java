package opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.OpenCartHome;

public class Login {
  WebDriver driver = new ChromeDriver();

  @BeforeTest
  public void testSetup() {
    driver.get("http://localhost/");
    driver.manage().window().maximize();
  }

  @Test
  public void userLogin() {
    OpenCartHome loginPageObject = new OpenCartHome(driver);
    loginPageObject.userEnterCredentials("hieudoquang@gmail.com", "Hieu1234");
    loginPageObject.userLogin();
    loginPageObject.isUserLoggedIn();
  }

  @AfterTest
  public void testTeardown() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
  }
}
