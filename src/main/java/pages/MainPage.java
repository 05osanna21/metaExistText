package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;


@Getter
public class MainPage extends BasePage {

  public void openMainPage() {
    getDriver().get("https://rozetka.com.ua/");
  }

  public void check_meta(String text) throws Throwable {
   Assert.assertTrue( driver.findElement(By.cssSelector("meta")).getAttribute("content").contains(text) );

}}

