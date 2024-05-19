package Tests;


import Pages.CreateAccountAndLogInPageElementVerify;
import Pages.CreateAccountWithInvalidEmail;
import Pages.RegistrationWithValidEmailAndInformation;
import org.testng.annotations.Test;

public class TC003AccountRegistrationTest extends Base {
    RegistrationWithValidEmailAndInformation
    registrationObject=new RegistrationWithValidEmailAndInformation();
    CreateAccountWithInvalidEmail
            createAccountObject=new CreateAccountWithInvalidEmail();
    CreateAccountAndLogInPageElementVerify
            elementObject=new CreateAccountAndLogInPageElementVerify();
    @Test(priority = 1)
    public void verifyElementFirstPage()
    {
        elementObject.verifyElements(driver);


    }


    @Test(priority =2)
    public  void verifyAccountCreation()
    {

        createAccountObject.inputInvalidEmail(driver);

    }
    @Test(priority = 3)
    public void validRegistration()
    {
        registrationObject.inputValidEmailAndPersonalInformation(driver);
    }
}
