package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSystemUserPage extends Utility {
    public static final Logger log = Logger.getLogger(ViewSystemUserPage.class);
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemText;


    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div")
    List<WebElement> userRecordList;

    //user checkbox
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement userCheckbox;

    //delete user
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteUser;
    //confirmdeletButton
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement confirmdeleteButton;
    // delete message
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement deleteMessage;

    //Reser button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;



    public String getSystemText() {
        log.info("Verify text " + systemText.toString());
        //CustomListeners.test.log(Status.PASS,"verify the text ");
        return getTextFromElement(systemText);
    }

    public void verifyUser(String role) {
        log.info("Verify the user " + role.toString());
        //
        for (WebElement suggestion : userRecordList) {
            if (suggestion.getText().equals(role)) {
                break;
            }
        }
    }

    public void clickOnUserCheckbox(){
        log.info("clicked on checkbox");

        clickOnElement(userCheckbox);
    }

    public void clickOnDeleteUser(){
        log.info("clicked on delete user");

        clickOnElement(deleteUser);
    }

    public void clickOnPopUp(){
        log.info("clicked on confirmed delete ");

        clickOnElement(confirmdeleteButton);
    }

    public String getDeleteSuccessMessage(){
        log.info("Verify the deleted message ");

        return getTextFromElement(deleteMessage);
    }
    public void clickOnReset(){
        log.info("clicked on reset button ");

        clickOnElement(resetButton);
    }


}
