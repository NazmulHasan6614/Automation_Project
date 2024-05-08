package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.FirstAddressPageObject.*;
import static ObjectRepository.FirstAddressPageObject.assignAddressTitle;
import static org.testng.Assert.assertTrue;

public class AddressPageElementVerify {
    public void elementPresent(WebDriver driver) {
        CommonMethod.waitForElementVisibility(myFirstAddress, driver);
        CommonMethod.click(myFirstAddress, driver);
        assertTrue(CommonMethod.verifyElementsPesent(firstName, driver));
        assertTrue(CommonMethod.verifyElementsPesent(lastName, driver));
        assertTrue(CommonMethod.verifyElementsPesent(companyName, driver));
        assertTrue(CommonMethod.verifyElementsPesent(address1, driver));
        assertTrue(CommonMethod.verifyElementsPesent(address2, driver));
        assertTrue(CommonMethod.verifyElementsPesent(cityName, driver));
        // assertTrue(CommonMethod.verifyElementsPesent(stateName,driver));
        assertTrue(CommonMethod.verifyElementsPesent(postalCode, driver));
        // assertTrue(CommonMethod.verifyElementsPesent(countryName,driver));
        assertTrue(CommonMethod.verifyElementsPesent(phone, driver));
        assertTrue(CommonMethod.verifyElementsPesent(homePhone, driver));
        assertTrue(CommonMethod.verifyElementsPesent(additionalAddress, driver));
        assertTrue(CommonMethod.verifyElementsPesent(assignAddressTitle, driver));

    }
}
