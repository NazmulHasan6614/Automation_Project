package Pages;

import Library.CommonMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.FirstAddressPageObject.*;
import static ObjectRepository.FirstAddressPageObject.saveButton;
import static ObjectRepository.ProceedToCheckOutPageObject.*;
import static org.testng.Assert.assertTrue;

public class ProceedToCheckOutPage {

    public void proceedToCheckOut(WebDriver driver) {
        CommonMethod.click(addToCartButton, driver);
        CommonMethod.click(checkOut, driver);
        assertTrue(CommonMethod.verifyElementsPesent(cartSmmary, driver), "No cart Summary");
        CommonMethod.click(proceedToSignIn, driver);
        // assertTrue(CommonMethod.verifyElementsPesent(deliveryAddress,driver),"Summary and sign in are not completed");

    }

    public void proceedToAddress(WebDriver driver) {
        if (CommonMethod.verifyElementIsSelected(checkbox, driver)) {

            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
        }
        assertTrue(CommonMethod.verifyElementsPesent(pageElement, driver), "There is no address for shipping");

    }

    public void ProceedToShipping(WebDriver driver) {
        CommonMethod.click(goingToShipping, driver);
        CommonMethod.click(goingToPayment, driver);
        if (CommonMethod.messageDisply(fancyBoxError, driver)) {
            CommonMethod.click(crossIcon, driver);
            System.out.println("Error is appearing expectedly");
        } else {
            System.out.println("There is a bug");
        }
        if (!CommonMethod.verifyElementIsSelected(termBox, driver)) {

            CommonMethod.click(termBox, driver);
        }
        assertTrue(CommonMethod.verifyElementsPesent(textOnpage, driver), "Product can not be shipped");

    }

    public void ProceedToPayment(WebDriver driver) {
        CommonMethod.click(goingToPayment, driver);
        CommonMethod.click(payByBank, driver);
        CommonMethod.waitForElementVisibility(bankWirePayment, driver);
        assertTrue(CommonMethod.verifyElementsPesent(bankWirePayment, driver), "Bank payment not available");
        driver.navigate().back();
        CommonMethod.click(payByCheck, driver);
        assertTrue(CommonMethod.verifyElementsPesent(checkPayment, driver), "Check payment not ready");
        CommonMethod.click(orderConfirmButton, driver);
        assertTrue(CommonMethod.messageDisply(getOrderConfirmedMessage, driver), "Order can not be placed");

    }

    public void deleteAddress(WebDriver driver) {
        CommonMethod.click(name, driver);
        CommonMethod.click(myaddress, driver);
        CommonMethod.click(deleteButton, driver);
        Alert alert = driver.switchTo().alert();
        alert.accept(); // or alert.dismiss(), alert.getText()
    }

    public void inputAddressForCheckOut(WebDriver driver) {

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
    }
}
