package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.FirstAddressPageObject.*;
import static org.testng.Assert.assertTrue;

public class AddressPageValidInput {







    public void testingByValidData(WebDriver driver) {

        CommonMethod.sendData(firstName, driver, nameOne);
        CommonMethod.sendData(lastName, driver, nameTwo);
        CommonMethod.sendData(companyName, driver, company);
        CommonMethod.sendData(address1, driver, firstAddress);
        CommonMethod.sendData(address2, driver, secondAddress);
        CommonMethod.sendData(cityName, driver, townName);
        CommonMethod.click(stateName, driver);
        CommonMethod.sendData(stateName, driver, text1);
        CommonMethod.pressEnter(stateName, driver);
        CommonMethod.sendData(postalCode, driver, postalData);
        CommonMethod.click(cityName, driver);
        CommonMethod.sendData(phone, driver, phoneOne);
        CommonMethod.sendData(homePhone, driver, phoneTwo);
        CommonMethod.sendData(additionalAddress, driver, addressOne);
        CommonMethod.sendData(assignAddressTitle, driver, addressTwo);
        CommonMethod.click(saveButton, driver);
        CommonMethod.verifyElementsPesent(webPageElement, driver);
        assertTrue(CommonMethod.verifyElementsPesent(webPageElement, driver), "Address not added");
        if (CommonMethod.ButtonEnableOrNot(addressUpdateButton, driver) && (CommonMethod.ButtonEnableOrNot(addressDeleteButton, driver)) && (CommonMethod.ButtonEnableOrNot(addNewAddressButton, driver))) {
            //  CommonMethod.click(addressDeleteButton,driver);
            //  Alert alert = driver.switchTo().alert();
            //  alert.accept(); // or alert.dismiss(), alert.getText()
            System.out.println("Button are enable");

        } else {
            System.out.println("Button are not Functional");
        }

CommonMethod.click(backToAccount, driver);
    }


}
