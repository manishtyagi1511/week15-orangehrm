package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTest {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I enter email {string} in email field")
    public void iEnterEmailInEmailField(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string} in password field")
    public void iEnterPasswordInPasswordField(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login page successfully")
    public void iShouldLoginPageSuccessfully() {
        String expectedMessage = "Dashboard";
        String actualMessage=new HomePage().getWelcomeText();
        Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }

    @Then("the logo is displayed successfully")
    public void theLogoIsDisplayedSuccessfully() {
        Assert.assertEquals(true,new HomePage().getlogo());
    }

    @And("I click on  user prfile logo")
    public void iClickOnUserPrfileLogo() throws InterruptedException {
        Thread.sleep(2000);
        new DashboardPage().clickOnUserLogo();



    }

    @And("I mouse hover and click on logout button")
    public void iMouseHoverAndClickOnLogoutButton() throws InterruptedException {
        Thread.sleep(2000);
        new DashboardPage().clickOnLogout();
    }

    @Then("I should log out successfully")
    public void iShouldLogOutSuccessfully() {
        Assert.assertEquals("Login",new LoginPage().getLoginText());
    }


    @Then("I should not login successfully{string}")
    public void iShouldNotLoginSuccessfully(String error) {

        // String expectedMessage = "Invalid credentials";
        String actualMessage = new HomePage().errorMessage();
        Assert.assertEquals(actualMessage, error, "Error message not displayed");

    }
}
