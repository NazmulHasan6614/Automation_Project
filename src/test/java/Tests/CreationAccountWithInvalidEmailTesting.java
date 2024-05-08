package Tests;

import Pages.CreateAccountAndLogInPageElementVerify;
import Pages.CreateAccountWithInvalidEmail;
import org.testng.annotations.Test;

public class CreationAccountWithInvalidEmailTesting extends Base{
    CreateAccountWithInvalidEmail
    createAccountObject=new CreateAccountWithInvalidEmail();

    @Test
    public  void verifyAccountCreation()
    {
        createAccountObject.inputInvalidEmail(driver);

    }


}
