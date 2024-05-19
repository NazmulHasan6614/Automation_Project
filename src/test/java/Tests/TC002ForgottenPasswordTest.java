package Tests;

import Pages.CreateAccountAndLogInPageElementVerify;
import Pages.ForGottenPasswordPage;
import org.testng.annotations.Test;

public class TC002ForgottenPasswordTest extends Base{
    ForGottenPasswordPage
    forgottenPassObject=new ForGottenPasswordPage();
    CreateAccountAndLogInPageElementVerify
            elementObject=new CreateAccountAndLogInPageElementVerify();

    @Test(priority = 1)
    public void verifyElementFirstPage()
    {
        elementObject.verifyElements(driver);


    }
    @Test
    public void ForGottenPasswordTestCase()
    {
        forgottenPassObject.testForgottenPassField(driver);
    }
}
