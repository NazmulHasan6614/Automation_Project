package Pages;

import Library.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.LogInPageObject.*;
import static org.testng.Assert.assertTrue;

public class LogInWithValidCredentials {







    public void loginWithValidInput(WebDriver driver) {
       // CommonMethod.click(backToLogin, driver);
        CommonMethod.sendData(EmailAddress, driver, validMail);
        CommonMethod.sendData(Paass_Field, driver, validPassword);
        CommonMethod.waitForElementVisibility(signIN, driver);
        CommonMethod.doubleClick(signIN, driver);
       // CommonMethod.click(signIN, driver);
        CommonMethod.waitForElementVisibility(loginCofirmation, driver);
        assertTrue(CommonMethod.verifyElementsPesent(loginCofirmation, driver), "Login is not Successful");
        //  CommonMethod.click(backtoAccount, driver);


    }
/*
    public void checkingMyAddress(WebDriver driver) {


        CommonMethod.waitForElementVisibility(myAddress,driver);
        CommonMethod.click(myAddress,driver);
        if(CommonMethod.messageDisply(addressDeleteMessage,driver))
        {
            CommonMethod.click(backtoAccount,driver);
        }
        else
        {
            CommonMethod.waitForElementVisibility(deleteAddress1,driver);
            CommonMethod.click(deleteAddress1,driver);
            Alert alert = driver.switchTo().alert();
            alert.accept();// or alert.dismiss(), alert.getText()
            CommonMethod.waitForElementVisibility(addressDeleteMessage2,driver);
            if (CommonMethod.messageDisply(addressDeleteMessage2,driver))
            assertTrue(CommonMethod.messageDisply(addressDeleteMessage2,driver),"Address not deleted");
            // CommonMethod.click(getDeleteAddress2,driver);
            // Alert alt = driver.switchTo().alert();
            //   alt.accept(); // or alert.dismiss(), alert.getText()
            CommonMethod.click(backtoAccount,driver);
        }


        try {
            if (CommonMethod.messageDisply(addressDeleteMessage, driver)) {
                CommonMethod.click(backtoAccount, driver);
            } else {
                CommonMethod.waitForElementVisibility(deleteAddress1, driver);
                CommonMethod.click(deleteAddress1, driver);
                Alert alert = driver.switchTo().alert();
                alert.accept();
                CommonMethod.waitForElementVisibility(addressDeleteMessage2, driver);
                assertTrue(CommonMethod.messageDisply(addressDeleteMessage2, driver), "Address not deleted");
                CommonMethod.click(backtoAccount, driver);
            }
        } catch (NoSuchElementException e) {
            // Handle the exception or log the error message
            System.out.println("Element not found: " + e.getMessage());
        }
    }

    public void loginWithValidInputAgain(WebDriver driver) {
        // CommonMethod.click(backToLogin,driver);
        CommonMethod.sendData(EmailAddress, driver, validMail);
        CommonMethod.sendData(Paass_Field, driver, validPassword);
        CommonMethod.waitForElementVisibility(signIN, driver);
        CommonMethod.doubleClick(signIN, driver);
        CommonMethod.waitForElementVisibility(loginCofirmation, driver);
        assertTrue(CommonMethod.verifyElementsPesent(loginCofirmation, driver), "Login is not Successful");


    }

 */


}