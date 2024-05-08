package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.LogInPageObject.*;
import static ObjectRepository.LogInPageObject.Paass_Field;
import static org.testng.Assert.assertTrue;

public class
LogInWithInvalidEmailAndPass {
    public void inValidInput(WebDriver driver) {
        CommonMethod.sendData(EmailAddress, driver, inValidMail);
        CommonMethod.sendData(Paass_Field, driver, inValidPassword);
        CommonMethod.click(submitLogin, driver);
        assertTrue(CommonMethod.messageDisply(errorMessage, driver), "Error message should be displayed for invalid credential");
        CommonMethod.Clear(EmailAddress, driver);
        CommonMethod.Clear(Paass_Field, driver);
    }
}
