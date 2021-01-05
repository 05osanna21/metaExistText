package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

  protected static WebDriver driver;

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }

  public static WebDriver getDriver() {
    return driver;
  }


}
