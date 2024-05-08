package Pages;

import Library.CommonMethod;
import ObjectRepository.LogInPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ObjectRepository.LogInPageObject.*;

public class LogInWithValidEmailAndInvalidPass {
    public void testValidUsernameInvalidPassword(WebDriver driver) {
        CommonMethod.sendData(EmailAddress, driver, validMail);
        CommonMethod.sendData(Paass_Field, driver, inValidPassword);
        CommonMethod.click(submitLogin, driver);
        Assert.assertTrue(CommonMethod.messageDisply(LogInPageObject.errorMessage, driver), "Error message should be displayed for invalid credential");
        CommonMethod.Clear(EmailAddress, driver);
        CommonMethod.Clear(Paass_Field, driver);

    }
}
