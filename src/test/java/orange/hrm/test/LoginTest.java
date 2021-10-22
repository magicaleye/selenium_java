package orange.hrm.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    driver.get("https://opensource-demo.orangehrmlive.com//");
    driver.manage().window().maximize();

    OrangeLoginPage.txtUsername(driver).sendKeys("admin");
    Thread.sleep(3000);
    OrangeLoginPage.txtPassword(driver).sendKeys("admin123");
    Thread.sleep(3000);
//    driver.findElement(By.xpath(OrangeLoginPage.Screen.btnLogin)).click();
    OrangeLoginPage.txtPassword(driver).sendKeys(Keys.RETURN);
    Thread.sleep(3000);

    driver.close();
    driver.quit();
    System.out.println("Test completed");
  }
}
