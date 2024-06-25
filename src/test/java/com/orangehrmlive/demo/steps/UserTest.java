package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UserTest {
    @And("I click on admin button")
    public void iClickOnAdminButton() {
        new AdminPage().clickOnAdminButton();

    }

    @And("I should reach admin page successfully")
    public void iShouldReachAdminPageSuccessfully() {
        String expectedMessage = "System Users";
        String actualMessage = new ViewSystemUserPage().getSystemText();
        Assert.assertEquals(actualMessage, expectedMessage, "Not verify");
    }

    @And("I click on add button")
    public void iClickOnAddButton() {
        new AddUserPage().clickOnAddButton();
    }

    @And("I should reach add option successfully")
    public void iShouldReachAddOptionSuccessfully() {

        Assert.assertEquals("Add User", new AddUserPage().getAddText(), "Not matched");
    }

    @And("I select the user role{string}")
    public void iSelectTheUserRole(String role) {
        new AddUserPage().selectUserRole(role);
    }

    @And("I enter employee name {string}")
    public void iEnterEmployeeName(String empName) throws InterruptedException {
        new AddUserPage().enterEmployeeName(empName);
        Thread.sleep(2000);
        new AddUserPage().selectEmployeeRole(empName);
    }

    @And("I select status {string}")
    public void iSelectStatus(String status) throws InterruptedException {
        Thread.sleep(2000);
        new AddUserPage().selectUserStatus(status);
    }

    @And("I enter the password{string}")
    public void iEnterThePassword(String pass) {
        new AddUserPage().enterPassword(pass);
    }

    @And("I enter confirm Password{string}")
    public void iEnterConfirmPassword(String ConfirmPass) {
        new AddUserPage().enterConfirmPassword(ConfirmPass);
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSave();
    }

    @Then("I should saved user successfully")
    public void iShouldSavedUserSuccessfully() {

        Assert.assertEquals( new AddUserPage().getSavedMessage(),"Successfully Saved", "error message");
    }

    @And("I enter username {string}")
    public void iEnterUsername(String userName) {
        new AddUserPage().enterUserName(userName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new AddUserPage().clickOnSearchButton();
    }

    @Then("I should check user should in results")
    public void iShouldCheckUserShouldInResults() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new AddUserPage().getSeachText(),"(1) Record Found");

    }

    @And("I click on check button")
    public void iClickOnCheckButton() throws InterruptedException {
        Thread.sleep(1000);
        new ViewSystemUserPage().clickOnUserCheckbox();
    }

    @And("I click on delete button")
    public void iClickOnDeleteButton() {
        new ViewSystemUserPage().clickOnDeleteUser();
    }

    @And("I click on popup display")
    public void iClickOnPopupDisplay() {
        new ViewSystemUserPage().clickOnPopUp();
    }

    @Then("I should successfully deleted the user")
    public void iShouldSuccessfullyDeletedTheUser() {
        // verify the message of delete
        System.out.println();
        Assert.assertEquals(new ViewSystemUserPage().getDeleteSuccessMessage(),"Successfully Deleted","error message");
    }

    @Then("I should succeessfully check my name here{string}")
    public void iShouldSucceessfullyCheckMyNameHere(String user) {
        new ViewSystemUserPage().verifyUser(user);

    }

    @And("I click on reset tab")
    public void iClickOnResetTab() {
        new ViewSystemUserPage().clickOnReset();
    }
}
