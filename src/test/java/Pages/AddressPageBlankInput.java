package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.FirstAddressPageObject.*;
import static ObjectRepository.FirstAddressPageObject.errorMessage;
import static org.testng.Assert.assertTrue;

public class AddressPageBlankInput {
    public void testingByBlankField(WebDriver driver) {
        CommonMethod.Clear(firstName, driver);
        CommonMethod.Clear(lastName, driver);
        CommonMethod.sendData(firstName, driver, "");
        CommonMethod.sendData(lastName, driver, "");
        CommonMethod.sendData(companyName, driver, "");
        CommonMethod.sendData(address1, driver, "");
        CommonMethod.sendData(address2, driver, "");
        CommonMethod.sendData(cityName, driver, "");
        CommonMethod.sendData(stateName, driver, "");
        CommonMethod.sendData(postalCode, driver, "");
        CommonMethod.sendData(stateName, driver, "");
        CommonMethod.sendData(postalCode, driver, "");
        CommonMethod.sendData(countryName, driver, "");
        CommonMethod.sendData(phone, driver, "");
        CommonMethod.sendData(homePhone, driver, "");
        CommonMethod.sendData(additionalAddress, driver, "");
        CommonMethod.sendData(assignAddressTitle, driver, "");
        assertTrue(CommonMethod.ButtonEnableOrNot(saveButton, driver), "Button is not enable");
        CommonMethod.click(saveButton, driver);
        CommonMethod.verifyElementsPesent(errorMessage, driver);
        assertTrue(CommonMethod.messageDisply(errorMessage, driver), "Address added");
    }

}
