package Tests;

import Pages.LogInWithValidCredentials;
import Pages.MyCreditSLipsPage;
import Pages.OrderHistoryPage;
import org.testng.annotations.Test;

public class TC006OrderHistoryAndCreditSlipTest extends Base{
    OrderHistoryPage
    orderHistoryObject=new OrderHistoryPage();
    MyCreditSLipsPage
            creditSLipObject=new MyCreditSLipsPage();
    LogInWithValidCredentials
            validObject=new LogInWithValidCredentials();
    @Test(priority = 1)
    public void validInput()
    {

        validObject.loginWithValidInput(driver);

    }
    @Test(priority = 2)
    public void orderHistoryTest()
    {
        orderHistoryObject.testingOrderHistory(driver);
    }
    @Test(priority = 3)
    public void creditSlipTestCase()
    {
        creditSLipObject.creditSlips(driver);
    }
}

