package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class TC004AddressPageTestCase extends Base {
    AddressPageElementVerify
    addressElementObject=new AddressPageElementVerify();
    AddressPageBlankInput
    blankObject=new AddressPageBlankInput();
    AddressPageValidInput
    validInputObject=new AddressPageValidInput();
    LogInWithValidCredentials
            validObject=new LogInWithValidCredentials();

    @Test(priority = 1)
    public void validInput()
    {

        validObject.loginWithValidInput(driver);
        /*There is a function named CommonMethod.click(SignIn,driver); in LogInWithValidCredentials page
        has to be active  */

    }

    @Test(priority = 2)
    public void elementsVerifyOfAddressPage()
    {

        addressElementObject.elementPresent(driver);
    }
    @Test(priority = 3)
    public void blankInputInAddressPage()
    {
        blankObject.testingByBlankField(driver);
    }
    @Test(priority = 4)
    public void validInputTestCase()
    {
        validInputObject.testingByValidData(driver);
    }


}
