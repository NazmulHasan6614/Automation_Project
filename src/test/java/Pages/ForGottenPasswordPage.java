package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.AutomationPracticeRegistrationPageObject.SignIn;
import static ObjectRepository.LogInPageObject.*;
import static ObjectRepository.LogInPageObject.confirmationMessage;
import static org.testng.Assert.assertTrue;

public class ForGottenPasswordPage {
    public void testForgottenPassField(WebDriver driver) {

        CommonMethod.click(forgottenPassword, driver);
        CommonMethod.sendData(EmailAddress, driver, validMail);
        assertTrue(CommonMethod.ButtonEnableOrNot(retrievePassword, driver));
        CommonMethod.click(retrievePassword, driver);
        CommonMethod.waitForElementVisibility(confirmationMessage, driver);
        assertTrue(CommonMethod.messageDisply(confirmationMessage, driver), "Password is reset not possible");


    }
}
