package hrms.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.HrmsLoginPage;
import pageObject.OrangeLoginPage;

public class LoginTest {

  private static WebDriver driver = null;
  public static void main(String[] args) throws InterruptedException {
    loginToMainPage();
  }

  public static void loginToMainPage() throws InterruptedException {
    driver = new ChromeDriver();
    // Set custom webDriver sysEnv
//    System.setProperty("webdriver.gecko.driver", "drivers/win/geckodriver/geckodriver.exe");
//    System.setProperty("webdriver.gecko.driver", "drivers/mac/geckodriver/geckodriver");
//    System.setProperty("webdriver.chrome.driver", "drivers/win/chromedriver/chromedriver.exe");
//    System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver/chromedriver");

    driver.get("http://192.168.67.35/");
    driver.manage().window().maximize();

    HrmsLoginPage.txtUsername(driver).sendKeys("ptqanh");
    HrmsLoginPage.txtPassword(driver).sendKeys("123456a@");
    HrmsLoginPage.txtPassword(driver).sendKeys(Keys.RETURN);
    Thread.sleep(5000);

    driver.close();
    driver.quit();
    System.out.println("Test completed");
  }
}
