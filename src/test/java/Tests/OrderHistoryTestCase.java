package Tests;

import Pages.OrderHistoryPage;
import org.testng.annotations.Test;

public class OrderHistoryTestCase extends Base{
    OrderHistoryPage
    orderHistoryObject=new OrderHistoryPage();
    @Test
    public void orderHistoryTest()
    {
        orderHistoryObject.testingOrderHistory(driver);
    }
}
