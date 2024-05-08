package Tests;

import Pages.RegistrationWithValidEmailAndInformation;
import org.testng.annotations.Test;

public class ValidEmailAndInformationRegistrationTestCase extends Base {
    RegistrationWithValidEmailAndInformation
    registrationObject=new RegistrationWithValidEmailAndInformation();
    @Test
    public void validRegistration()
    {
        registrationObject.inputValidEmailAndPersonalInformation(driver);
    }
}
