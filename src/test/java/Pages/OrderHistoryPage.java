package Pages;

import Library.CommonMethod;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.OrderHistoryAndCreditSlipPageObject.*;
import static org.testng.Assert.assertTrue;

public class OrderHistoryPage {





    public  void testingOrderHistory(WebDriver driver)
    {
        CommonMethod.click(orderHistory,driver);
        if (CommonMethod.messageDisply(orderDetails,driver)) {
            assertTrue(CommonMethod.messageDisply(orderDetails, driver), "There is no order History");

        }
        else
        {
            if (CommonMethod.messageDisply(alertMessage,driver))
            System.out.println("No order History Found");

        }
        CommonMethod.click(backToAccount, driver);

    }
}

