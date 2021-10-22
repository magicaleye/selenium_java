import PageObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMS_Test {
  public static void main(String[] args) throws InterruptedException {
    // Set custom webDriver sysEnv
    //    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver/geckodriver.exe");
    //    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver/geckodriver");
    //    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
    //    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver");
    // Set custom webDriver sysEnv
    WebDriver driver = new FirefoxDriver();
    driver.get("http://192.168.67.35/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath(LoginPage.Screen.txtBoxUsername)).sendKeys("ptqanh");
    driver.findElement(By.xpath(LoginPage.Screen.txtBoxPassword)).sendKeys("123456a@");
    driver.findElement(By.xpath(LoginPage.Screen.btnLogin)).click();
//    Thread.sleep(5000);
//    driver.close();
//    driver.quit();
  }
}
