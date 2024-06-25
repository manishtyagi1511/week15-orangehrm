package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {
    public static final Logger log= LogManager.getLogger(DashboardPage.class);
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOut;


    public void clickOnUserLogo(){
        log.info("clicking on user link"+ userLogo.toString());
        //CustomListeners.test.log(Status.PASS,"CLicking on userlogo"+userLogo);
        clickOnElement(userLogo);
    }
    public void clickOnLogout(){
        log.info("clicking on logout button" + logOut.toString());
        //CustomListeners.test.log(Status.PASS,"Clicking on logout "+ logOut);
        mouseHoverToElementAndClick(logOut);
    }
}
