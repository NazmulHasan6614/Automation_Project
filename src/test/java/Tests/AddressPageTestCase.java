package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class AddressPageTestCase extends Base {
    AddressPageElementVerify
    addressElementObject=new AddressPageElementVerify();
    AddressPageBlankInput
    blankObject=new AddressPageBlankInput();
    AddressPageValidInput
    validInputObject=new AddressPageValidInput();
    LogInWithValidCredentials
            validObject=new LogInWithValidCredentials();
    CreateAccountAndLogInPageElementVerify
            elementObject=new CreateAccountAndLogInPageElementVerify();

    @Test(priority = 1)
    public void elementsVerifyOfAddressPage()
    {

        addressElementObject.elementPresent(driver);
    }
    @Test(priority = 2)
    public void blankInputInAddressPage()
    {
        blankObject.testingByBlankField(driver);
    }
    @Test(priority = 3)
    public void validInputTestCase()
    {
        validInputObject.testingByValidData(driver);
    }


}
