package orange.hrm.test;

import PageObject.OrangeLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
  public static void main(String[] args) throws InterruptedException {
    loginToMainPage();
  }

  public static void loginToMainPage() throws InterruptedException {
    // Set custom webDriver sysEnv
//    System.setProperty("webdriver.gecko.driver", "drivers/win/geckodriver/geckodriver.exe");
//    System.setProperty("webdriver.gecko.driver", "drivers/mac/geckodriver/geckodriver");
//    System.setProperty("webdriver.chrome.driver", "drivers/win/chromedriver/chromedriver.exe");
//    System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com//");
    driver.manage().window().maximize();
    driver.findElement(By.xpath(OrangeLoginPage.Screen.txtBoxUsername)).sendKeys("Admin");
    driver.findElement(By.xpath(OrangeLoginPage.Screen.txtBoxPassword)).sendKeys("admin123");
//    driver.findElement(By.xpath(OrangeLoginPage.Screen.btnLogin)).click();
    driver.findElement(By.xpath(OrangeLoginPage.Screen.txtBoxPassword)).sendKeys(Keys.RETURN);
    Thread.sleep(5000);
    driver.close();
    driver.quit();
    System.out.println("Test completed");
  }
}
