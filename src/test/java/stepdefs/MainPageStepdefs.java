package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MainPage;

public class MainPageStepdefs {
    MainPage mainPage = new MainPage();
    
    
    @Given("I open main page")
    public void iOpenMainPage() {
        mainPage.openMainPage();

    }


    @Then("I check that text {string} exist on the main page")
    public void iCheckThatTextДоставкаПоВсейУкраинеExistOnTheMainPage(String text) throws Throwable {
       mainPage.check_meta(text);    }
}
