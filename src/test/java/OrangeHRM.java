import PageObject.HRMS_LoginPage;
import PageObject.OrangeLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {
  public static void main(String[] args) throws InterruptedException {
    // Set custom webDriver sysEnv
//    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver/geckodriver.exe");
    //    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver/geckodriver");
    //    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
    //    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver");
    // Set custom webDriver sysEnv
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com//");
    driver.manage().window().maximize();
    driver.findElement(By.xpath(OrangeLoginPage.Screen.txtBoxUsername)).sendKeys("Admin");
    driver.findElement(By.xpath(OrangeLoginPage.Screen.txtBoxPassword)).sendKeys("admin123");
    driver.findElement(By.xpath(OrangeLoginPage.Screen.btnLogin)).click();
    //    Thread.sleep(5000);
        driver.close();
        driver.quit();
  }
}
