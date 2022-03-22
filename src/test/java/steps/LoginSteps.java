package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MainPage;
import pojo.LoginDataContainer;
import utilities.Driver;

import java.util.List;

public class LoginSteps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Given("^User navigates to \"([^\"]*)\"$")
    public void user_navigates_to_automationpractice_com(String url)  {
        driver.get(url);
    }

    @When("^User clicks on sign in button$")
    public void user_clicks_on_sign_in_button()  {
        mainPage.signInFromMainPage();

    }

    @Then("^User launches to Login Page$")
    public void user_launches_to_Login_Page() {

    }

    @Then("^User logins with invalid credentials$")
    public void user_logins_with_invalid_credentials(List<LoginDataContainer> loginData) {
        loginPage.login(loginData.get(0).getEmailAddress(),loginData.get(0).getPassword());

    }

    @When("^User clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() {


    }

    @Then("^User should see \"([^\"]*)\", \"([^\"]*)\" error messages$")
    public void user_should_see_error_message(String expectedErrorMessage, String expectedErrorMessage2)  {
        WebElement actualErrorMessage = loginPage.getErrorMessage1();
        WebElement actualErrorMessage2 = loginPage.getErrorMessage2();

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage.getText());
        Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2.getText());
    }




}
