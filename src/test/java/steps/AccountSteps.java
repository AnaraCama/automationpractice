package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountPage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.util.Map;

public class AccountSteps {

    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    @When("^User creats a new account with following email$")

    public void user_creats_a_new_account_with_following_email(Map<String, String> emailMap) {
        String email = emailMap.get("email");
        loginPage.enterEmail(email);

    }

    @When("^User clicks on Create an account button$")
    public void user_clicks_on_Create_an_account_button() {
        loginPage.clickCreateAnAccountButton();

    }

    @Then("^User launches to Account page$")
    public void user_launches_to_Account_page() {
    }

    @Then("^User creates an account with following information$")
    public void user_creates_an_account_with_following_information(Map<String, String> userDetails) {
        accountPage.insertUserDetails(userDetails);

    }

    @Then("^User clicks on Register button$")
    public void user_clicks_on_Register_button() {
        accountPage.clickRegisterButton();
    }

    @Then("^User signs out$")
    public void user_signs_out() {
        myAccountPage.clickSignOutButton();
    }

    @Then("^User signs in with the newly created account$")
    public void user_signs_in_with_the_newly_created_account() {

    }



}
