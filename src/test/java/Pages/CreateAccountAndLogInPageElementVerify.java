package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.AutomationPracticeRegistrationPageObject.*;
//import static ObjectRepository.AutomationPracticeRegistrationPageObject.SignIn_Button;
import static org.testng.Assert.assertTrue;

public class CreateAccountAndLogInPageElementVerify {
    public void verifyElements(WebDriver driver) {
        CommonMethod.click(SignIn, driver);
        assertTrue(CommonMethod.verifyElementsPesent(Email_Field, driver));
        assertTrue(CommonMethod.verifyElementsPesent(EmailAddress, driver));
        assertTrue(CommonMethod.verifyElementsPesent(Paass_Field, driver));
        assertTrue(CommonMethod.ButtonEnableOrNot(Create_Account_Button, driver));
        assertTrue(CommonMethod.ButtonEnableOrNot(SignIn_Button, driver));


    }
}
