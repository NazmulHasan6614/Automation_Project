package Tests;

import Pages.ForGottenPasswordPage;
import org.testng.annotations.Test;

public class ForgottenPasswordTesting extends Base{
    ForGottenPasswordPage
    forgottenPassObject=new ForGottenPasswordPage();
    @Test
    public void ForGottenPasswordTestCase()
    {
        forgottenPassObject.testForgottenPassField(driver);
    }
}
