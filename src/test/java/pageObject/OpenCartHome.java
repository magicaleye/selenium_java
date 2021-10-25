package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartHome {
  WebDriver driver;

  By btnMyAccount = By.xpath("//a[@title='My Account']");
  By btnRegister = By.xpath("//a[contains(text(), 'Register')]");
  By btnLogin = By.xpath("//a[contains(text(), 'Login')]");
  By btnWishList = By.id("wishlist-total");
  By btnShoppingCart = By.xpath("//a[@title='Shopping Cart']");
  By btnCheckout = By.xpath("//a[@title='Checkout']");
  By btnCurrency = By.id("form-currency");
  By txtSearch = By.xpath("//input[@name='search']");
  By txtEmail = By.id("input-email");
  By txtPassword = By.id("input-password");
  By btnUserLogin = By.xpath("//input[@type='submit']");
  By labelViewOrderHistory = By.xpath("//a[contains(text(), 'View your order history')]");

  public OpenCartHome(WebDriver driver) {
    this.driver = driver;
  }

  public void userEnterCredentials(String email, String password) {
    driver.findElement(btnMyAccount).click();
    driver.findElement(btnLogin).click();
    driver.findElement(txtEmail).sendKeys(email);
    driver.findElement(txtPassword).sendKeys(password);
  }

  public void userLogin() {
    driver.findElement(btnUserLogin).click();
  }

  public boolean isUserLoggedIn() {
    return driver.findElement(labelViewOrderHistory).isDisplayed();
  }
}
