package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.AutomationPracticeRegistrationPageObject.*;
import static ObjectRepository.AutomationPracticeRegistrationPageObject.errorMessage;
import static org.testng.Assert.assertTrue;

public class CreateAccountWithInvalidEmail {
    public void inputInvalidEmail(WebDriver driver)
    {
        // CommonMethod.Clear(Email_Field,driver);

        CommonMethod.Clear(Email_Field,driver);
        CommonMethod.sendData(Email_Field, driver,unValidEmailAddress);
        CommonMethod.click(Create_Account_Button,driver);
        assertTrue(CommonMethod.messageDisply(errorMessage,driver),"Error message should be displayed for invalid email ID");
    }
}
