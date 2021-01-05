package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class MainPage extends BasePage {

  public void openMainPage() {
    getDriver().get("https://rozetka.com.ua/");
  }

  public void check_meta(String text) throws Throwable {
   Assert.assertTrue( driver.findElement(By.cssSelector("meta")).getAttribute("content").contains(text) );

}}

