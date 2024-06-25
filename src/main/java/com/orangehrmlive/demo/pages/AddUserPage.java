package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddUserPage extends Utility {
    public static final Logger log=Logger.getLogger(AddUserPage.class);
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addText;
    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> statusOptions;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Status')]/following::div[1]")
    WebElement userStatusDropdown;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'User Role')]/following::div[1]")
    WebElement userRoleDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> dropdownOptionsUser;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement enterUserName;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement saveButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> employeeNameSuggestions;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement searchText;
    public void clickOnAddButton(){
        log.info("CLick on add button ");
        //CustomListeners.test.log(Status.PASS,"Click on add button ");
        clickOnElement(addButton);
    }
    public String getAddText(){
        log.info("Verify text "+ addText.toString());
        //CustomListeners.test.log(Status.PASS,"verify the add user text ");
        return getTextFromElement(addText);
    }
    public void selectUserRole(String role) {
        log.info("select text "+ role.toString());
        //CustomListeners.test.log(Status.PASS,"select the user role "+role);
        userRoleDropdown.click();
        for (WebElement option : dropdownOptionsUser) {
            if (option.getText().equals(role)) {
                option.click();
                break;
            }
        }
    }
    public void selectUserStatus(String role) throws InterruptedException {
        log.info("select user status "+ role.toString());
        //CustomListeners.test.log(Status.PASS,"select user status  "+role);
        userStatusDropdown.click();
        Thread.sleep(2000);
        for (WebElement option : statusOptions) {
            if (option.getText().equals(role)) {
                option.click();
                break;
            }
        }
    }
    public void enterEmployeeName(String employeeName) {
        log.info("send emplyee name  "+ employeeName.toString());
        //CustomListeners.test.log(Status.PASS,"select employee name "+employeeName);
        sendTextToElement(employeeNameField,employeeName);
    }
    public void selectEmployeeRole(String role) {
        log.info("select employee role "+ role.toString());
        // CustomListeners.test.log(Status.PASS,"select the employee role "+role);
        for (WebElement suggestion : employeeNameSuggestions) {
            if (suggestion.getText().equals(role)) {
                suggestion.click();
                break;
            }
        }
    }

    public void enterUserName(String name){
        log.info("send the user name "+ name.toString());
        //CustomListeners.test.log(Status.PASS,"enter the user name "+name);
        sendTextToElement(enterUserName,name);
    }
    public void enterPassword(String name){
        log.info("enter the password"+ name.toString());
        // CustomListeners.test.log(Status.PASS,"enter the password "+name);
        sendTextToElement(enterPassword,name);
    }
    public void enterConfirmPassword(String name){
        log.info("enter the confirmed password"+ name.toString());
        //CustomListeners.test.log(Status.PASS,"enter the confrimed password "+name);
        sendTextToElement(enterConfirmPassword,name);
    }
    public void clickOnSave(){
        log.info("click on save button");

        clickOnElement(saveButton);
    }
    public void clickOnSearchButton(){
        log.info("clicked on the seach button ");
        //CustomListeners.test.log(Status.PASS,"clicked on search ");
        clickOnElement(searchButton);
    }
    public String getSavedMessage(){
        log.info("get saved message"+successMessage.toString());

        return getTextFromElement(successMessage);
    }
    public String getSeachText(){
        log.info("Verify the text ");
        //CustomListeners.test.log(Status.PASS,"verified text");
        return getTextFromElement(searchText);
    }
}
