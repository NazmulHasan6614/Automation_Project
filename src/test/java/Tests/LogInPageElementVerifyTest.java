package Tests;

import Pages.CreateAccountAndLogInPageElementVerify;
import Pages.ForGottenPasswordPage;
import Pages.RegistrationWithValidEmailAndInformation;
import org.testng.annotations.Test;

public class LogInPageElementVerifyTest extends Base {
    CreateAccountAndLogInPageElementVerify
    elementObject=new CreateAccountAndLogInPageElementVerify();


    @Test(priority = 1)
    public void verifyElementFirstPage()
    {
        elementObject.verifyElements(driver);


    }
    @Test(priority = 2)
    public void tearTest()
    {
        driver.quit();
    }

}
