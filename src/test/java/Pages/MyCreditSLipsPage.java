package Pages;

import Library.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.MyCreditSLipsPageObject.*;

public class MyCreditSLipsPage {

    public void creditSlips(WebDriver driver)
    {
        CommonMethod.click(clickCreditSlips,driver);
        if (CommonMethod.messageDisply(warningMessage,driver))
        {
            System.out.println("You have not received any credit slips");
        }
        else
        {
            System.out.println("Show credit slips destils");
        }
        CommonMethod.click(backToHome,driver);
    }
}
