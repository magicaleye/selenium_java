package opencart.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pageObject.OpenCartHome;

public class Login {
  WebDriver driver = new FirefoxDriver();
  ExtentSparkReporter reporter;
  ExtentReports extent;

  @BeforeSuite
  public void suiteSetup() {
    reporter = new ExtentSparkReporter("./report/index.html");
    extent = new ExtentReports();
    extent.attachReporter(reporter);
  }

  @BeforeTest
  public void testSetup() {
    // Set custom webDriver sysEnv
    System.setProperty("webdriver.gecko.driver", "drivers/win/geckodriver/geckodriver.exe");
    System.setProperty("webdriver.gecko.driver", "drivers/mac/geckodriver/geckodriver_mac");
    System.setProperty("webdriver.chrome.driver", "drivers/win/chromedriver/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", "drivers/mac/chromedriver/chromedriver_mac");
    driver.get("http://localhost/");
    driver.manage().window().maximize();
  }

  @Test
  public void userLogin() throws Exception {
    ExtentTest test = extent.createTest("Login test");
    OpenCartHome loginPageObject = new OpenCartHome(driver);
    test.log(Status.INFO, "Test start");
    loginPageObject.userEnterCredentials("hieudoquang@gmail.com", "Hieu1234");
    loginPageObject.userLogin();
    loginPageObject.isUserLoggedIn();
    test.pass("Login successful");
  }

  @AfterTest
  public void testTeardown() {
    driver.quit();
  }

  @AfterSuite
  public void suiteTeardown() {
    extent.flush();
  }
}
