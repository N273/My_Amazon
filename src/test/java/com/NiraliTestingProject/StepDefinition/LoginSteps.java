package com.NiraliTestingProject.StepDefinition;

import com.NiraliTestingProject.WebPages.HomePage;
import com.NiraliTestingProject.WebPages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;

public class LoginSteps {
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("^User is on homePage$")
    public void user_is_on_homePage() throws Throwable {
        System.out.println("it is homepage");

    }

    @When("^User clicks on menu Button$")
    public void user_clicks_on_menu_Button() throws Throwable {
        homepage.clickOnMenu();

    }

    @When("^User selects sign in from dropdown menu$")
    public void user_selects_sign_in_from_dropdown_menu() throws Throwable {
          homepage.clickSiginMenu();
    }

    @When("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        String actual = loginPage.getCurrentUrl();
        assertThat(actual, is(endsWith("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_37")));

    }

    @Then("^user enters valid \"([^\"]*)\"$")
    public void user_enters_valid(String arg1) throws Throwable {
        loginPage.enterEmail();
    }

    @Then("^user clicks on continue button$")
    public void user_clicks_on_continue_button() throws Throwable {
        loginPage.clickContinue();

    }

    @Then("^User has logged in successfully$")
    public void user_has_logged_in_successfully() throws Throwable {
      System.out.println("I have logged in successfully");
    }

}
