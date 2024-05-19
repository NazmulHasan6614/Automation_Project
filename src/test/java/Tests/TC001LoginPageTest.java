package Tests;

import Pages.CreateAccountAndLogInPageElementVerify;
import Pages.LogInWithInvalidEmailAndPass;
import Pages.LogInWithValidCredentials;
import Pages.LogInWithValidEmailAndInvalidPass;
import org.testng.annotations.Test;

public class TC001LoginPageTest extends Base {
    LogInWithInvalidEmailAndPass
            invalidObject=new LogInWithInvalidEmailAndPass();
    LogInWithValidEmailAndInvalidPass
    validAndInvalidObject=new LogInWithValidEmailAndInvalidPass();
    LogInWithValidCredentials
    validObject=new LogInWithValidCredentials();
    CreateAccountAndLogInPageElementVerify
            elementObject=new CreateAccountAndLogInPageElementVerify();

    @Test(priority = 1)
    public void verifyElementFirstPage()
    {
        elementObject.verifyElements(driver);


    }
    @Test(priority = 2)
    public void invalidLogin()
    {

        invalidObject.inValidInput(driver);

    }

    @Test(priority = 3)
    public void validAndIvalidInput()
    {
        validAndInvalidObject.testValidUsernameInvalidPassword(driver);
    }
    @Test(priority = 4)
    public void validInput()
    {

        validObject.loginWithValidInput(driver);

    }
}
