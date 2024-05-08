package Tests;

import Pages.ProceedToCheckOutPage;
import org.testng.annotations.Test;

public class CheckOutPageTest extends Base{
    ProceedToCheckOutPage
    checkOutObject=new ProceedToCheckOutPage();
    @Test
    public void checkOutCheck()
    {
        checkOutObject.proceedToCheckOut(driver);
    }
    @Test
    public void checkAddress()
    {
        checkOutObject.proceedToAddress(driver);
    }
    @Test
    public void checkShipping()
    {
        checkOutObject.ProceedToShipping(driver);
    }
    @Test
    public void checkPayment()
    {
        checkOutObject.ProceedToPayment(driver);
    }
    @Test
    public void deletingAddress()
    {
        checkOutObject.deleteAddress(driver);
    }
}
