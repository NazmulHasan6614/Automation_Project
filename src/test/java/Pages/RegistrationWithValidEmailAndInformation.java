package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ObjectRepository.AutomationPracticeRegistrationPageObject.*;
import static org.testng.Assert.assertTrue;




public class RegistrationWithValidEmailAndInformation {

    public void inputValidEmailAndPersonalInformation(WebDriver driver) {
        CommonMethod.sendData(Email_Field, driver, mail);
        CommonMethod.click(Create_Account_Button,driver);

        if (!CommonMethod.verifyElementIsSelected(radioButton1,driver)&&(!CommonMethod.verifyElementIsSelected(radioButton2,driver)))
        {
            CommonMethod.click(radioButton1,driver);
        }

        else
        {
            System.out.println("Both selected");
        }

        assertTrue(CommonMethod.verifyElementsPesent(firstName,driver));
        assertTrue(CommonMethod.verifyElementsPesent(lastName,driver));
        if (!CommonMethod.verifyElementIsSelected(checkBox,driver))
        {
            CommonMethod.click(checkBox,driver);
        }
        else
        {
            System.out.println("Selected");
        }
        assertTrue(CommonMethod.ButtonEnableOrNot(regiButton,driver));
        CommonMethod.sendData(firstName,driver,nameOne);
        CommonMethod.sendData(lastName,driver,nameTwo);
        CommonMethod.sendData(Paass_Field,driver,passWord);
        CommonMethod.click(day,driver);
        CommonMethod.sendData(day,driver,textOne);
        CommonMethod.pressEnter(day,driver);
        CommonMethod.sendData(month,driver,textTwo);
        CommonMethod.pressEnter(month,driver);
        CommonMethod.sendData(year,driver,textThree);
        CommonMethod.pressEnter(year,driver);

        CommonMethod.click(regiButton,driver);
        String expectedUrl="http://www.automationpractice.pl/index.php?controller=my-account";
        String actualUrl=CommonMethod.findCurrentURL(regiButton,driver);
        Assert.assertEquals(expectedUrl,actualUrl,"Registration Failed");
        CommonMethod.click(logOut,driver);
    }


}
